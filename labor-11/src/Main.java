import lab11_2.InvalidDate;
import lab11_4.ExpressionException;
import lab11_4.IExpression;
import oop.labor02.Datum;


import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;


public class Main {

    public static void evaluate(String line){

    }
    public static void main(String[] args) {
/*
        double sum=0;
        try(Scanner scanner = new Scanner(System.in)){
            String line=scanner.nextLine();
            for (String v:
                 line.split(" ")) {
                try{
                    sum+=Double.parseDouble(v.trim());
                }catch(NumberFormatException ignore){
                }


            }
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println(sum);*/
        //FileToFile("students.csv","warning.csv");
        String expressions[] = {
                "1 2 + 3 2 + * ",
                "1 2 + +",
                "1 a +",
                "1 2,3 *",
                "1 3 /" };
        for( String expr: expressions ) {
            try {
                System.out.println("Eval(" + expr + "): " +
                        IExpression.evaluate(expr));
            } catch (ExpressionException e) {
                System.out.println("Wrong expression: " + expr);
                System.out.println("\t" + e.getMessage());
            }
            catch(NumberFormatException ignore){}
        }

    }
    public static void FileToFile(String source, String finale){
        String NeptunId,fName,lName;
        int credits, birthYear,birthMonth,birthDay;

        try(Scanner sc = new Scanner(new File(source))){
            String ln;
            while(sc.hasNextLine()){
                ln=sc.nextLine();
                String data[];
                data=ln.split("");
                NeptunId=data[0];
                fName=data[1];
                lName=data[2];
                try {
                    data[3].trim();
                    data[4].trim();
                    data[5].trim();
                    data[6].trim();
                    credits = Integer.parseInt(data[3]);
                    birthYear = Integer.parseInt(data[4]);
                    birthMonth = Integer.parseInt(data[5]);
                    birthDay = Integer.parseInt(data[6]);
                    if(Datum.helyesDatum(birthYear,birthMonth,birthDay))throw new InvalidDate("INVALID DATE");


                    try(FileWriter e = new FileWriter(finale)){
                        if(credits<30)e.write(ln);
                    }catch(Exception ignore){}

                }catch(NumberFormatException e){
                    System.out.println("NUMBER FORMAT EXCEPTION");
                }
                catch(InvalidDate e){
                    System.out.println("INVALID DATE EXCEPTION");
                }



            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

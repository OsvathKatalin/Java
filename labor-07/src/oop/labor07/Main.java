package oop.labor07;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Hallgato hallgato = new Hallgato("Peter", "Akos");
        hallgato.ujBejegyzes( new Jegy("Matek", 10));
        hallgato.ujBejegyzes( new Jegy("Matek", 8));
        hallgato.ujBejegyzes( new Jegy("Roman", 7));
        hallgato.ujBejegyzes( new Jegy("Roman", 8));
        hallgato.ujBejegyzes( new Jegy("Magyar", 9));
//        hallgato.listazas();
        Naplo naplo = new Naplo("hallgatok.csv");
//        naplo.listazNevek();
        //System.out.println(hallgato.getTantargyak());
//        try(Scanner scanner=new Scanner(new File("jegyek.csv")))
//        {
//            while (scanner.hasNextLine())
//            {
//                String line= scanner.nextLine();
//                String[] data=line.split(",");
//                Jegy jegy= new Jegy(data[1].trim(),Integer.parseInt(data[2].trim()));
//                naplo.ujJegy(Integer.parseInt(data[0].trim()),jegy);
//            }
//        }
//        catch (IOException e)
//        {
//            System.out.println(e.getStackTrace());
//        }
//        naplo.listazHallgatoiAdatok();
        hallgato.listazas();
    }
}

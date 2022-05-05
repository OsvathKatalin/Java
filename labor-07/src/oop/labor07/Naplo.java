package oop.labor07;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Naplo {
    private final ArrayList<Hallgato> hallgatok=new ArrayList<>();

    public Naplo(String filename)
    {
        try(Scanner scanner= new Scanner(new File(filename)))
        {
            while (scanner.hasNextLine())
            {
                String line= scanner.nextLine();
                String[] data= line.split(",");
                hallgatok.add(new Hallgato(data[0].trim(), data[1].trim()));
            }
        }
        catch (IOException e)
        {
            System.out.println(e.getStackTrace());
        }
    }

    public void listazNevek()
    {
        for (Hallgato i: hallgatok) {
            System.out.println(i.getID()+"."+i.getVezeteknev()+" "+i.getKeresztnev());
        }
    }

    public void ujJegy(int ID, Jegy jegy)
    {
        for (Hallgato i: hallgatok) {
            if(i.getID()==ID)
            {
                i.ujBejegyzes(jegy);
                return;
            }
        }
    }

    public void listazHallgatoiAdatok()
    {
        for (Hallgato i: hallgatok) {
            i.listazas();
        }
    }
}

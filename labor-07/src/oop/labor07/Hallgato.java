package oop.labor07;

import java.util.ArrayList;

public class Hallgato {
    private final int ID;
    private final String vezeteknev;
    private final String keresztnev;
    private final ArrayList<Jegy> jegyek = new ArrayList<>();
    private static int nextID=0;

    public Hallgato(String vezeteknev, String keresztnev) {
        this.ID = nextID++;
        this.vezeteknev = vezeteknev;
        this.keresztnev = keresztnev;
    }

    public int getID() {
        return ID;
    }

    public String getVezeteknev() {
        return vezeteknev;
    }

    public String getKeresztnev() {
        return keresztnev;
    }

    public void ujBejegyzes(Jegy jegy)
    {
        jegyek.add(jegy);
    }

    public double tantargyAtlag(String nev)
    {
        double atlag=0;
        int nr=0;
        for (Jegy i: jegyek) {
            if(i.getNev().equals(nev))
            {
                atlag+= i.getJegy();
                nr++;
            }
        }
        if(atlag!=0)
            return atlag/nr;
        return 0;
    }

    public ArrayList<String> getTantargyak() {
        ArrayList<String> targyak = new ArrayList<>();
        for (Jegy i: jegyek) {
            if(!targyak.contains(i.getNev()))
                targyak.add(i.getNev());
        }
        return targyak;
    }

    public void listazas()
    {
        System.out.println(vezeteknev+' '+keresztnev);
        ArrayList<String> aux= new ArrayList<>();
        for (Jegy i: jegyek) {
            if(!aux.contains(i.getNev()))
            {
                aux.add(i.getNev());
                System.out.println("\t"+i.getNev()+':'+tantargyAtlag(i.getNev()));
            }
        }
    }
}

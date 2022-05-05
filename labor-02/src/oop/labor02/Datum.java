package oop.labor02;

public class Datum {
    private int ev, ho, nap;

    public static boolean helyesDatum(int ev, int ho, int nap) {
        if (ev < 0)
            return false;
        if (ho < 1 || ho > 12)
            return false;
        if ((ho == 1 || ho == 3 || ho == 5 || ho == 7 || ho == 8 || ho == 10 || ho == 12) && (nap < 1 || nap > 31))
            return false;
        else if ((ho == 4 || ho == 6 || ho == 9 || ho == 11) && (nap < 1 || nap > 30))
            return false;
        else if(ho==2 && (nap<1 || nap>28) && !szokoEv(ev))
            return false;
        else if(ho==2 && (nap<1 || nap>29) && szokoEv(ev))
            return false;
        return true;
    }

    public static boolean szokoEv(int ev) {
        if (ev % 4 == 0 && ev % 100!=0)
            return true;
        else if(ev % 400 ==0)
            return true;
        else
            return false;
    }

    public int getEv()
    {
        return ev;
    }

    public int getHo()
    {
        return ho;
    }

    public int getNap()
    {
        return nap;
    }

    //Konstruktor
    public Datum(int pev, int pho, int pnap) {
        if (helyesDatum(pev, pho, pnap)) {
            ev = pev;
            ho = pho;
            nap = pnap;
        }
    }
}

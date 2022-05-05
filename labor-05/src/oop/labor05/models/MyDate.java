package oop.labor05.models;

public class MyDate {
    private int ev, ho, nap;

    public MyDate(int pev, int pho, int pnap) {
        if (helyesDatum(pev, pho, pnap)) {
            ev = pev;
            ho = pho;
            nap = pnap;
        }
    }

    public static boolean helyesDatum(int ev, int ho, int nap) {
        if(ev<0 || ev>8500)
            return false;
        if(ho<1 || ho>12)
            return false;
        int[] napok={31,szokoEv(ev)?29:28,31,30,31,30,31,31,30,31,30,31};
        return !(nap<1 || nap>napok[ho-1]);
    }
        public static boolean szokoEv( int ev){
            if ((ev % 4==0 && ev%100!=0) || ev%400==0)
                return true;
            else return false;
        }
        public  int getEv()
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
       public String toString()
       {
           return ev+"/"+ho+"/"+nap;
       }
    }

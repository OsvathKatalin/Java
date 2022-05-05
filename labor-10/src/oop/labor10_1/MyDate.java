package oop.labor10_1;

public class MyDate implements Comparable<MyDate>{
    private int ev, ho, nap;

    public MyDate(int pev, int pho, int pnap) {
        if (helyesDatum(pev, pho, pnap)) {
            ev = pev;
            ho = pho;
            nap = pnap;
        }
    }

    public boolean helyesDatum(int ev, int ho, int nap) {
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

    @Override
    public int compareTo(MyDate o) {
        int cmp=Integer.compare(this.ev,o.ev);
        if(cmp!=0)
            return cmp;
        cmp=Integer.compare(this.ho,o.ho);
        if(cmp!=0)
            return cmp;
        return Integer.compare(this.nap,o.nap);
    }
}

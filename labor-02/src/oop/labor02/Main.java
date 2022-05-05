package oop.labor02;

public class Main {

    public static void main(String[] args)
    {
        Bankszamla szamla = new Bankszamla(1000);
        System.out.println( szamla.getEgyenleg() );
        szamla.betesz( 500 );
        for(int i=0;i<2;i++)
        {
            if(!szamla.kivesz(2000))
                System.out.print("Tul nagy osszeget adott meg!\n");
            System.out.println( szamla.getEgyenleg() );
        }
        System.out.println(" ");
        Auto auto = new Auto("kek");
        System.out.println( auto.toString() );
        for(int i=0;i<12;i++)
            auto.novelSebesseg();
        System.out.println( auto.getSebesseg() );
        Auto auto2 = new Auto("sarga");
        for(int i=0;i<6;i++)
            auto2.novelSebesseg();
        System.out.println( auto2.toString() );
        System.out.println(" ");
        Datum date= new Datum(1976,2,28);
        if(date.getEv()==0 && date.getHo()==0 && date.getNap()==0)
            System.out.print("Hibas adatokat adott meg!");
        else
        {
            System.out.println(date.getEv());
            System.out.println(date.getHo());
            System.out.println(date.getNap());
        }
    }
}

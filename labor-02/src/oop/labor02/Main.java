package oop.labor02;

public class Main {
    public static void main(String[] args) {
        Bankszamla szamla= new Bankszamla(1000);
      //  Bankszamla szamla2= new Bankszamla(1080);

        System.out.println(szamla.getEgyenleg());
        //System.out.println(szamla2.getEgyenleg());
        szamla.betesz(500);

        szamla.kivesz(2000);
        System.out.println(szamla.getEgyenleg());
        szamla.kivesz(2000);
        System.out.println(szamla.getEgyenleg());
    }

}

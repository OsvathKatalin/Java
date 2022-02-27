package oop.labor02;

public class Bankszamla {
    private double egyenleg;

    public Bankszamla(double osszeg){
        egyenleg=osszeg;
    }
    public void betesz(double osszeg){
        egyenleg += osszeg;
    }
    public boolean kivesz(double osszeg){
        if( osszeg<=egyenleg){
            egyenleg-=osszeg;
            return true;
        }
        System.out.println("Nincs elegendo penz!");
        return false;
    }
    public double getEgyenleg(){
        return egyenleg;
    }
}

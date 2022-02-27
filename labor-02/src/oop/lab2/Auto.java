package oop.lab2;


public class Auto {
    private String szin="FEHER";
    private int sebesseg=0;


    public Auto(String szin){
        this.szin=szin;
    }
    public int getSebesseg(){
        return sebesseg;
    }

    public void novelSebesseg(int plusz){
        this.sebesseg = this.sebesseg + plusz;
    }

    public String toString(){
        return this.szin+" "+this.sebesseg;
    }
}

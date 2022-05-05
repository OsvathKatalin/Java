package oop.labor07;

public class Jegy {
    private final String nev;
    private final int jegy;

    public Jegy(String nev, int jegy) {
        this.nev = nev;
        this.jegy = jegy;
    }

    public String getNev() {
        return nev;
    }

    public int getJegy() {
        return jegy;
    }

    @Override
    public String toString() {
        return "Jegy{" +
                "nev='" + nev + '\'' +
                ", jegy=" + jegy +
                '}';
    }
}

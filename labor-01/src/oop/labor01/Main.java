package oop.labor01;

public class Main {
    public static void main(String[] args) {
        System.out.println("Kelemen Daniel");

        String nev = "Kelemen Daniel";
        for (int i = 0; i < nev.length(); ++i) {
            System.out.println(nev.charAt(i));
        }
        String monogram = "K" + "D";
        System.out.println(monogram);
        String szopiramis="ALMAFA";
        for(int i=0;i<szopiramis.length();i++)
        {
            for(int j=0;j<=i;j++)
                System.out.print(szopiramis.charAt(j));
            System.out.println(" ");
        }
        String nev2="Kerekes Balint Adam Jozsef";
        String[] nevek=nev2.split(" ");
        for(int i=0;i<nevek.length;i++)
            System.out.print(nevek[i].charAt(0));
        System.out.println(" ");
    }
}

package oop.date;

public class Main {
    public static void main(String[] args) {
    Datum datum=new Datum(2001,5,6);
        System.out.println(datum.getYear());
        System.out.println(datum.getMonth());
        System.out.println(datum.getDay());
    }
}

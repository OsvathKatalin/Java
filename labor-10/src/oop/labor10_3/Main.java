package oop.labor10_3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Storage storage=new Storage("data10.txt");
        System.out.println(storage);
        storage.update("update10.txt");
        System.out.println(storage);

    }
}

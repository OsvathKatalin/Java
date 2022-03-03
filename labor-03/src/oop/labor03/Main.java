package oop.labor03;

public class Main {
    public static void main(String[] args) {
        Costumer costumer1= new Costumer("John","BLACk",null);

        System.out.println(costumer1);
        costumer1.setAccount(new BankAccount(0));
        costumer1.getAccount().setAccountNumber("OTP00001");
        costumer1.getAccount().betesz(1000);
        System.out.println(costumer1);

        Costumer costumer2= new Costumer("Mary", "WHITE", null);
        costumer2.setAccount(new BankAccount(0));
        costumer2.getAccount().setAccountNumber("OTP00002");
        System.out.println(costumer2);

    }

}

package oop.labor08.lab8_1;

public class Main {
    public static void main(String[] args) {
        Bank OTP = new Bank("OTP");
        OTP.addCustomer(new Customer("Attila","Zsigmond"));
        OTP.addCustomer(new Customer("Attila","Izsak"));
        OTP.getCustomer(1).addAccount(new SavingsAccount(1000)); //letet
        OTP.getCustomer(1).addAccount(new CheckingAccount(2000)); //hitel
        OTP.getCustomer(2).addAccount(new SavingsAccount(1000));
        OTP.getCustomer(2).addAccount(new CheckingAccount(2000));
        OTP.getCustomer(1).getAccount("OTP0000001").deposit(15000);
        OTP.getCustomer(1).getAccount("OTP0000002").deposit(2000);
        OTP.getCustomer(2).getAccount("OTP0000003").deposit(15100);
        OTP.getCustomer(2).getAccount("OTP0000004").deposit(3000);
        OTP.printCustomersToStdout();
    }
}

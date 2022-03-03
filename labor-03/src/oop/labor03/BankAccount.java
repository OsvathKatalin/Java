package oop.labor03;

public class BankAccount {

    private double egyenleg;
    private String accountNumber;

    public BankAccount(double osszeg){
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
        return false;
    }
    public double getEgyenleg(){
        return egyenleg;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "egyenleg=" + egyenleg +
                ", accountNumber='" + accountNumber + '\'' +
                '}';
    }

}

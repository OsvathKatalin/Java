package oop.labor03;

public class Costumer {

    private String firstName;
    private String lastName;
    private BankAccount account;

    public Costumer(String firstName, String lastName, BankAccount account) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.account = account;
    }

    public void setAccount(BankAccount account) {
        this.account = account;
    }

    public BankAccount getAccount() {
        return account;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void closeAccount(){
        this.account=null;
    }

    @Override
    public String toString() {
        return "Costumer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", account=" + account +
                '}';
    }


}

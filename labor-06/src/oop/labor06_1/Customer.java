package oop.labor06_1;

import java.util.ArrayList;

public class Customer
{
        private String firstName;
        private String lastName;
        private ArrayList<BankAccount> accounts = new ArrayList<>();
        private final int id;
        private static int newCustomer=0;

        public Customer(String fName, String lName)
            {
                firstName=fName;
                lastName=lName;
                id=++newCustomer;
            }

        public void addAccount( BankAccount account)
        {
            accounts.add(account);
        }

        public BankAccount getAccount(String accountNumber)
        {
            for (BankAccount account : accounts)
            {
                if(accountNumber.equals(account.getAccountNumber()))
                    return account;
            }
            return null;
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

        public void closeAccount(String accountNumber)
        {
            for (BankAccount account : accounts)
            {
                if(accountNumber.equals(account.getAccountNumber()))
                    accounts.remove(accountNumber);
            }
        }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", accounts=" + accounts +
                ", id=" + id +
                '}';
    }

    public int getNumAccounts() {
            return accounts.size();
        }

    public int getId() {
        return id;
    }

    public ArrayList<String> getAccountNumbers()
    {
        ArrayList<String> result= new ArrayList<>();
        for (BankAccount account :
             accounts) {
            result.add(account.getAccountNumber());
        }
        return result;
    }
}
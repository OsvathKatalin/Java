package lab4_2;

import java.util.ArrayList;

public class Customer
{
        private String firstName;
        private String lastName;
        private ArrayList<BankAccount> accounts = new ArrayList<>();

        public Customer(String fName, String lName)
            {
                firstName=fName;
                lastName=lName;
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
        return firstName + " " + lastName + " accounts:" +
                "\n" + accounts + "\n";
    }

    public int getNumAccounts() {
            return accounts.size();
        }
}
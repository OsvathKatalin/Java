package labor03_2;

import labor03_1.BankAccount;

public class Customer
{
        public static final int MAX_ACCOUNTS = 10;
        private String firstName;
        private String lastName;
        private BankAccount account;
        private int numAccounts;
        private BankAccount accounts[] = new BankAccount[ MAX_ACCOUNTS ];

        public Customer(String fName, String lName)
            {
                firstName=fName;
                lastName=lName;
            }

        public void addAccount( BankAccount account)
        {
            if(this.numAccounts<=MAX_ACCOUNTS)
            {
                accounts[numAccounts++]=account;
            }
        }

        public BankAccount getAccount(String accountNumber)
        {
            for(int i=0;i<numAccounts;i++)
            {
                if(accounts[i].getAccountNumber().equals(accountNumber))
                    return accounts[i];
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

        public void closeAccount(int accountNumber)
        {
            if(accountNumber<numAccounts)
            {
                for(int i=accountNumber;i<numAccounts-1;i++)
                {
                    this.accounts[i]=this.accounts[i+1];
                }
                numAccounts--;
            }
            else System.out.print("Account number not existent!\n");
        }

        @Override
        public String toString() {
            StringBuffer result = new StringBuffer();
            result.append(firstName + ' ' + lastName + " accounts:\n");
            for(int i=0; i<numAccounts; ++i){
                result.append( "\t" + accounts[i].toString() +"\n");
            }
            return result.toString();
        }

        public int getNumAccounts() {
            return numAccounts;
        }
}
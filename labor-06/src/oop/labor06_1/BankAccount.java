package oop.labor06_1;

public class BankAccount
{
        private final String accountNumber;
        private double balance;
        public static final String PREFIX = "OTP";
        private static int numAccounts = 0;
        public static final int ACCOUNT_NUMBER_LENGTH = 10;
    public BankAccount() {
        ++numAccounts;
        this.accountNumber = createAccountNumber();
    }


    public void deposit( double sum ){
            balance += sum;
        }

        public boolean withdraw( double sum ){
            if( sum <= balance ){
                balance -= sum;
                return true;
            }
            return false;
        }

        public double getBalance(){
            return balance;
        }

        public String getAccountNumber(){
            return accountNumber;
        }

        @Override
        public String toString() {
            return "BankAccount: {accountNumber:" + accountNumber +
                    ", balance=" + balance +
                    "}\n";
        }
    private static String createAccountNumber()
    {
        int len=ACCOUNT_NUMBER_LENGTH-PREFIX.length();
        return String.format("%s%0"+len+"d", PREFIX, numAccounts);
    }

}

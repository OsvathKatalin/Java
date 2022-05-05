package lab4_2;

public class BankAccount
{
        private final String accountNumber;
        private double balance;

        public BankAccount(String accountNum){
            accountNumber=accountNum;
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
}

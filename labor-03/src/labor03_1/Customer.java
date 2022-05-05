package labor03_1;

public class Customer
{
        private String firstName;
        private String lastName;
        private BankAccount account;

        public Customer(String fName, String lName)
        {
                firstName=fName;
                lastName=lName;
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

        public void closeAccount()
        {
                this.account=null;
        }

        @Override
        public String toString() {
                return "Customer{" +
                        "firstName='" + firstName + '\'' +
                        ", lastName='" + lastName + '\'' +
                        ", account=" + account +
                        '}';
        }
}

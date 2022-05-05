package oop.labor06_1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<BankAccount> accounts= new ArrayList<>();
        for (int i=0;i<150;i++)
        {
            accounts.add(new BankAccount());
        }
        for (BankAccount account:
             accounts) {
            System.out.println(account);
        }

        ArrayList<Customer> customers= new ArrayList<>();
        customers.add(new Customer("Kaffai", "Levente"));
        customers.add(new Customer("Gall", "Benedek"));
        customers.add(new Customer("Kelemen", "Daniel"));
        for (Customer customer:
             customers) {
            customer.addAccount(new BankAccount());
            System.out.println(customer);
        }

        Bank bank= new Bank("OTP");
        customers.get(0).addAccount(new BankAccount());
        customers.get(1).addAccount(new BankAccount());
        bank.addCustomer(customers.get(0));
        bank.addCustomer(customers.get(1));
        System.out.println(bank.getCustomer(1));
        bank.getCustomer(1).getAccount(bank.getCustomer(1).getAccountNumbers().get(0)).deposit(1000);
        bank.getCustomer(1).getAccount(bank.getCustomer(1).getAccountNumbers().get(1)).deposit(1500);
        bank.getCustomer(2).getAccount(bank.getCustomer(2).getAccountNumbers().get(0)).deposit(2000);
        bank.getCustomer(2).getAccount(bank.getCustomer(2).getAccountNumbers().get(1)).deposit(2500);
        System.out.println(bank.getCustomer(2));
        bank.printCustomersToFile("bank_customers.csv");
    }
}

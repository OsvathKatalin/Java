package oop.labor08.lab8_1;

import java.io.PrintStream;
import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> customers;

    public Bank(String name)
    {
        this.name=name;
        customers=new ArrayList<>();
    }

    public Customer getCustomer( int customerId )
    {
        for (Customer customer: customers) {
            if(customer.getId() == customerId)
                return customer;

        }
        System.out.println("Customer not found!");
        return null;
    }

    private void printCustomers( PrintStream ps ) {
        ps.println("ID, Firstname, Last name, Number of bank accounts");
        for (Customer customer : customers) {
            ps.println(customer.getId() + ", " + customer.getFirstName() + ", " +
                    customer.getLastName() + ", " + customer.getNumAccounts());
            for(BankAccount a:customer.getAccounts()){
                System.out.println("\t" + a);
            }
        }
    }

    public void printCustomersToStdout(){
        printCustomers( System.out );
    }

    public void printCustomersToFile( String filename ){
        try {
            printCustomers( new PrintStream(filename ));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addCustomer(Customer customer)
    {
        customers.add(customer);
    }
    public int numCustomers()
    {
        return customers.size();
    }
}

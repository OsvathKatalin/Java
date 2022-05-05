package lab4_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Customer> customers= new ArrayList<>();
        customers=readFromFile("lab4_2_input.txt");
        System.out.println(customers);
    }

    public static ArrayList<Customer> readFromFile(String fileName)
    {
        ArrayList<Customer> customers= new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(fileName)))
        {
            while (scanner.hasNextLine())
            {
                String line = scanner.nextLine();
                if (line.isEmpty())
                {
                    continue;
                }
                String[] items = line.split(",");
                // trim: eliminates leading and trailing spaces
                if(items[0].trim().equals("Customer"))
                {
                    Customer customer= new Customer(items[1].trim(), items[2].trim());
                    customers.add(customer);
                }
                else if(items[0].trim().equals("Account"))
                {
                    BankAccount account=new BankAccount(items[1].trim());
                    account.deposit(Double.parseDouble(items[2].trim()));
                    customers.get(customers.size()-1).addAccount(account);
                }
            }
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        return customers;
    }

}

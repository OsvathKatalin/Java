package labor03_2;

import labor03_1.BankAccount;

import java.lang.Math;

public class Main
{
    public static void main(String[] args)
    {
        Customer customer1= new Customer("John", "BLACK");
        Customer customer2= new Customer("Mary", "WHITE");
        for(int i=1;i<6;i++)
        {
            customer1.addAccount(new BankAccount("OTP0000"+i));
            customer1.getAccount("OTP0000"+i).deposit((Math.random()*(1000000)));
        }
        for(int i=6;i<15;i++)
        {
            customer2.addAccount(new BankAccount("OTP0000"+i));
            customer2.getAccount("OTP0000"+i).deposit((Math.random()*(1000000)));
        }
        System.out.println(customer1);
        System.out.println(customer2);
        customer1.closeAccount(0);
        customer2.closeAccount(8);
        System.out.println(customer1);
        System.out.println(customer2);
    }
}

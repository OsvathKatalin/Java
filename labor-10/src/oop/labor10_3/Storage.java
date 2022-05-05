package oop.labor10_3;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Storage {
    private ArrayList<Product> products;

    public Storage(String fileName) {
        products=new ArrayList<>();
        try(Scanner scanner=new Scanner(new File(fileName)))
        {
            while (scanner.hasNextLine())
            {
                String line= scanner.nextLine();
                String[] data=line.split(" ");
                Product product=new Product(Integer.parseInt(data[0].trim()),Integer.parseInt(data[2].trim()),Integer.parseInt(data[3].trim()), data[1].trim());
                products.add(product);
            }
        }
        catch (IOException e)
        {
            System.out.println(e.getStackTrace());
        }
    }

    public Product search(int id)
    {
        for (Product product:
                products) {
            if(product.getId()==id)
                return product;
        }
        return null;
    }

    public void update(String fileName)
    {
        int nb=0;
        try(Scanner scanner=new Scanner(new File(fileName)))
        {
            while (scanner.hasNextLine())
            {
                String line= scanner.nextLine();
                String[] data=line.split(" ");
                if(search(Integer.parseInt(data[0].trim()))!=null)
                {
                    search(Integer.parseInt(data[0].trim())).increaseAmount(Integer.parseInt(data[1].trim()));
                    nb++;
                }
            }
        }
        catch (IOException e)
        {
            System.out.println(e.getStackTrace());
        }
        System.out.printf("Products updated: %d\n", nb);
    }

    @Override
    public String toString() {
        return "Storage{" +
                "products=" + products +
                '}';
    }
}

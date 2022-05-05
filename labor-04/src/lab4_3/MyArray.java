package lab4_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class MyArray {

    private int lenght;
    private double[] elements;

    public MyArray(int lenght)
    {
        this.lenght=lenght;
    }

    public MyArray(MyArray array)
    {
        this.elements=array.elements;
    }

    public MyArray(double[] array)
    {
        this.elements=array;
    }

    public MyArray(String fileName)
    {
            try{
                Scanner scanner = new Scanner(new File(fileName));
                elements=new double[Integer.parseInt(scanner.nextLine())];
                for(int i=0;i<elements.length;i++)
                    elements[i]=scanner.nextDouble();


            }catch(FileNotFoundException e){
                e.printStackTrace();
            }
    }

    public void fillRandom(double min, double max)
    {
        if(elements==null)
            return ;
        int i;
        for(i=0;i<elements.length;i++)
        {
            elements[i]=(Math.random()*(max-min+1)+min);
        }
    }

    public double mean()
    {
        if(elements==null)
            return -1;
        double avg=0;
        for(int i=0;i<elements.length;i++)
        {
            avg+=this.elements[i];
        }
        return avg/elements.length;
    }

    public double stddev()
    {
        if(elements==null)
            return -1;
        double dev=0,avg=mean();
        int i;
        for (i=0;i<elements.length;i++)
        {
            dev=dev+(avg-elements[i])*(avg-elements[i]);
        }
        dev=dev/elements.length;
        return sqrt(dev);
    }

    public void sort()
    {
        if(elements==null)
            return ;
        Arrays.sort(elements);
    }
    public void print(String arrayName)
    {
        if(elements==null)
            return ;
        System.out.printf("%s :", arrayName);
        int i;
        if(elements!=null)
            for(i=0;i<elements.length;i++)
            {
                System.out.printf("%.2f  ", elements[i]);
            }
        System.out.printf("\n");
    }
}

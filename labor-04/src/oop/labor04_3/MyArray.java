package oop.labor04_3;

        import java.io.File;
        import java.io.FileNotFoundException;
        import java.util.Scanner;

public class MyArray {
    ///Fields
    private int lenght;
    private double[] elements;

    ///Constructors
    public MyArray(int lenght) {
        elements = new double[lenght];
        this.lenght=lenght;
    }

    public MyArray(double[] array) {
        elements = array;lenght= array.length;
    }

    public MyArray(MyArray myArray) {
        this.lenght = myArray.lenght;
        elements = new double[lenght];
        for (int i = 0; i < lenght; i++) {
            elements[i]= myArray.elements[i];
        }

    }

    public MyArray(String srcFile) {
        try (Scanner scanner = new Scanner(new File(srcFile))) {
            lenght = scanner.nextInt();
            elements = new double[lenght];
            for (int i = 0; i < lenght; i++) {
                elements[i] = scanner.nextDouble();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    ///Methods
    public void fillRandom(double min, double max) {
        for (int i = 0; i < lenght; i++) {
            elements[i] = Math.random() * (max - min-1) + min;
        }

    }

    public double mean() {
        double average = 0;
        for (int i = 0; i < lenght; i++) {
            average += elements[i];
        }
        return average / lenght;
    }

    public double stddev() {
        double average = mean();
        double deviation = 0;
        for (int i = 0; i < lenght; i++) {
            deviation += Math.pow(elements[i] - average, 2);
        }

        deviation/=lenght;
        deviation = Math.sqrt(deviation);
        return deviation;
    }

    public void sort() {
        boolean ok = true;
        int k = 1;
        while (ok) {
            ok = false;
            for (int i = 0; i < lenght - k; i++) {
                if (elements[i] > elements[i + 1]) {
                    double aux = elements[i];
                    elements[i] = elements[i + 1];
                    elements[i + 1] = aux;
                    ok = true;
                }
            }
            k++;
        }

    }

    public void print(String str) {
        System.out.print(str + ":\t");
        for (double element : elements) {
            System.out.print(element + "\t");
        }
        System.out.println();
    }


}

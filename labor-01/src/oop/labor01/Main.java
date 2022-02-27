package oop.labor01;

public class Main {

    public static void main(String[] args) {

        String a = "ALMAFA";
        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(a.charAt(j) + " ");
            }
            System.out.println();
        }
        System.out.println();


        String nev = "Kerekes Bálint Ádám József";
        String[] nevSplit = nev.split(" ");
        for (int i = 0; i < nevSplit.length; i++) {
            System.out.print(nevSplit[i].charAt(0));
        }
        System.out.println();
        System.out.println();

        double x[] = {7, 1, -3, 45, 9};
        System.out.printf("MAX: %6.2f\n", maxElement(x));
        System.out.println();

        double y[] = {1.11, 7.99, 51.69, -21.12};
        System.out.printf("Atlag: %3.2f\n", mean(y));
        System.out.println();

        double nums[] = {1, 19, -5, 1.21, -6.69, 0};
        System.out.printf("Szoras: %.4f\n", stddev(nums));

        System.out.printf("Egy egész szám adott sorszámú bitjének az értéke: %d\n", getBit(13,0));

    }


    public static double maxElement(double array[]) {
        double max = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < array.length; ++i) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static double mean(double array[]) {
        double mean = 0;
        double ossz = 0;
        for (int i = 0; i < array.length; i++) {
            ossz += array[i];
        }
        mean = ossz / array.length;
        if (ossz == 0) {
            return Double.NaN;
        }

        return mean;

    }

    public static double stddev(double array[]) {
        double sum = 0, standardDeviation = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double mean = sum / array.length;
        for (int i = 0; i < array.length; i++) {
            standardDeviation += Math.pow(array[i] - mean, 2);
        }
        if (sum == 0) {
            return Double.NaN;
        }

        return Math.sqrt(standardDeviation / array.length);
    }


    public static byte getBit(int number, int order) {
        if (order < 0 || order >= 32) {
            return -1;
        }
        return (byte) ((number >> order) & 1);
    }

    public static int countBits(int number) {
        int n = 0;
        while (number > 0) {
            n += number & 1;
            number >>= 1;
        }
        return n;
    }
}

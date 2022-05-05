package oop.labor01;


import static java.lang.Math.sqrt;

public class fuggvenyek {

    public static double maxElement( double[] array ){
        double max = Double.NEGATIVE_INFINITY;
        for( int i=0; i<array.length; ++i ){
            if( array[i] > max){
                max = array[ i ];
            }
        }
        return max;
    }

    public static byte getBit(int number, int order)
    {
        int szam=1;
        if(order > 31 || order<0)
            return -1;
        for(int i=0;i<order;i++)
            szam<<=1;
        if((number&szam)==0)
            return 0;
        return 1;
    }

    public static int countBits(int number)
    {
        int db=0;
        for(int i=0;i<=31;i++)
        {
            if((number&1)==1)
                db++;
            number>>=1;
        }
        return db;
    }

    public static double mean(double[] array)
    {
        float atlag=0;
        if(array.length==0)
            return Double.NaN;
        for(int i=0;i<array.length;i++)
            atlag+=array[i];
        return atlag/array.length;
    }

    public static double stddev(double[] array)
    {
        if(array.length==0)
            return Double.NaN;
        double atlag=mean(array),atlag2=0,seged;
        for(int i=0;i<array.length;i++)
        {
            seged=array[i]-atlag;
            atlag2=atlag2+(seged*seged);
        }
        atlag2=atlag2/array.length;
        return sqrt(atlag2);
    }

    public static double[] max2( double[] array ) {
        double[] max = {Double.NEGATIVE_INFINITY,
                Double.NEGATIVE_INFINITY};
        if (array.length == 0) {
            return max;
        }
        for(int i=0;i<array.length;i++)
        {
            if(array[i]>max[1])
            {
                max[0]=max[1];
                max[1]=array[i];
            }
            else if(array[i]>max[0])
                max[0]=array[i];
        }
        return max;
    }

    public static void main(String[] args) {
        double[] x ={7, 1, -3, 45, 9},max;
        System.out.printf("MAX: %6.2f\n", maxElement( x ));
        System.out.printf("Adott bit erteke: %d\n", getBit( 13,1));
        System.out.printf("Egyes bitek szama: %d\n", countBits( 13 ));
        System.out.printf("A tomb elemeinek atlaga: %f\n", mean( x ));
        System.out.printf("A tomb elemeinek szorasa: %f\n", stddev( x ));
        max=max2(x);
        for(int i=0;i<2;i++)
            System.out.printf("%f ", max[i]);
    }
}


package oop.labor06_2;

public class Matrix {

    private double[][] data;
    private int rows;
    private int columns;

    public Matrix(int rows, int columns)
    {
        this.rows=rows;
        this.columns=columns;
        data=new double[rows][columns];
    }
    public Matrix(double[][] data)
    {
        this.rows=data.length;
        this.columns=data[0].length;
        this.data=new double[rows][columns];
        this.data=data;
    }

    public Matrix(Matrix matrix)
    {
        this(matrix.data);
    }

    public void fillRandom(double start, double end)
    {
        for (int i=0;i<rows;i++)
            for (int j=0;j<columns;j++)
            {
                data[i][j]=Math.random()*((end - start +1)+start);
            }
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public void printMatrix()
    {
        if (data==null)
            return;
        int i,j;
        for(i=0;i<rows;i++)
        {
            for (j=0;j<columns;j++)
                System.out.printf("%.2f ", data[i][j]);
            System.out.println("");
        }
    }

    public static Matrix add(Matrix matrix1, Matrix matrix2)
    {
        if(!(matrix1.rows==matrix2.rows && matrix1.columns==matrix2.columns))return null;
        for(int i=0;i<matrix1.rows;i++){
            for(int j=0;j<matrix1.columns;j++)
                matrix1.data[i][j]+=matrix2.data[i][j];
        }
        return matrix1;
    }

    public static Matrix multiply(Matrix matrix1, Matrix matrix2){
        Matrix matrix;
        if(matrix1.columns==matrix2.rows){
            matrix = new Matrix(matrix1.rows,matrix2.columns);
            int i,j,k;
            for (i = 0; i < matrix1.rows; i++)
            {
                for (j = 0; j < matrix2.columns; j++)
                {
                    for (k = 0; k < matrix2.rows; k++)
                        matrix.data[i][j] += matrix2.data[i][k] * matrix2.data[k][j];
                }
            }
        }
        else matrix = null;
        return matrix;
    }

    public static Matrix transpose(Matrix matrix){
        Matrix result= new Matrix(matrix.columns,matrix.rows);
        for(int i=0;i<matrix.rows;i++){
            for(int j=0;j<matrix.columns;j++)
                result.data[j][i]=matrix.data[i][j];
        }
        return result;
    }
}

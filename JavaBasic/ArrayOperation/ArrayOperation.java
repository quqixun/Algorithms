/**
 * @source  Algorithms Fourth Edition
 * @title   Basic Operation on Array
 * @Chapter 1.1 Fundamentals - Programming Model
 */

import java.util.Arrays;

public class ArrayOperation
{
    // Return the maximum value of an array
    public static double max(double[] a)
    {
        double max = a[0];
        
        for (int i = 1; i < a.length; i++)
            if (a[i] > max) max = a[i];
        
        return max;
    }
    
    // Return mean value of an array
    public static double mean(double[] a)
    {
        int N = a.length;
        double sum = 0.0;
        
        for (int i = 0; i < N; i++)
            sum += a[i];
        double mean = sum / N;
        
        return mean;
    }
    
    // Copy the input array
    public static double[] copy(double[] a)
    {
        int N = a.length;
        double[] b = new double[N];
        
        for (int i = 0; i < N; i++)
            b[i] = a[i];
        
        return b;
    }
    
    // Return the inverse array of a
    public static double[] inverse(double[] a)
    {
        int N = a.length;
        double[] inverse = new double[N];
        
        for (int i = 0; i < N/2; i++)
        {
            double temp = a[i];
            inverse[i] = a[N-1-i];
            inverse[N-1-i] = temp;
        }
        
        return inverse;
    }
    
    // Multiply two square matrices
    public static double[][] multiply(double[][]a, double[][] b)
    {
        int N = a.length;
        double[][] c = new double[N][N];
        
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                for (int k = 0; k < N; k++)
                    c[i][j] += a[i][k] * b[k][j];
        
        return c;
    }
    
    public static void main(String[] args)
    {
        // Array a
        double[] a = {2.4, 5.7, 6.1, 3.0, 8.9, 1.4, 0.2, 9.7};
        
        // Find the maximum value of a
        double a_max = max(a);
        System.out.println(a_max);
        
        //Find the mean value of a
        double a_mean = mean(a);
        System.out.println(a_mean);
        
        // Make a copy of a
        double[] b = copy(a);
        System.out.println(Arrays.toString(b));
        
        // Invert a
        double[] c = inverse(a);
        System.out.println(Arrays.toString(c));
        
        // Square matrix d and e
        double[][] d = {{1.0, 2.0}, {3.0, 4.0}};
        double[][] e = {{4.0, 3.0}, {2.0, 1.0}};
        
        // Multiply d and e
        double[][] f = multiply(d, e);
        System.out.println(Arrays.deepToString(f));
    }
}

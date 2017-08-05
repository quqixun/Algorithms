/**
 * @source  Algorithms Fourth Edition
 * @title   Class of Accumulator
 * @Chapter 1.2 Fundamentals - Data Abstraction
 */

public class Accumulator{
    private double total;
    private int N;

    public void addDataValue(double val)
    { N++; total += val; }

    public double mean()
    { return total / N; }

    public String toString()
    { return "Mean (" + N + " values):" + 
             String.format("%7.5f", mean()); }

    public static void main(String args[]){
        int T = Integer.parseInt(args[0]);
        Accumulator a = new Accumulator();
        for (int i = 0; i < T; i++)
        	a.addDataValue(StdRandom.uniform());
        StdOut.println(a);
    }         
}

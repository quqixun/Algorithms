/**
 * @source  Algorithms Fourth Edition
 * @title   Basic Usage of Standard Liberary
 * @Chapter 1.1 Fundamentals - Programming Model
 */

import java.util.Arrays;

public class BasicDraw{

    private BasicDraw() {}

    // Plot values of functions as points
    public static void drawFunction(){
        int N = 100;
        StdDraw.setXscale(0, N);
        StdDraw.setYscale(0, N * N);
        StdDraw.setPenRadius(.01);
        for (int i = 1; i <= N; i++){
            StdDraw.point(i, i);
            StdDraw.point(i, i * i);
            StdDraw.point(i, i * Math.log(i));
        }
        return;
    }

    // Plot values of random array as filled rectangles
    public static void drawRandomArray(){
        int N = 50;
        double[] a = new double[N];
        for (int i = 0; i < N; i++)
            a[i] = StdRandom.uniform();
        for (int i = 0; i < N; i++){
            double x = 1.0 * i / N;
            double y = a[i] / 2.0;
            double rw = 0.5 / N;
            double rh = a[i] / 2.0;
            StdDraw.filledRectangle(x, y, rw, rh);
        }
        return;
    }

    // Plot values of sorted array as filled rectangles
    public static void drawSortedArray(){
        int N = 50;
        double[] a = new double[N];
        for (int i = 0; i < N; i++)
            a[i] = StdRandom.uniform();
        Arrays.sort(a);
        for (int i = 0; i < N; i++){
            double x = 1.0 * i / N;
            double y = a[i] / 2.0;
            double rw = 0.5 / N;
            double rh = a[i] / 2.0;
            StdDraw.filledRectangle(x, y, rw, rh);
        }
        return;
    }

    public static void main(String[] args){

        if (args.length != 1){
            StdOut.println("point, random or sorted");
            return;
        }

        switch (args[0]){
            default:
                StdOut.println("point, random or sorted");
                break;
            case "point":
                // Test the funciton to plot points
                BasicDraw.drawFunction();
                break;
            case "random":
                // Test the function to plot random filled rectangle
                BasicDraw.drawRandomArray();
                break;
            case "sorted":
                // Test the function to plot sorted filled rectangle
                BasicDraw.drawSortedArray();
                break;
        }
        
        return;
    }
}
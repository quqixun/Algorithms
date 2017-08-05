/**
 * @source  Algorithms Fourth Edition
 * @title   Class of StaticSETofInts
 * @Chapter 1.2 Fundamentals - Data Abstraction
 */

import java.util.Arrays;

public class StaticSETofInts{
    private int[] a;

    public StaticSETofInts(int[] keys){
        a = new int[keys.length];
        for (int i = 0; i < keys.length; i++)
        	a[i] = keys[i];
        Arrays.sort(a);
    }

    public boolean contains(int key)
    { return indexof(key) != -1; }

    public int indexof(int key){
    	int lo = 0;
    	int hi = a.length - 1;

    	while (lo <= hi){
    	    int mid = lo + (hi - lo) / 2;
    	    if      (key < mid) hi = mid - 1;
    	    else if (key > mid) lo = mid + 1;
    	    else return mid;
    	}

    	return -1;
    }

    public static void main(String args[]){
        In in = new In(args[0]);
        int[] white = in.readAllInts();
        StaticSETofInts set = new StaticSETofInts(white);
        while (!StdIn.isEmpty()){
            int key = StdIn.readInt();
            if (!set.contains(key))
            	StdOut.println(key);
        }
    }
}

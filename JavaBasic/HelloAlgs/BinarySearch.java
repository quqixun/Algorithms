/**
 * @source  Algorithms Fourth Edition
 * @title   Implementation of Binary Search
 * @Chapter 1.1 Fundamentals - Programming Model
 */

import java.util.Arrays;

public class BinarySearch{
	private BinarySearch() {}

	public static int indexof(int[] a, int key){
		int lo = 0;
		int hi = a.length - 1;
		while (lo <= hi){
			int mid = lo + (hi - lo) / 2;
			if      (key < a[mid]) hi = mid - 1;
			else if (key > a[mid]) lo = mid + 1;
			else return mid;
		}
		return -1;
	}

	public static void main(String[] args){
		In in = new In(args[0]);
		int[] whitelist = in.readAllInts();

		Arrays.sort(whitelist);

		while (!StdIn.isEmpty()){
			int key = StdIn.readInt();
			if (BinarySearch.indexof(whitelist, key) == -1)
				StdOut.println(key);
		}
	}
}

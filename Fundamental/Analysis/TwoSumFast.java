/**
 * @source  Algorithms Fourth Edition
 * @title   Sample of TwoSumFast
 * @Chapter 1.4 Analysis of Algorithms
 */

import java.util.Arrays;

public class TwoSumFast {
	public TwoSumFast() {}

	public static int count(int[] a) {
		Arrays.sort(a);
		int n = a.length;
		int count = 0;
		for (int i = 0; i < n; i++)
			if (BinarySearch.indexof(a, -a[i]) > i)
				count++;
		return count;
	}

	public static void main(String[] args) {
		In in = new In(args[0]);
		int[] a = in.readAllInts();
		StdOut.println(count(a));
	}
}

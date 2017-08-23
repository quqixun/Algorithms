/**
 * @source  Algorithms Fourth Edition
 * @title   Sample of ThreeeSum
 * @Chapter 1.4 Analysis of Algorithms
 */

public class ThreeSum {
	private ThreeSum() {}

	public static int count(int[] a) {
		int n = a.length;
		int count = 0;
		for (int i = 0; i < n; i++)
			for (int j = i + 1; j < n; j++)
				for (int k = j + 1; k < n; k++)
					if (a[i] + a[j] + a[k] == 0)
						count++;
		return cnt;
	}

	public static void main(String[] args) {
		In in = new In(args[0]);
		int[] a = in.readAllInts();
		StdOut.println(count(a));
	}
}

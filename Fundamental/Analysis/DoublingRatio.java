/**
 * @source  Algorithms Fourth Edition
 * @title   Sample of DoublingRatio
 * @Chapter 1.4 Analysis of Algorithms
 */

public class DoublingRatio  {
	public DoublingRatio () {}

	public static double timeTrial(int n) {
		int MAX = 1000000;
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = StdRandom.uniform(-MAX, MAX);
		MyStopwatch timer = new MyStopwatch();
		int count = ThreeSum.count(a);
		return timer.elapsedTime();
	}

	public static void main(String[] args) {
		double prev = timeTrial(125);
		for (int n = 250; true; n += n) {
			double time = timeTrial(n);
			StdOut.printf("%7d %5.1f", n, time);
			StdOut.printf("%5.1f\n", time / prev);
			prev = time;
		}
	}
}
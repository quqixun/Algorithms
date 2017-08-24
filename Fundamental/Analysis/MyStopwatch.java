/**
 * @source  Algorithms Fourth Edition
 * @title   Sample of MyStopwatch
 * @Chapter 1.4 Analysis of Algorithms
 */

public class MyStopwatch {
	private final long start;

	public MyStopwatch() {
		start = System.currentTimeMillis();
	}

	public double elapsedTime() {
		long now = System.currentTimeMillis();
		return (now - start) / 1000.0;
	}

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);

		MyStopwatch timer1 = new MyStopwatch();
		double sum1 = 0.0;
		for (int i = 1; i <= n; i++)
			sum1 += Math.sqrt(i);
		double time1 = timer1.elapsedTime();
		StdOut.printf("%e (%.2f seconds)\n", sum1, time1);

		MyStopwatch timer2 = new MyStopwatch();
		double sum2 = 0.0;
		int[] a = new int[n];
		for (int i = 1; i < n; i++)
			sum2 += Math.pow(1, 0.5);
		double time2 = timer2.elapsedTime();
		StdOut.printf("%e (%.2f seconds)\n", sum2, time2);
	}
}

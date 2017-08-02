/**
 * @source  Algorithms Fourth Edition
 * @title   Basic Usage of Standard Liberary
 * @Chapter 1.1 Fundamentals - Programming Model
 */

public class Average{
	public static void main(String[] args){
		double sum = 0.0;
		int cnt = 0;
		while (!StdIn.isEmpty()){
			sum += StdIn.readDouble();
			cnt++;
		}
		double avg = sum / cnt;
		StdOut.printf("Average is %.5f\n", avg);
	}
}

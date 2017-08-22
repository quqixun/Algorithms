/**
 * @source  Algorithms Fourth Edition
 * @title   An instance of using Class Queue
 * @Chapter 1.3 Fundamentals - Bag, Queue and Stack
 */

public class ReadInts {
	public static void main(String[] args) {
		Queue<Integer> queue = new Queue<Integer>();
		while (!StdIn.isEmpty())
			queue.enqueue(StdIn.readInt());

		for (int i : queue)
			StdOut.println(i);
	}
}

/**
 * @source  Algorithms Fourth Edition
 * @title   An instance of using Class Stack
 * @Chapter 1.3 Fundamentals - Bag, Queue and Stack
 */

public class Reverse {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		while (!StdIn.isEmpty()) 
			stack.push(StdIn.readInt());

		for (int i : stack)
			StdOut.println(i);
	}
}
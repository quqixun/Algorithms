/**
 * @source  Algorithms Fourth Edition
 * @title   FixedCapacityStackOfStrings
 * @Chapter 1.3 Fundamentals - Bag, Queue and Stack
 */

public class FixedCapacityStackOfStrings {
	private String[] str;
	private int n;

	public FixedCapacityStackOfStrings(int cap) {
		str = new String[cap];
		n = 0;
	}

	public boolean isEmpty() {
		return n == 0;
	}

	public int size() {
		return n;
	}

	public void push(String item) {
		str[n++] = item;
	}

	public String pop() {
		return str[--n];
	}

	public static void main(String[] args) {
		FixedCapacityStackOfStrings s;
		s = new FixedCapacityStackOfStrings(100);

		while (!StdIn.isEmpty()) {
			String item = StdIn.readString();
			if (!item.equals("-"))
				s.push(item);
			else if (!s.isEmpty())
				StdOut.print(s.pop() + " ");
		}

		StdOut.println("(" + s.size() + " left on stack)");
	}
}

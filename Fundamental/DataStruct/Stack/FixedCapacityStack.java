/**
 * @source  Algorithms Fourth Edition
 * @title   FixedCapacityStack
 * @Chapter 1.3 Fundamentals - Bag, Queue and Stack
 */

public class FixedCapacityStack<Item> {
	private Item[] e;
	private int n;

	public FixedCapacityStack(int cap) {
		e = (Item[]) new Object[cap];
		n = 0;
	}

	public boolean isEmpty() {
		return n == 0;
	}

	public int size() {
		return n;
	}

	public void push(Item item) {
		e[n++] = item;
	}

	public Item pop() {
		return e[--n];
	}

	public static void main(String[] args) {
		FixedCapacityStack<String> s;
		s = new FixedCapacityStack<String>(100);

		while(!StdIn.isEmpty()) {
			String item = StdIn.readString();
			if (!item.equals("-"))
				s.push(item);
			else if(!s.isEmpty())
				StdOut.print(s.pop() + " ");
		}

		StdOut.println("(" + s.size() + " left on stack)");
	}
}

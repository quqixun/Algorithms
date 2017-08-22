/**
 * @source  Algorithms Fourth Edition
 * @title   Class of Queue
 * @Chapter 1.3 Fundamentals - Bag, Queue and Stack
 */

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Queue<Item> implements Iterable<Item> {
    private Node<Item> top;     // Top element of stack
    private Node<Item> bottom;  // Bottom element of stack
    private int n;              // Number of elements

    private class Node<Item> {
        private Item item;
        private Node<Item> next;
    }

    public Queue() {
    	top = null;
    	bottom = null;
    	n = 0;
    }

    public boolean isEmpty() {
    	return top == null;
    }

    public int size() {
    	return n;
    }

    public void enqueue(Item item) {
        Node<Item> oldBottom = bottom;
        bottom = new Node<Item>();
        bottom.item = item;
        bottom.next = null;

        if (isEmpty()) top = bottom;
        else           oldBottom.next = bottom;
        n++;
    }

    public Item dequeue() {
    	if (isEmpty()) throw new NoSuchElementException("Queue underflow");
        Item item = top.item;
        top = top.next;
        n--;
        if (isEmpty()) bottom = null;
        return item;
    }

    public String toString() {
    	StringBuilder s = new StringBuilder();
    	for (Item item : this) {
    		s.append(item);
    		s.append(" ");
    	}
    	return s.toString();
    }

    public Iterator<Item> iterator() {
        return new ListIterator<Item>(top);
    }

    public class ListIterator<Item> implements Iterator<Item>{
    	private Node<Item> current;

    	public ListIterator(Node<Item> top) {
    		current = top;
    	}

        public boolean hasNext() { return current != null; }
        public void remove()     { throw new UnsupportedOperationException(); }

        public Item next() {
        	if (!hasNext()) throw new NoSuchElementException();
            Item item = current.item;
            current = current.next;
            return item;
        }
    }

    public static void main(String[] args) {
    	Queue<String> queue = new Queue<String>();
    	while (!StdIn.isEmpty()) {
    		String item = StdIn.readString();
    		if (!item.equals("-"))
    			queue.enqueue(item);
    		else if (!queue.isEmpty())
    			StdOut.print(queue.dequeue() + " ");
    	}
    	StdOut.println("(" + queue.size() + " left on queue)");
    }
}

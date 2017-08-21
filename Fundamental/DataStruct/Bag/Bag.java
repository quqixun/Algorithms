/**
 * @source  Algorithms Fourth Edition
 * @title   Class of Bag
 * @Chapter 1.3 Fundamentals - Bag, Queue and Stack
 */

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Bag<Item> implements Iterable<Item> {
    private Node<Item> top; // Top element of stack
    private int n;          // Number of elements

    private static class Node<Item> {
        private Item item;
        private Node<Item> next;
    }

    public Bag() {
        top = null;
        n = 0;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        return n;
    }

    public void add(Item item) {
        Node<Item> oldTop = top;
        top = new Node<Item>();
        top.item = item;
        top.next = oldTop;
        n++;
    }

    public Iterator<Item> iterator() {
        return new ListIterator<Item>(top);
    }

    public class ListIterator<Item> implements Iterator<Item> {
    	private Node<Item> current;

        public ListIterator(Node<Item> top) {
            current = top;
        }

    	public boolean hasNext() { return current != null; }
    	public void remove()     { throw new UnsupportedOperationException(); }

    	public Item next(){
            if (!hasNext()) throw new NoSuchElementException();
    	    Item item = current.item;
    	    current = current.next;
    	    return item;
    	}
    }

    public static void main(String[] args) {
        Bag<String> bag = new Bag<String>();
        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            bag.add(item);
        }

        StdOut.println("size of bag = " + bag.size());
        for (String s : bag) {
            StdOut.println(s);
        }
    }
}

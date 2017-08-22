/**
 * @source  Algorithms Fourth Edition
 * @title   Class of Stack
 * @Chapter 1.3 Fundamentals - Bag, Queue and Stack
 */

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Stack<Item> implements Iterable<Item> {
    private Node<Item> top;   // Top element of stack
    private int n;            // Number of elements in stack

    private class Node<Item> {
        private Item item;
        private Node<Item> next;
    }

    public Stack() {
        top = null;
        n = 0;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        return n;
    }

    public void push(Item item) {
        Node<Item> oldTop = top;
        top = new Node<Item>();
        top.item = item;
        top.next = oldTop;
        n++;
    }

    public Item pop() {
        if (isEmpty()) throw new NoSuchElementException("Stack underflow");
        Item item = top.item;
        top = top.next;
        n--;
        return item;
    }

    public Item peek() {
        if (isEmpty()) throw new NoSuchElementException("Stack underflow");
        return top.item;
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

    public class ListIterator<Item> implements Iterator<Item> {
        private Node<Item> current;

        public ListIterator(Node<Item> top) {
            current = top;
        }

        public boolean hasNext() { return current == null; }
        public void remove()     { throw new UnsupportedOperationException(); }

        public Item next(){
            if (!hasNext()) throw new NoSuchElementException();
            Item item = current.item;
            current = current.next;
            return item;
        }
    }

    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            if (!item.equals("-"))
                stack.push(item);
            else if (!stack.isEmpty())
                StdOut.print(stack.pop() + " ");
        }
        StdOut.println("(" + stack.size() + " left on stack)");
    }
}

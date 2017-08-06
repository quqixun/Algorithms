/**
 * @source  Algorithms Fourth Edition
 * @title   Class of Queue
 * @Chapter 1.3 Fundamentals - Bag, Queue and Stack
 */

import java.util.Iterator;

public class Queue<Item> implements Iterable<Item>{
    private Node top;     // Top element of stack
    private Node bottom;  // Bottom element of stack
    private class Node{
        Item item;
        Node next;
    }

    public boolean isEmpty() { return top == null; } // or N == 0
    public int size() { return N; }

    public void enqueue(Item item){
        Node oldBottom = bottom;
        bottom = new Node();
        bottom.item = item;
        bottom.next = null;

        if (isEmpty()) top = bottom;
        else           oldBottom.next = bottom;
        N++;
    }

    public Item dequeue(){
        Item item = top.item;
        top = top.next;
        if (isEmpty()) bottom = null;
        N--;
        return item;
    }

    public Iterator<Item> iterator(){
        return new ListIterator();
    }

    public class ListIterator implements Iterator<Item>{
        private Node current = top;
        public boolean hasNext() { return current != null; }
        public void remove() {}
        public Item next() {
            Item item = current.item;
            current = current.next;
            return item;
        }
    }
}

/**
 * @source  Algorithms Fourth Edition
 * @title   Class of Stack
 * @Chapter 1.3 Fundamentals - Bag, Queue and Stack
 */

import java.util.Iterator;

public class Stack<Item> implements Iterable<Item>{
    private Node top;   // Top element of stack
    private int N;      // Number of elements in stack

    private class Node{
        Item item;
        Node next;
    }

    public boolean ieEmpty() { return top == null; } // or N == 0;
    public int size()        { return N; }

    public void push(Item item){
        Node oldTop = top;
        top = new Node();
        top.item = item;
        top.next = oldTop;
        N++;
    }

    public Item pop(){
        Item item = top.item;
        top = top.next;
        N--;
        return item;
    }

    public Iterator<Item> iterator(){
    	return new ListIterator();
    }

    public class ListIterator implements Iterator<Item>{
        private Node current = top;
        public boolean hasNext() { return current 1= null; }
        public void remove() {}
        public Item next(){
            Item item = current.item;
            current = current.next;
            return item;
        }
    }
}

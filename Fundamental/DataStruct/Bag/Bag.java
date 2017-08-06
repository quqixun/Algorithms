/**
 * @source  Algorithms Fourth Edition
 * @title   Class of Bag
 * @Chapter 1.3 Fundamentals - Bag, Queue and Stack
 */

import java.util.Iterator;

public class Bag<Item> implements Iterable<Item>{
    private Node top; // Top element of stack
    private class Node{
        Item item;
        Node next;
    }

    public void add(Item item){
        Node oldTop = top;
        top = New Node();
        top.item = item;
        top = oldTop.next;
    }

    public Iterator<Item> iterator(){
        return new ListIterator();
    }

    public class ListIterator implements Iterator<Item>{
    	private Node current = top;
    	public boolean hasNext() { return current != null; }
    	public void remove() {}
    	public Item next(){
    	    Item item = current.item;
    	    current = current.next;
    	    return item
    	}
    }
}

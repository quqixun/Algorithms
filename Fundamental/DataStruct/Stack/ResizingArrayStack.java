/**
 * @source  Algorithms Fourth Edition
 * @title   Class of ResizingArrayStack
 * @Chapter 1.3 Fundamentals - Bag, Queue and Stack
 */

import java.util.Iterator;

public class ResizingArrayStack<Item> implements Iterable<Item>{
    private Item[] elements = (Item[]) new Object[1]; // Elements of stack
    private int N = 0;                                // Number of elements
    
    public boolean isEmpty() { return N == 0; }
    public int size()        { return N;      }

    private void resize(int max){
        Item[] temp = (Item[]) new Object[max];
        for (int i = 0; i < N; i++)
            temp[i] = elements[i];
        elements = temp;
    }

    public void push(Item item){
        if (N == elements.length)
            resize(2 * elements.length);
        elements[N++] = item;
    }

    public Item pop(){
        Item item = elements[--N];
        elements[N] = null;
        if (N > 0 && N == elements.length / 4)
            resize(elements.length / 2);
        return item;
    }

    public Iterator<Item> iterator(){
        return new ReverseArrayIterator();
    }

    public class ReverseArrayIterator implements Iterator<Item>{
        private int i = N;
        public boolean hasNext() { return i > 0;         }
        public    Item next()    { return elements[--i]; }
        public    void remove()  {                       }
    }

    public static void main(String[] args) {
        ResizingArrayStack<String> s;
        s = new ResizingArrayStack<String>();

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

/**
 * @source  Algorithms Fourth Edition
 * @title   Instance of Counter
 * @Chapter 1.2 Fundamentals - Data Abstraction
 */

public class Counter{
    private final String name;
    private int count;

    // Initialize the instance
    public Counter(String id){
        name = id;
    }

    public void increment(){
        count++;
    }

    public int tally(){
        return count;
    }

    public String toString(){
        return count + " " + name;
    }

    public static void main(String[] args){
        Counter heads = new Counter("heads");
        Counter tails = new Counter("tails");

        heads.increment();
        heads.increment();
        tails.increment();

        StdOut.println(heads + "\n" + tails);
        StdOut.println(heads.tally() + tails.tally());
    }
}

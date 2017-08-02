/**
 * @source  Algorithms Fourth Edition
 * @title   Usage of Instance Counter - FlipsMax
 * @Chapter 1.2 Fundamentals - Data Abstraction
 */

public class FlipsMax{
    // Instance can be used as input variable as well as return
    public static Counter max(Counter a, Counter b){
        if (a.tally() > b.tally()) return a;
        else                       return b;
    }

    public static void main(String[] args){
        int T = Integer.parseInt(args[0]);
        Counter heads = new Counter("heads");
        Counter tails = new Counter("tails");

        for (int t = 0; t < T; t++){
            if (StdRandom.bernoulli(.5))
                 heads.increment();
            else tails.increment();
        }

        if (heads.tally() == tails.tally())
        	StdOut.println("Tie");
        else StdOut.println(max(heads, tails) + " wins");
    }
}

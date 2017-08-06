/**
 * @source  Algorithms Fourth Edition
 * @title   Class of Date
 * @Chapter 1.2 Fundamentals - Data Abstraction
 */

public class Date{
    private final int month;
    private final int day;
    private final int year;

    public Date(int m, int d, int y)
    { month = m; day = d; year = y; }

    public Date(String date){
        String[] fields = date.split("/");
        month = Integer.parseInt(fields[0]);
        day = Integer.parseInt(fields[1]);
        year = Integer.parseInt(fields[2]);
    }

    public int month()
    { return month; }

    public int day()
    { return day; }

    public int year()
    { return year; }

    public String toString()
    { return month() + "/" + day() + "/" + year(); }

    public boolean equals(Object x){
        if (this == x) return true;
        if (x == null) return false;
        if (this.getClass() != x.getClass()) return false;

        Date that = (Date) x;
        if (this.day != that.day)      return false;
        if (this.month != that.month)  return false;
        if (this.year != that.year)    return false;

        return true;
    }

    public static void main(String[] args){
        if (args.length == 1){
            Date date = new Date(args[0]);
            StdOut.println(date);
        }

        if (args.length == 2){
            Date one = new Date(args[0]);
            Date two = new Date(args[1]);
            StdOut.println(one.equals(two));
        }

        if (args.length == 3){
            Date date = new Date(Integer.parseInt(args[0]),
       	                         Integer.parseInt(args[1]),
                                 Integer.parseInt(args[2]));
            StdOut.println(date);
        }
    }
}

// public class Date{
//     private final int value;

//     public Date(int m, int d, int y)
//     { value = y * 512 + m * 32 + d; }

//     public Date(String date){
//         String[] fields = date.split("/");
//         value = Integer.parseInt(fields[2]) * 512
//               + Integer.parseInt(fields[0]) * 32
//               + Integer.parseInt(fields[1]);
//     }

//     public int month()
//     { return (value / 32) % 16; }

//     public int day()
//     { return value % 32; }

//     public int year()
//     { return value / 512; }

//     public String toString()
//     { return month() + "/" + day() + "/" + year(); }

//     public static void main(String[] args){
//         if (args.length == 1){
//             Date date = new Date(args[0]);
//             StdOut.println(date);
//         }

//         if (args.length == 3){
//             Date date = new Date(Integer.parseInt(args[0]),
//        	                         Integer.parseInt(args[1]),
//                                  Integer.parseInt(args[2]));
//             StdOut.println(date);
//         }
//     }
// }

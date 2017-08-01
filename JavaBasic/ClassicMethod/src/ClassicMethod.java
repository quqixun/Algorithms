/**
 * @title  Classic Static Method
 * @author Qixun Qu
 * @date   8/1/2017
 */

public class ClassicMethod {
    // Retuen the absolute value of an integer
    public static int abs(int x)
    {
        if (x < 0) return -x;
        else       return x;
    }
    
    // Retuen the absolute value of a double number
    public static double abs(double x)
    {
        if (x < 0.0) return -x;
        else         return x;
    }
    
    // Decide whether the input integer is a prime or not
    public static boolean isPrime(int x)
    {
        if (x < 2) return false;
        
        for (int i = 2; i * i <= x; i++)
            if (x % i == 0) return false;
        
        return true;
    }
    
    // Compute the square root of input number
    // by Newton's method
    public static double sqrt(double x)
    {
        if (x < 0) return Double.NaN;
        
        double err = 1e-15;
        double t = x;
        
        while(Math.abs(t - x / t) > err * t)
            t = (x / t + t) / 2.0;
        
        return t;
    }
    
    // Compute the length of hypotenus of right triangle
    public static double hypotenuse(double a, double b)
    {
        return Math.sqrt(a * a + b * b);
    }
    
    // Compute harmonic series
    public static double H(int x)
    {
        double sum = 0.0;
        
        for (int i = 1; i <= x; i++)
            sum += 1.0 / i;
        
        return sum;
    }
    
    public static void main(String[] args)
    {
        // Test function "abs(int x)"
        System.out.println(abs(7));
        System.out.println(abs(-7));
        
        // Test function "abs(double x)"
        System.out.println(abs(7.0));
        System.out.println(abs(-7.0));
        
        // Test function "isPrime(int N)"
        System.out.println(isPrime(7));
        System.out.println(isPrime(49));
        
        // Test function "sqrt(double x)"
        System.out.println(sqrt(49.0));
        
        // Test function "hypotenuse(double a, double b)"
        System.out.println(hypotenuse(60.0, 80.0));
        
        // Test function "H(int x)"
        System.out.println(H(7));
    }
}

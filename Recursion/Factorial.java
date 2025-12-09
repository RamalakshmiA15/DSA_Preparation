package Recursion;

public class Factorial {
    public static void main(String[] args) {

        System.out.println( find (10));

    }

    static  int find ( int n)
    {
        if ( n <= 1)
            return 1;
        return n* find (n-1);

    }
}

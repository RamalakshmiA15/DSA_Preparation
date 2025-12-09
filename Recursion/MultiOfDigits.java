package Recursion;

public class MultiOfDigits {


    public static void main(String[] args) {

        System.out.println( multi ( 2345));

    }

    static int multi ( int n)
    {
        if( n%10 == n)
            return n;
        return n%10 * multi ( n/10);
    }
}

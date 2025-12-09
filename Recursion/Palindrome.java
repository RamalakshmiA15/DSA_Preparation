package Recursion;

public class Palindrome {

    public static void main(String[] args) {

        System.out.println( palin(12134));

    }

     static  int rev ( int n)
     {
          int digits = ( int) ( Math.log10(n)) +1;
          return helper ( n, digits);

     }

     static int helper ( int n, int digit)
     {
          if( n % 10 == n)
              return n;
          int rem = n%10;
         return rem * (int)(Math.pow(10, digit-1)) + helper(n/10, digit-1);
     }

     static  boolean palin ( int n)
     {
          if( n== rev(n))
              return true;
          return false;

     }
}

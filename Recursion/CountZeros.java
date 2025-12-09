package Recursion;

public class CountZeros {
   //  static  int count = 0;
    public static void main(String[] args) {
        System.out.println( count(3020400, 0));


    }


   static int count ( int n, int count)
    {
        if( n/10 == 0)
            return count;


        if( n %10 == 0)
        {
            return count( n/10, count +1);
        }
        else
            return count ( n/10, count);

    }

/*    // with helper function

    static int countHelper ( int n)
    {
        return helper  ( n, 0);
    }

    static  int helper ( int n, int c)
    {
        if( n== 0)
            return c;

        if( n%10 == 0)
            return helper( n/10, ++c);
        else
            return helper ( n/10,c);
    }


*/




  /*  public static void main(String[] args) {
        System.out.println(count(302104));
    }

    static int count(int n) {
        return helper(n, 0);
    }

    // special pattern, how to pass a value to above calls
    private static int helper(int n, int c) {
        if (n == 0) {
            return c;
        }

        int rem = n % 10;
        if (rem == 0) {
            return helper(n/10, c+1);
        }
        return helper(n/10, c);
    }
    */



}

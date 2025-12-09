package Recursion;

public class PatternRecursion {

    public static void main(String[] args) {

        printReverse ( 4, 0);

    }

    static void print (int r, int c )
    {
        if ( r==0)
            return;
        if ( r > c)
        {
            System.out.print( "* ");
            print ( r, c+1);

        }
        else
        {
            System.out.println( );
            print ( r-1, 0);
        }

    }

    static  void printReverse ( int r, int c)
    {
        if ( r == 0)
            return ;
        if ( c < r)
        {
            printReverse( r, c+1);
            System.out.print("* ");

        }
        else
        {
            printReverse( r-1, 0);
            System.out.println( );
        }
    }
}

package Recursion;

import java.util.ArrayList;

public class Maze {


    public static void main(String[] args) {

        //System.out.println(countRightDownPath(3,3));
     //   printPath("", 3,3);
    //    System.out.println( printPathDiagonalList("", 3,3));


        boolean[][] board = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };

        mazeWithObstacles("",board, 0,0);

    }

    static int countRightDownPath ( int r, int c)

    {
        if ( r == 1 || c == 1)
        {
            return 1;

        }
        int right = countRightDownPath(r, c -1);
        int down  = countRightDownPath(r-1,c);
        int count = right + down;
        return count;

    }

    static  void printPath ( String p, int r, int c)
    {

        if (r== 1 && c == 1)
        {
            System.out.println(p);
            return ;
        }


        if ( c > 1)
        {
            printPath(p+"R", r, c-1);

        }
        if ( r>1)
        {
            printPath(p+"D", r-1, c);
        }

    }

    static  ArrayList<String> printPathDiagonalList (String p, int r, int c)
    {
        if ( r == 1 && c ==1)
        {
            ArrayList <String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        if ( r > 1)
        {
            ans.addAll( printPathDiagonalList(p+"v", r-1,c));
        }
        if ( c >1)
        {
            ans.addAll(printPathDiagonalList(p+"H",r,c -1));
        }
        if ( r>1 && c >1)
        {
            ans.addAll(printPathDiagonalList(p+"D", r-1,c-1));
        }
        return ans;
    }


    static  void mazeWithObstacles ( String path, boolean board[] [], int r, int c)
    {
        if( r == board.length -1 && c == board[0].length -1)
        {

            System.out.println(path);
            return;
        }

        if( !board[r][c] )
        {
            return;
        }

        if ( r < board.length -1)
            mazeWithObstacles(path+"D", board, r+1, c);

        if( c < board[0].length -1)
        {
            mazeWithObstacles(path+ "R",board, r,c+1);
        }


    }
}

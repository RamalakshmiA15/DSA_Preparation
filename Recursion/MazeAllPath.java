package Recursion;

public class MazeAllPath {

    public static void main(String[] args) {

        boolean[][] board = {

                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        allPath("", board,0,0);

    }

    static void allPath( String p, boolean matrix[][], int r, int c )

    {
        if (r == matrix.length-1 && c == matrix[0].length -1)
        {

            System.out.println(p);
            return;
        }

        if ( !matrix[r][c])
        {
            return;
        }
        matrix[r][c] = false;

        if ( r < matrix.length -1)
            allPath(p+"D",matrix,r+1,c);
        if(c< matrix[0].length-1)
            allPath(p+"R", matrix,r,c+1);
        if (r>0)
            allPath(p+"u",matrix, r-1,c);
        if(c>0)
            allPath(p+"L",matrix, r,c-1);

        matrix[r][c] = true;
    }
}

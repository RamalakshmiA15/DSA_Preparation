package Recursion;

import java.util.Arrays;

public class SelectionSortRecursion {

    public static void main(String[] args) {

        int [] arr = { 7, 1,4,5,3,9};
        sort( arr, arr.length , 0 ,0);
        System.out.println(Arrays.toString( arr ));

    }

    static void sort ( int [] arr, int i , int j, int maxIndex)
    {
        if ( i == 0)
            return;

        if ( i > j)
        {
            if ( arr [j] >  arr[maxIndex])
            {
                maxIndex = j;
            }
            sort ( arr, i, j +1, maxIndex);

        }
        else {
             int temp = arr [ i-1];
             arr [ i -1] = arr [ maxIndex];
             arr[ maxIndex ] = temp;
             sort ( arr , i -1, 0, 0);

        }

    }
}

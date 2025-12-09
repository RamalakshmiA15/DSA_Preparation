package Recursion;

import java.util.Arrays;

public class QuickSortRecursion {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        quick(arr, 0, arr.length - 1);
       System.out.println(Arrays.toString(arr));


    }


    static void quick ( int [] arr, int low, int high)
    {

        if ( low > high)
            return ;
        int s = low;
        int e = high;
        int m = (low + high) / 2;

        int pivot = arr[m];
        while (arr[s]  < pivot )
        {
            s++;
        }
        while ( arr[e] > pivot)
        {
            e--;
        }
        //now happens the violation
        while  ( s <= e)
        {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }

        quick( arr, low, e);
        quick(arr, s, high);
    }

}

package Recursion;

import java.util.ArrayList;

public class LinearSearchRecursion {

    public static void main(String[] args) {

        int [] arr = {2, 3, 1, 4, 4, 5};


   //     System.out.println(findAllIndexReturnList( arr, 2,0, new ArrayList< Integer>()));
        System.out.println(findAllIndex2(arr, 4, 0));



    }

    static boolean search ( int [] arr, int target, int index)
    {
        if (index == arr.length) {
            return false;

        }

        return  arr[ index ] == target || search(arr, target, index+1);

    }

    static int findIndex ( int [] arr, int target, int index)
    {
        if( index == arr.length)
            return -1;
        if( arr[ index] == target)
        {
            return index;
        }
        else
        {
            return findIndex( arr, target, index + 1);
        }
    }

     /*   static ArrayList < Integer> list = new ArrayList<>();
    static  void findAllIndex ( int [] arr, int target,int  i) {
        if (i == arr.length)
            return;

        if( arr[ i ] == target)
        {
             list.add( i);
        }

        findAllIndex( arr, target, i +1 );
    }


      */

    static  ArrayList<Integer> findAllIndexReturnList ( int [] arr, int target,int  i, ArrayList < Integer> list) {
        if (i == arr.length)
            return list;

        if( arr[ i ] == target)
        {
            list.add( i);
        }

      return   findAllIndexReturnList( arr, target, i +1, list );
    }


    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index) {

        ArrayList<Integer> list = new ArrayList<>();

        if (index == arr.length) {
            return list;
        }

        // this will contain answer for that function call only
        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findAllIndex2(arr, target, index + 1);

        list.addAll(ansFromBelowCalls);

        return list;
    }

}

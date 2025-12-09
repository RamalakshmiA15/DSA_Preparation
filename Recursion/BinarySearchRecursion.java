package Recursion;

public class BinarySearchRecursion {


    public static void main(String[] args) {

        int[] arr = { 5, 8, 13, 26,45};
        int target = 26;
        System.out.println(search(arr, target, 0, arr.length - 1));
    }

    static  int  search ( int [] arr, int target, int start, int end)
    {

        int middle = start + ( end - start) / 2;
        if(start > end)
        {
            return -1;
        }
        if(arr[middle] == target)
            return middle;
        if(target < arr[middle])
            return search ( arr, target, start, middle-1);

            return search(arr,target, middle + 1,end);
    }
}

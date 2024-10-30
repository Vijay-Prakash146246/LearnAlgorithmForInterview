package com.DsaAlgo.DSA.Array;

public class SearchInSortedAndRotatedArray
{
    /*
    *Given a sorted and rotated array arr[] of n distinct elements, the task is to find the
    * index of given key in the array. If the key is not present in the array, return -1.
    */

    //Using Linear Search O(n) time and O(1) auxiliary space

    //Time Complexity: O(log n) Auxiliary Space: O(1)
    public  static  int binarySearch(int[]arr,int low,int high,int target)
    {
        while (low<=high)
        {
            int mid = low+(high-low)/2;
            if(arr[mid]==target)
                return  mid;
            if(arr[mid]<target)
                low=mid+1;
            else
                high=mid-1;
        }
        return -1;
    }

    public  static  int findPivote(int []arr,int low,int high)
    {
        while (low<high)
        {
            if(arr[low]<=arr[high])
                return  low;

            int mid=(low+high)/2;

            if(arr[mid]>arr[high])
                low=mid+1;
            else
                high=mid;
        }
        return low;
    }

    public  static  int pivotedBinarySearch(int[]arr,int n,int target)
    {
        int pivote = findPivote(arr,0,n-1);
        if(pivote==0)
            return binarySearch(arr,0,n-1,target);
        if (arr[pivote]==target)
            return  pivote;
        if(arr[0]<=target)
            return binarySearch(arr,0,pivote-1,target);
        else
            return binarySearch(arr,pivote+1,n-1,target);
    }

    public  static  void  main(String[]args)
    {
        int[] arr = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        int target = 3;
        int n = arr.length;
        System.out.println(pivotedBinarySearch(arr,n,target));
    }
}

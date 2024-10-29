package com.DsaAlgo.DSA.Array;

public class SearchInSortedArray
{
    public  static  int BinarySearch(int []arr,int low,int high,int key)
    {
        if(low>high)
            return  -1;
        int mid = low + (high - low)/2;;
        if (key == arr[mid])
            return  mid;
        if(key>arr[mid])
            return BinarySearch(arr,(mid+1),high,key);
        return BinarySearch(arr,low,(mid-1),key);
    }
    public  static  void main(String[]args)
    {
        int[]arr={23,24,25,26,67,87,95,34,43};
        int n = arr.length;
        int key=95;
        System.out.println("Index "+BinarySearch(arr,0,n-1,key));
    }
}
/*
*Time Complexity: O(log(n)) Using Binary Search
Auxiliary Space: O(log(n)) due to recursive calls, otherwise iterative version
* uses Auxiliary Space of O(1).
* */

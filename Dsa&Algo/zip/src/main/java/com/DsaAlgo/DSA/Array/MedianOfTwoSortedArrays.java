package com.DsaAlgo.DSA.Array;

import java.util.Arrays;

public class MedianOfTwoSortedArrays
{
    /*
   Given 2 sorted arrays arr1[] and arr2[], each of size n, the task is to find the
   median of the array obtained after merging arr1[] and arr2[].
   Note: Since the size of the merged array will always be even, the median will be the
   average of the middle two numbers.


   Using Sorting – O(n * logn) Time and O(n) Space
   The idea is to concatenate both the arrays into a new array, sort the new array
   and return the middle of the new sorted array.
     */

    public  static  double getMedian(int[]arr,int[]arr1)
    {
        int n = arr.length+arr1.length;
        int[]arr2 = new int[n];
        System.arraycopy(arr,0,arr2,0,arr.length);
        System.arraycopy(arr1,0,arr2,arr.length,arr1.length);
        Arrays.sort(arr2);
        int mid = n/2;
        int mid1=mid-1;
        return ((arr2[mid]+arr2[mid1])/2.0);
    }


    //Using Merge of Merge Sort – O(n) Time and O(1) Space

    public  static  void main(String[]args)
    {
        int[] arr = { 1, 12, 15, 26, 38 };
        int[] arr1 = { 2, 13, 17, 30, 45 };
        System.out.println(getMedian(arr,arr1));
    }
}

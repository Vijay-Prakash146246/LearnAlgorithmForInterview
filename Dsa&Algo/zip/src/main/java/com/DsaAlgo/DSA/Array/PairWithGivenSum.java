package com.DsaAlgo.DSA.Array;

import java.util.Arrays;
import java.util.HashSet;

public class PairWithGivenSum
{
    /*
    Given an array arr[] of n integers and a target value, the task is to find whether there
    is a pair of elements in the array whose sum is equal to target.
    * */

    //Generating all Possible Pairs – O(n^2) time and O(1) space
    public  static  boolean pairWithGivenSum(int[]arr , int target)
    {
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
            for(int j=(i+1);j<n;j++)
            {
                if(arr[i]+arr[j]==target)
                    return  true;
            }
        }
        return  false;
    }
    //Sorting and Binary Search – O(n*log(n)) time and O(1) space
    public  static  boolean binarySearch(int[]arr,int left,int right,int target)
    {
        while (left<=right)
        {
            int mid = left+(right-left)/2;
            if(arr[mid]==target)
                return  true;
            if(arr[mid]<target)
                left=mid+1;
            else
                right=mid-1;
        }
        return  false;
    }

    public  static  boolean pairWithGivenSum1(int[]arr , int target)
    {
        Arrays.sort(arr);
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
            int complement = target-arr[i];
            if(binarySearch(arr,i+1,n-1,complement))
                return  true;
        }
        return  false;
    }

    //Sorting and Two-Pointer Technique – O(n*log(n)) time and O(1) space
    //Note : This approach is the best approach for a sorted array.
    public  static  boolean pairWithGivenSum2(int[]arr , int target)
    {
        Arrays.sort(arr);
        int left = 0,right =  arr.length-1;
        while ((left<right))
        {
            int sum = arr[left]+arr[right];
            if (sum==target)
                return true;
            if(sum<target)
                left++;
            else
                right--;
        }
        return  false;
    }

    //But if array is not sorted, then we use the below approach.
    //Time Complexity: O(n), for single iteration over the array
    //Auxiliary Space: O(n), for hashmap
    public  static  boolean pairWithGivenSum3(int[]arr , int target)
    {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            int complement = target-arr[i];
            if(set.contains(complement))
                return true;
            set.add(arr[i]);
        }
        return  false;
    }

    public  static  void main(String[]args)
    {
//        int[] arr = {1, -2, 1, 0, 5};
//        int target = 0;
        int[] arr = { 0, -1, 2, -3, 1 };
        int target = -2;
        if(pairWithGivenSum3(arr ,target))
            System.out.println("true");
        else
            System.out.println("false");
    }
}

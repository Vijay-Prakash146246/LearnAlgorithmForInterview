package com.DsaAlgo.DSA.Array;

public class MaximumSubarraySum
{
    /*
    Maximum Subarray Sum – Kadane’s Algorithm
    Given an array arr[], the task is to find the subarray that has the maximum sum
    and return its sum.
     */


    //By iterating over all subarrays – O(n^2) Time and O(1) Space
    public  static  int maxSubarraySum(int []arr)
    {
        int res=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            int currentSum=0;
            for(int j=i;j<arr.length;j++)
            {
                currentSum+=arr[j];
                res=Math.max(res,currentSum);
            }
        }
        return  res;
    }

    //Using Kadane’s Algorithm – O(n) Time and O(1) Space
    public  static  int maxSubarraySum1(int []arr)
    {
        int res=arr[0];
        int maxEnding=arr[0];
        for (int i=0;i<arr.length;i++)
        {
            maxEnding=Math.max(maxEnding+arr[i],arr[i]);
            res=Math.max(res,maxEnding);
        }
        return  res;
    }

    public  static  void  main(String[]args)
    {
        int[] arr = {2, 3, -8, 7, -1, 2, 3};
        System.out.println(maxSubarraySum1(arr));
    }
}

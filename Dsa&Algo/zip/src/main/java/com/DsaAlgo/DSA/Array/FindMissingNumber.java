package com.DsaAlgo.DSA.Array;

public class FindMissingNumber
{
    /*
    Given an array arr[] of size N-1 with integers in the range of [1, N], the task is to
    find the missing number from the first N integers.
    Note: There are no duplicates in the list.
    * */

    //Using Array O(n) time and O(n) auxiliary space
    public static  int findMissingNo(int[]arr ,int n)
    {
        int[]arr1=new int[n+1];
        for(int i=0;i<n-1;i++)
            arr1[arr[i]]++;

        for(int i=1;i<=n;i++)
            if(arr1[i]==0)
                return  i;
        return -1;
    }

    //2.Using Sum of N terms Formula – O(n) time and O(1) auxiliary space
    public static  int findMissingNo1(int[]arr ,int n)
    {
        int sum=0;
        for(int i=0;i<n-1;i++)
            sum+=arr[i];

        int expectedSum=(n*(n+1)/2);
        return  (expectedSum-sum);
    }

    /*
    Using XOR Operation – O(n) time and O(1) auxiliary space
    Another efficient approach is to use the XOR operation. The approach is based on the idea
    that XOR of a number with itself is 0, and XOR of a number with 0 is the number itself.
    This means that if we find XOR of first N natural numbers and then take XOR of each array
    elements with this, then the resultant will be the missing number.
    * */

    public static  int findMissingNo2(int[]arr ,int n)
    {
        int xor1=0,xor2=0;

        for(int i=1;i<=n;i++)
            xor1^=i;

        for (int i=0;i<n-1;i++)
            xor2^=arr[i];

        return (xor1^xor2);
    }
    public static  void main(String[]args)
    {
//        int[]arr={1, 2, 4, 6, 3, 7, 8} ;
//        int n = 8 ;
        int[] arr = { 1, 2, 3, 5 };
        int n = 5;
        System.out.println(findMissingNo2(arr,n));
    }
}

package com.DsaAlgo.DSA.Array;

import java.util.Arrays;
import java.util.HashMap;

public class MajorityElement
{
    /*
    Given an array arr. Find the majority element in the array. If no majority exists,
    return -1. A majority element in an array is an element that appears strictly more
    than arr.size() / 2 times in the array.
    * */

    //Using Two Nested Loops – O(n^2) Time and O(1) Space
    public  static  int majorityElement(int arr[])
    {
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
            int count =0;
            for(int j=0;j<n;j++)
            {
                if(arr[i]==arr[j])
                    count++;
            }
            if(count>(n/2))
                return arr[i];
        }
        return -1;
    }

    //Using Sorting – O(n log n) Time and O(1) Space
    public  static  int majorityElement1(int arr[])
    {
        int n = arr.length;
        if(n==1)
            return  arr[0];
        int count=1;
        Arrays.sort(arr);
        for(int i=1;i<n;i++)
        {
            if(arr[i-1]==arr[i])
            {
                count++;
            }
            else
            {
                if(count>n/2)
                    return arr[i-1];
                count=1;
            }
        }
        if (count>n/2)
            return arr[n-1];
        return -1;
    }

    //Using Hashing – O(n) Time and O(n) Space
    public  static  int majorityElement2(int arr[])
    {
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : arr)
        {
            map.put(num,map.getOrDefault(num,0)+1);
            if(map.get(num)>n/2)
                return num;
        }
        return  -1;
    }

    //Using Moore’s Voting Algorithm- O(n) Time and O(1) Space
    public  static  int majorityElement3(int arr[])
    {
        int n = arr.length;
        int candidate=-1;
        int count=0;
        return 0;
    }

    public  static  void main(String[]args)
    {
        int[] arr = {1, 1, 2, 1, 3, 5, 1};
        System.out.println(majorityElement2(arr));
    }
}

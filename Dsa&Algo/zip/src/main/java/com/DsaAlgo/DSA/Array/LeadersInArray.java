package com.DsaAlgo.DSA.Array;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class LeadersInArray
{
    /*
Given an array arr[] of size n, the task is to print all the Leaders in the array.
An element is a Leader if it is greater than all the elements to its right side.
Note: The rightmost element is always a leader.

Examples:

Input: arr[] = {16, 17, 4, 3, 5, 2}
Output: 17 5 2
    * */
    public  static ArrayList<Integer> findLeaderInArray(int []arr)
    {
        int n = arr.length;
        ArrayList<Integer>leader=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            int j;
            for( j=i+1;j<n;j++)
            {
                if(arr[j]>arr[i])
                    break;
            }
            if(j==n)
                leader.add(arr[i]);
        }
        return  leader;
    }

    //Using Suffix Maximum – O(n) Time and O(1) Space:
    public  static ArrayList<Integer> findLeaderInArray1(int []arr)
    {
        int n = arr.length;
        ArrayList<Integer> leader = new ArrayList<>();
        int maxRight = arr[n-1];
        leader.add(maxRight);
        for(int i=n-2;i>=0;i--)
        {
            if(arr[i]>maxRight)
            {
                maxRight=arr[i];
                leader.add(maxRight);
            }
        }
        Collections.reverse(leader);
        return  leader;
    }
    public  static  void main(String[]args)
    {
        int[] arr = {16, 17, 4, 3, 5, 2} ;
//        ArrayList<Integer> result = findLeaderInArray(arr);
        ArrayList<Integer> result = findLeaderInArray1(arr);
        for (int i : result)
            System.out.print(i+" ");
        System.out.println();
    }
}

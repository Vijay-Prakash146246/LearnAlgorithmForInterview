package com.DsaAlgo.DSA.Array;

import java.util.HashMap;

public class FindTheNumberOccurringOddNumberOfTimes
{
    /*
    Given an array of positive integers. All numbers occur an even number of times except one
    number which occurs an odd number of times. Find the number in O(n) time & constant space.
     */

    // using Nested Loop Time Complexity: O(n^2) Auxiliary Space: O(1)
    public  static  int getOddOccurrence(int [] arr)
    {
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
            int count=0;
            for(int j=0;j<n;j++)
            {
                if(arr[i]==arr[j])
                    count++;
            }
            if (count%2!=0)
                return arr[i];
        }
        return -1;
    }

//using Hashing Time Complexity: O(n) Auxiliary Space: O(n)
    public  static  int getOddOccurrence1(int [] arr)
    {
        HashMap<Integer,Integer>map = new HashMap<>();
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
            if (map.containsKey(arr[i]))
                map.put(arr[i],map.get(arr[i])+1);
            else
                map.put(arr[i],1);
        }
        for(Integer i:map.keySet())
        {
            if(map.get(i)%2!=0)
                return i;
        }
        return -1;
    }

    //using Bit Manipulation  Time Complexity: O(n) Auxiliary Space: O(1)
    /* XOR of all elements gives us odd occurring elements.
Here ^ is the XOR operators;
Note :
x^0 = x
x^y=y^x (Commutative property holds)
(x^y)^z = x^(y^z) (Distributive property holds)
x^x=0
    * */
    public  static  int getOddOccurrence2(int [] arr)
    {
        int n = arr.length;
        int value=0;
        for(int i=-0;i<n;i++)
        {
            value=value^arr[i];
        }
        return  value;
    }
    public  static  void main(String[]args)
    {
        int arr[] = { 2, 3, 9, 4, 9, 2, 4, 3, 9, 2, 4, 4, 2 };
        System.out.println(getOddOccurrence2(arr));
    }
}

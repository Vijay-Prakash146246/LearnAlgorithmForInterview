package com.DsaAlgo.CompanyDSA.PayPal;

import java.util.HashSet;

public class IntersectionOfTwoArraysWithDistinctElements
{
    //Intersection of Two arrays with Distinct Elements

    /*
    Given two unsorted arrays a[] and b[] each consisting of distinct elements,
    the task is to return the count of elements in the intersection
    (or common elements) of the two arrays.

Intersection of two arrays can be defined as the set containing distinct common
elements between the two arrays.
Examples:

Input: a[] = [89, 24, 75, 11, 23], b[] = [89, 2, 4]
Output: 1
Explanation: 89 is the only element in the intersection of two arrays.
Input: a[] = [1, 2, 3, 4, 5, 6], b[] = [3, 4, 5, 6, 7]
Output: 4
Explanation: 3 4 5 and 6 are the elements in the intersection of two arrays.
Input: a[] = [10, 20, 30, 40, 50], b[] = [15, 20, 25, 30, 35]
Output: 2
Explanation: 20 and 30 are the elements in the intersection of the two arrays.
    * */
    public static int numberofElementsInIntersection(int a[], int b[])
    {
        // Your code here
        int count=0;
        HashSet<Integer> hs =  new HashSet<>();
        for(int num:a)
            hs.add(num);

        for(int i=0;i<b.length;i++)
            if(hs.contains(b[i]))
                count++;

        return count;
    }
    public  static  void  main(String[]args)
    {
        int a[] = {10, 20, 30, 40, 50};
        int b[] = {15, 20, 25, 30, 50};
        System.out.println(numberofElementsInIntersection(a,  b));
    }
}

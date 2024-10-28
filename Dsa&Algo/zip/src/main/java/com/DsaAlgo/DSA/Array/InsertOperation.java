package com.DsaAlgo.DSA.Array;

public class InsertOperation
{
    /*
    * 1. Insert at the end:
In an unsorted array, the insert operation is faster as compared to a sorted array because
we don’t have to care about the position at which the element is to be placed.*/
    public  static  int insertEnd(int[]arr,int n,int arrCapacity,int key)
    {
        if(n>=arrCapacity)
            return  n;
        arr[n]=key;
        return (n+1);
    }
    public static  void main(String args[])
    {
        int []arr = new int[5];
        arr[0]=12;
        arr[1]=14;
        arr[2]=16;
        int n=3;
        int arrCapacity=5;
        int key =987;
        System.out.println("Array before insert ");
        for (int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
        int insert = insertEnd(arr,n,arrCapacity,key);
        System.out.println("\nArray after insert ");
        for (int i=0;i<insert;i++)
            System.out.print(arr[i]+" ");
    }
}
/*
*Time Complexity: O(1)
Auxiliary Space: O(1)
* */
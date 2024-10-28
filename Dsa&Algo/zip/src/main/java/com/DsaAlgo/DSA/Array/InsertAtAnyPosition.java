package com.DsaAlgo.DSA.Array;

public class InsertAtAnyPosition
{
    public  static  void  InsertAtAnyPosition(int []arr,int n,int pos,int value)
    {
        for(int i=n-1;i>=pos;i--)
        {
            arr[i+1]=arr[i];
        }
        arr[pos]=value;
    }
    public static  void main(String args[])
    {
        int arr[] = new int[15];
        arr[0] = 2;
        arr[1] = 4;
        arr[2] = 1;
        arr[3] = 8;
        arr[4] = 5;
        int n = 5;
        int value = 10, pos = 2;
        System.out.println("Array before insert ");
        for (int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
        InsertAtAnyPosition(arr,n,pos,value);
        System.out.println("\nArray after insert ");
        for (int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
}
/*
*Time complexity: O(N)
Auxiliary Space: O(1)
* */
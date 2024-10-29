package com.DsaAlgo.DSA.Array;

public class InsertInSortedArray
{
    public  static  int insertInSortedArray(int[]arr,int n,int key,int capacity)
    {
        if(n>=capacity)
            return  n;
        int i;
        for ( i=(n-1);(i>=0 && arr[i]>key);i--)
            arr[i+1]=arr[i];

        arr[i+1]=key;
        return (n+1);
    }
    public  static  void  main(String[]args)
    {
        int[]arr = new int[8];
        arr[0]=12;
        arr[1]=14;
        arr[2]=16;
        arr[3]=21;
        int capacity = arr.length;
        int n = 4;
        int key = 17;
        System.out.println("\nArray before insertion");
        for (int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
        n = insertInSortedArray(arr,n,key,capacity);
        System.out.println("\nArray after insertion");
        for (int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
}
/*
*
* Time Complexity: O(N) [In the worst case all elements may have to be moved]
Auxiliary Space: O(1)
* */
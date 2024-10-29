package com.DsaAlgo.DSA.Array;

public class DeleteInSortedArray
{
    public  static  int BinarySearch(int []arr,int low,int high,int key)
    {
        if(low>high)
            return  -1;
        int mid = low + (high - low)/2;;
        if (key == arr[mid])
            return  mid;
        if(key>arr[mid])
            return BinarySearch(arr,(mid+1),high,key);
        return BinarySearch(arr,low,(mid-1),key);
    }
    public  static  int deleteElement(int[]arr,int n,int key)
    {
        int pos=BinarySearch(arr,0,n-1,key);
        if(pos==-1) {
            System.out.println("\nElement not found in array");
            return n;
        }
        for(int i=pos;i<n-1;i++)
            arr[i]=arr[i+1];
        return  (n-1);
    }
    public static  void  main(String[]args)
    {
        int[]arr = {12,13,14,15,26,45,56,78,89};
        int n = arr.length;
        int key = 89;
        System.out.println("Array before deletion");
        for (int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
        n=deleteElement(arr,n,key);
        System.out.println("\nArray after deletion");
        for (int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
}
/*
*Time Complexity: O(N). In the worst case all elements may have to be moved
Auxiliary Space: O(log N). An implicit stack will be used
* */
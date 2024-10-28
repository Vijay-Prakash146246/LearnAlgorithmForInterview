package com.DsaAlgo.DSA.Array;

public class SearchOperation
{
    /*In an unsorted array, the search operation can be performed by linear traversal from the first element to the last element.*/
    public  static  int findElement(int[]arr,int len,int key)
    {
        for(int i=0;i<len;i++)
        {
            if(arr[i]==key)
                return i;
        }
        return  -1;
    }
    public static  void main(String args[])
    {
        int [] arr={10,12,23,34,56,76,87,98,80,967};
        int n = arr.length;
        int key = 809;
        int position = findElement(arr,n,key);
        if(position == -1)
        System.out.println("Element not found in Array");
        else
            System.out.println("Element found in Array at "+(position+1));
    }
}

/*
Time Complexity: O(N)
Auxiliary Space: O(1)*/

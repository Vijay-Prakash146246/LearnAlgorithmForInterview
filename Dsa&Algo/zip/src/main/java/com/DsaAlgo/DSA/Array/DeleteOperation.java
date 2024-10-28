package com.DsaAlgo.DSA.Array;

public class DeleteOperation
{
    /*
 Delete Operation:
In the delete operation, the element to be deleted is searched using the linear search, and then
the delete operation is performed followed by shifting the elements.
    * */
    public   static  int findElement(int[]arr,int n,int key)
    {
        for(int i=0;i<n;i++)
            if(arr[i]==key)
                return i;
        return  -1;
    }
    public  static  int  deleteElement(int []arr, int n,int key)
    {
        int pos = findElement(arr,n,key);
        if (pos==-1)
        {
            System.out.println("\nElement not found in array ");
            return  n;
        }
        for(int i=pos;i<(n-1);i++)
            arr[i]=arr[i+1];
        return  n-1;
    }

    public static void main(String args[])
    {
        int i;
        int arr[] = { 10, 50, 30, 40, 20 };
        int n = arr.length;
        int key = 300;

        System.out.println("Array before deletion");
        for (i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

        n = deleteElement(arr, n, key);

        System.out.println("\nArray after deletion");
        for (i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
/*
Time Complexity: O(N)
Auxiliary Space: O(1)
* */
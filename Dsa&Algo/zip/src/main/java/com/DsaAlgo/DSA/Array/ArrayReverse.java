package com.DsaAlgo.DSA.Array;

public class ArrayReverse
{
   // Using a temporary array – O(n) Time and O(n) Space
    public  static  void reverseArray(int[]arr)
    {
        int n = arr.length;
        int arr1[]=new int[n];
        for(int i=0;i<n;i++)
            arr1[i]=arr[n-i-1];
        for(int i=0;i<n;i++)
            arr[i]=arr1[i];
    }

    //Using Two Pointers – O(n) Time and O(1) Space
    public  static  void reverseArray1(int[]arr)
    {
        int left=0;
        int right=arr.length-1;
        while(left<right)
        {
            int temp = arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }

    //Using Recursion – O(n) Time and O(n) Space
    public  static  void reverseArray2(int[]arr,int left,int right)
    {
        if(left>=right)
            return;
            int temp = arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
        reverseArray2(arr,left+1,right-1);
    }
    public static  void main(String[]args)
    {
        int[]arr={1,2,3,4,65,34,36,67,89,65,34};
        int n = arr.length;
        System.out.println("Array before reverse");
        for (int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
        //reverseArray(arr);
        //reverseArray1(arr);
        ArrayReverse.reverseArray2(arr,0,n-1);
        System.out.println("\nArray after reverse");
        for (int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
}

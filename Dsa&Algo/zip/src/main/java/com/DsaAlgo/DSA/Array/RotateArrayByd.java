package com.DsaAlgo.DSA.Array;

public class RotateArrayByd
{
    /*
    Given an array of integers arr[] of size n, the task is to rotate the array elements to the left by d positions.

    Examples:

    Input: arr[] = {1, 2, 3, 4, 5, 6}, d = 2
    Output: {3, 4, 5, 6, 1, 2}
    Explanation: After first left rotation, arr[] becomes {2, 3, 4, 5, 6, 1} and after the second rotation, arr[] becomes {3, 4, 5, 6, 1, 2}


    Input: arr[] = {1, 2, 3}, d = 4
    Output: {2, 3, 1}
    * */

    /*
    [Naive Approach] Rotate one by one – O(n * d) Time and O(1) Space
    In each iteration, shift the elements by one position to the left in a circular fashion (the first element becomes the last).
    Perform this operation d times to rotate the elements to the left by d positions.
    * */

    public  static  void rotateArray(int[]arr,int d)
    {
        int n = arr.length;
        for(int i=0;i<d;i++)
        {
            int firstElement=arr[0];
            for(int j=0;j<n-1;j++)
            arr[j]=arr[j+1];
            arr[n-1]=firstElement;
        }
    }

    /*
    *[Better Approach] Using Temporary Array – O(n) Time and O(n) Space
    * */
    public  static  void rotateArray1(int[]arr,int d)
    {
        int n = arr.length;
        int[]tempArr=new int[n];
        //if d>n so here we handle this
        d = d%n;

        for(int i=0;i<n-d;i++)
            tempArr[i]=arr[i+d];

        for (int i=0;i<d;i++)
            tempArr[n-d+i]=arr[i];

        for(int i=0;i<n;i++)
            arr[i]=tempArr[i];
    }

    /*
    [Expected Approach 2] Using Reversal Algorithm – O(n) Time and O(1) Space
    The idea is based on the observation that if we left rotate the array by d positions, the last (n – d) elements will be at the front and
    the first d elements will be at the end.


    Reverse the subarray containing the first d elements of the array.
    Reverse the subarray containing the last (n – d) elements of the array.
    Finally, reverse all the elements of the array.
    * */

    public  static  void rotateArray2(int[]arr,int d)
    {
        int n = arr.length;
        //handling if d>n
        d = d%n;
        rotateArray(arr,0,d-1);
        rotateArray(arr,d,n-1);
        rotateArray(arr,0,n-1);
    }
    public  static  void rotateArray(int[]arr,int start,int end)
    {
        while (start<end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

    public  static  void main(String[]args)
    {
        int[]arr={ 1, 2, 3, 4, 5, 6 };
        int d=2;
        System.out.println("Array before rotation ");
        for (int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");

        rotateArray2(arr,d);

        System.out.println("\nArray after rotation ");
        for (int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
}

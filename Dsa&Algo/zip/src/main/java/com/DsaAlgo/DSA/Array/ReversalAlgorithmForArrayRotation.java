package com.DsaAlgo.DSA.Array;

public class ReversalAlgorithmForArrayRotation
{
    /*
    *Given an array arr[] of size N, the task is to rotate the array by d position
     to the left.

    Examples:

    Input:  arr[] = {1, 2, 3, 4, 5, 6, 7}, d = 2
    Output: 3, 4, 5, 6, 7, 1, 2
    Explanation: If the array is rotated by 1 position to the left,
    it becomes {2, 3, 4, 5, 6, 7, 1}.
    When it is rotated further by 1 position,
    it becomes: {3, 4, 5, 6, 7, 1, 2}


    Input: arr[] = {1, 6, 7, 8}, d = 3
    Output: 8, 1, 6, 7
    * */

     /*
    [Expected Approach 2] Using Reversal Algorithm – O(n) Time and O(1) Space
    The idea is based on the observation that if we left rotate the array by d positions, the last (n – d) elements will be at the front and
    the first d elements will be at the end.


    Reverse the subarray containing the first d elements of the array.
    Reverse the subarray containing the last (n – d) elements of the array.
    Finally, reverse all the elements of the array.
    * */

    public  static  void rotateArray(int[]arr,int d)
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
        int d=4;
        System.out.println("Array before rotation ");
        for (int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");

        rotateArray(arr,d);

        System.out.println("\nArray after rotation ");
        for (int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
}

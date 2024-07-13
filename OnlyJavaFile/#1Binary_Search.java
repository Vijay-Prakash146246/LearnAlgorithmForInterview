/*
Company Tags
Infosys Oracle  Wipro Linkedin Qualcomm TCS Cognizant Accenture 

Binary Search
Difficulty: BasicAccuracy: 44.32%Submissions: 490K+Points: 1
Given a sorted array arr and an integer k, find the position(0-based indexing) at which k is present in the array using binary search.
Examples:

Input: k = 4, arr= [1, 2, 3, 4, 5]  
Output: 3
Explanation: 4 appears at index 3.

Input: k = 445, arr= [11, 22, 33, 44, 55] 
Output: -1
Explanation: 445 is not present.

Expected Time Complexity: O(logn)
Expected Space Complexity: O(logn) 

Note: Try to solve this problem in constant space i.e O(1)

Constraints:
1 <= arr.size() <= 105
1 <= arr[i] <= 106
1 <= k <= 106

*/
class BinarySearch 
{
	 public int binarysearch(int[] arr, int k) 
    {
        // Code Here
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            //Here we basically find the mid element for comparision 
            int mid=(start+end)/2;
            //if we found the element then we return its index 
            if(arr[mid]==k)
            return mid;
            //if mid element of array greater than required element 
            //then search in the first half  element 
            //else search in next half element 
            else if(arr[mid]>k)
            end=mid-1;
            else
            start=mid+1;
        }
        return -1;
    }
	public static void main(String[] args) 
	{
		int arr[] = {1, 2, 3, 4, 5};
		int k = 5;
		System.out.println(new BinarySearch ().binarysearch(arr, k));
	}
}

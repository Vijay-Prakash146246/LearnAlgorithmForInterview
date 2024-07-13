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
		int k = 4;
		System.out.println(new BinarySearch ().binarysearch(arr, k));
	}
}

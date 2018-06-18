/*

Given an array arr[] of integers, find out the maximum difference between any two
elements such that larger element appears after the smaller number.

*/
public class MaxDiff1 {

	
	public static void main(String[] args) {
		int []  arr =  {2, 3, 10, 6, 4, 8, 1} ; 
		//int []  arr = {7, 9, 5, 6, 3, 2};
		
		System.out.println("Maximum difference given condition is : "+ func (arr ));
	}
	private static int func(int[] arr) {	
		//find maximum element 
		int max_diff  = Integer.MIN_VALUE; 
		
		int min_element = arr[0] ; 
		
		for(int  i = 1 ; i < arr.length ; i ++)
		{
			if(arr[i] - min_element > max_diff )
				max_diff = arr[i] - min_element ;
			
			if(arr[i] < min_element )
			{
				min_element = arr [i] ; 
			}
		}
		return max_diff;
	}
}

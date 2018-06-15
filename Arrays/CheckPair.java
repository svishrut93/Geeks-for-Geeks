/*
Program that, given an array A[] of n numbers and another number x, 
determines whether or not there exist two elements in S whose sum is exactly x.
*/

import java.util.*; 


public class CheckPair {
	
	public static void main (String[] args)
    {
        int A[] = {1, 4, 45, 6, 10, 8};
        int sum = 16;
        findPair(A,  sum);
    }

	private static void findPair(int[] arr, int sum) {
		// TODO Auto-generated method stub
		
		Map<Integer,Integer> hm = new HashMap <Integer, Integer>() ; 
		
		for(int i = 0 ; i < arr.length ; i ++ )
		{
			int diff = sum - arr[i] ; 
			if(hm.containsKey(arr[i]))
				System.out.println("Found elements : "+ arr[i] +"and  "+ diff );
			else 
				hm.put(diff, arr[i]);
		}
	}
}

/*
Given an array of n integers.
The task is to find the first element that occurs k number of times. 
If no element occurs k times the print -1. 
The distribution of integer elements could be in any range.
*/

import java.util.*;
public class ktimes {
	
	public static void main(String[] args) {
		int[] arr = {1, 7, 4, 3, 4, 8, 7,3};
		int k = 2; 
		System.out.println("First number in array occuring "+ k+" times is : "+ ktimes(arr, k ));	
	}

	private static int ktimes(int[] arr, int k) {
		// TODO Auto-generated method stub
		Map<Integer,Integer> hm = new HashMap <Integer,Integer>() ; 
		
		for(Integer i : arr)
		{
			if(hm.containsKey(i))
				hm.put(i, hm.get(i)+1);
			else
				hm.put(i, 1);
			
			if (hm.get(i)==k )
				return i ; 
		}
		return -1 ; 
	}
	

}

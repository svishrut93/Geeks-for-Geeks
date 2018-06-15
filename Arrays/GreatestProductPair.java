import java.util.* ; 
/*
Find pair with greatest product in array
Given an array of n elements, the task is to find the greatest number such that it is product of two elements of given array. 
If no such element exists, print -1. 
Elements are within the range of 1 to 10^5
*/

public class GreatestProductPair {
	
	public static void main(String[] args)
	{
		
		int []arr = {30, 10, 9, 3, 35};
        int len  = arr.length;
        System.out.println("Maximum product generated from array is "+func(arr , len ));
		
	}

	private static int func(int[] arr, int len) {
		// TODO Auto-generated method stub
		int max_prod = Integer.MIN_VALUE; 
		Map <Integer , Integer > hm = new HashMap <Integer,Integer>() ; 
		
		
		Set <Integer> hs = new HashSet<Integer>() ; 
		
		for(Integer i : arr)
		{
			hs.add(i);
		}
		
		int max = Integer.MIN_VALUE; 
		
		for(int i = 0 ; i < len-1 ; i ++ )
		{
			for(int j = i+1 ; j < len ; j ++)
			{
				int prod = arr[i]*arr[j]; 
				if(prod>max_prod)
				{
					max_prod = prod ; 
				}
				
				if(hs.contains(prod))
				{
					System.out.println("Found element : "+ prod);
				}
			}
		}
		return max_prod ; 
	}

}

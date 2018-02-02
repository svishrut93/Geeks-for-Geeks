package g4g;

//Write a java program that,
//given an array A[] of n numbers and another number x, 
//determines whether or not there exist two elements in S whose sum is exactly x.


import java.util.Scanner ; 

import java.util.Arrays; 

public class checkforsum {
	
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in) ; 
		System.out.println("Enter size of array ");
		int n = s.nextInt(); 
		
		int arr [] = new int[n ]; 
		
		System.out.println("Enter elements of array ");
		for(int i = 0 ; i < n ; i++) 
		{
			arr[i] = s.nextInt(); 
		}
		
		System.out.println("Enter sum to check  ");
		int x = s.nextInt(); 
		
		
		boolean ans = checksum(arr, x ); 
		
		
		if(ans==true )
			System.out.println("Sum exists  ");
		else
			System.out.println("Sum does not exist  ");
			
	}

	private static boolean checksum(int[] arr, int x) {
		// TODO Auto-generated method stub
		
		
		Arrays.sort(arr);
		System.out.printf("Modified arr[] : %s",Arrays.toString(arr));
		
		
		int start = 0 ; 
		int end  = arr.length-1; 
		while (start<end )
		{
			if(arr[start]+arr[end] == x )
				return true ; 
			
			else if(arr[start]+arr[end] < x )
			{
				start++ ; 
				
			}
			
			else
			{
				end-- ; 
			}
		}
		
		return false;
	}

}

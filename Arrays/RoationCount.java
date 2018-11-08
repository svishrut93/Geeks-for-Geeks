package g4g;

//Consider an array of distinct numbers sorted in increasing order. 
//The array has been rotated (anti-clockwise) k number of times. Given such an array, find the value of k.

//Another approach to solving this problem:
//If we take closer look at examples, we can notice that the number of rotations is equal to index of minimum element.
//A simple linear solution is to find minimum element and returns its index. Below is JAVA implementation of the idea.

import java.util.Arrays;
import java.util.Scanner; 
public class RoationCount {
	
	
public static void main(String[] args) 
{
		
		Scanner s = new Scanner (System.in) ; 
		System.out.println("Enter size of array ");
		int n = s.nextInt(); 
		
		int arr [] = new int[n ]; 
		
		System.out.println("Enter elements of rotated  array ");
		for(int i = 0 ; i < n ; i++) 
		{
			arr[i] = s.nextInt(); 
		}
		int ans = countRotate(arr); 
		System.out.println(ans);				
}

		private static int  countRotate(int[] arr)
		{
				// TODO Auto-generated method stub
			int count = 1 ; 
			boolean temp = false; 
			for(int i = 1; i <arr.length ; i ++ )
			{
				if(arr[i] >arr[i-1])
				{
					count++; 
				}
				
				else
				{
					temp = true; 
					break; 
				}
			}
			if(temp == false )
			{
				count = 0 ; 
			}
			
			return count ; 		
		}
}

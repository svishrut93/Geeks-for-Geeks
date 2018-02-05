package Strings;

//Given a string and a number k, find the k’th non-repeating character in the string.
//Consider a large input string with lacs of characters and a small character set. 
//How to find the character by only doing only one traversal of input string?


import java.util. Scanner ; 

public class kthnonrepeat {
	
	
	public static void main(String[] args) 
	{
		Scanner s = new Scanner (System.in); 
		
		System.out.println("Enter string ");
		
		String str = s.nextLine(); 
		
		System.out.println("Enter value for k  ");
		
		int k = s.nextInt() ; 
		
		int ans = nonrepeat(str, k );
		
		//System.out.println(ans);
		
		if(ans ==-1)
		{
			System.out.println("Kth non repeating does not exist ");
		}
		else
		{
			char ch = (char) ans;
			System.out.println("The kth non-repeating character is "+ ch);
	
		}
			
	}
	
	public static int nonrepeat (String str , int k )
	{
		
		int arr[] = new int[256] ; 
		
		for(int i = 0 ; i < str.length() ; i ++ )
		{
			int temp = str.charAt(i); 
			//System.out.println(temp);
			
			arr[temp]++ ; 
		}
		
		int counter = 0 ; 
		for(int i = 0 ; i < arr.length ; i ++ )
		{
			if(arr[i] == 1 )
			{
				++counter ; 
				if(counter == k)
				{
					return i ; 
				}
				
			}
		}
		return -1;
	}

}

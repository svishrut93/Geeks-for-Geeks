public class Zigzag {
		
/*
	Convert array into Zig-Zag fashion
	Given an array of distinct elements, rearrange the elements of array in zig-zag fashion in O(n) time.
	The converted array should be in form a < b > c < d > e < f.	
*/	
	public static void main(String[] args) {	
		int [] arr = {		4, 3, 7, 8, 6, 2, 1		} ; 
		zigag (arr); 
	}

	private static void zigag(int[] arr) {
		// TODO Auto-generated method stub
		int length = arr.length ; 

		//true shows that the relationship must be 		< 
		//false shows that the relationship must be 	> 
		
		boolean flag = true ; 
		
		for( int i = 0 ; i <= arr.length-2 ; i ++ )
		{
			if (flag) 
			{
				if (arr[i]>arr[i+1])
				{
					int temp =  arr [i] ; 
					arr[i] 	 =  arr [i+1] ; 
					arr[i+1] =  temp ; 
				}
			}
			else 
			{
				if (arr [i]< arr[i+1] ) 
				{
					int temp =  arr [i] ; 
					arr[i] 	 =  arr [i+1] ; 
					arr[i+1] =  temp ; 
				}
			}
		flag = !flag ; 	
		}
		
		for ( int i = 0 ; i < arr.length ; i ++ )
		{
			System.out.print(" "+arr[i]+"  ");
		}
	}

}

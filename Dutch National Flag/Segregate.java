import java.util.* ; 

/*
Sort an array of 0s, 1s and 2s
Given an array A[] consisting 0s, 1s and 2s, write a function that sorts A[]. 
The functions should put all 0s first, then all 1s and all 2s in last.

*/
public class Segregate {

	public static void main(String[] args)
	{
		int arr[] = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
		int length = arr.length ; 
		func (arr , length ) ; 
		
		
	}

	private static void func(int[] arr, int length) {
		// TODO Auto-generated method stub	
	int low = 0 ; 
	int mid = 0 ; 
	int high = length - 1 ; 
	
	while (mid <= high )
	{
			switch (arr[mid ])
			{
				case 0 : 
					//swap (arr[low],arr[mid])
					swap (low,mid,arr);
					mid++; low ++ ; 
					break ; 				
				case 1 : 
					
					mid ++ ;
					break ; 
				case 2 : 
					//swap (arr[mid],arr[high])
					swap (mid,high,arr);
					
					high-- ; 
					break ; 
			}	
	}	
	display ( arr ); 

	}

	private static void display(int[] arr) {
		// TODO Auto-generated method stub
		for(int i = 0 ; i < arr.length ; i ++ )
		{
			System.out.print(" "+arr[i]+" ");
		}
		
	}

	private static void swap(int index1, int index2, int[] arr) {
		// TODO Auto-generated method stub
		int temp = arr [index1]; 
		arr[index1] = arr[index2];
		arr[index2] = temp ; 
	}
}

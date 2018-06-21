/*
Search in a row wise and column wise sorted matrix
Given an n x n matrix and a number x, find position of x in the matrix if it is present in it.
Else print “Not Found”. In the given matrix, every row and column is sorted in increasing order.
The designed algorithm should have linear time complexity.
*/

public class SortedMatrixSearch {	
	public static void main(String[] args) {
			int matrix[][] = { 
							   {10, 20, 30, 40},
							   {15, 25, 35, 45},
							   {27, 29, 37, 48},
							   {32, 33, 39, 50}
							   };
			int element = 29 ;
			toSearch (matrix , element ) ; 
	}

	private static void toSearch(int[][] matrix, int element) {
		// TODO Auto-generated method stub
		int row_wise = 0  ; 
		
		boolean found = false   ; 
		int col_wise = matrix[0].length-1; 
		
		//int ele_in_matrix = matrix [row_wise][col_wise] ; 
		
		while (row_wise < matrix.length && col_wise >=0 ) 
		{
			int ele_in_matrix = matrix [row_wise][col_wise] ; 
			if (element == ele_in_matrix )
			{
				found  = true ; 
				break ; 	
			}
			else if (ele_in_matrix < element )
				{
				row_wise++ ;
			//	System.out.println(row_wise);
				}
			else 
				{
				col_wise -- ; 
				
				}
		}
		if (found == true ) 
		{
			System.out.println("element found at position "+ row_wise +"  "+ col_wise );	
		}
		else 
		{
			System.out.println("Element is not in matrix ");
		}
			
	}
}

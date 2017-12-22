//Given a binary matrix, find out the maximum size square sub-matrix with all 1s.

package maximumSizesquareSubMatrix;

import java.util.*; 


public class squareSub {
	
	public static void main(String args[])
	{
		int [][] input = {
							{0,	1,	1,	0,	1},
						   {1,	1,	0,	1,	0},
						   {0,	1,	1,	1,	0},
						   {1,	1,	1,	1,	0},
						   {1,	1,	1,	1,	1},
						   {0,	0,	0,	0,	0},
						   
						};
		
		int [][] SumMat = new int [6][5];
		
		
		//initialize the first row and the first column of SumMat same as input 
		
		for(int i = 0 ; i < 6 ; i ++)
		{
			SumMat[i][0] = input[i][0];
		}
		
		
		for(int i = 0 ; i < 5 ; i ++)
		{
			SumMat[0][i] = input[0][i];
		}
		
		//Applying Dynamic Programming Conditions 
		
		
		for (int i = 1 ; i <6 ; i ++)
		{
			for(int j = 1 ; j < 5 ; j++ )
			{
				if (input [i][j]==1)
				{
					SumMat[i][j] = Math.min( SumMat[i][j-1],Math.min(SumMat[i-1][j], SumMat[i-1][j-1] ) )+1;
				}
				
				else if (input [i][j]==0)
				{
					SumMat[i][j] = input[i][j] ; 
				}
			}
		}
		
		
		//Printing the SumMatarray 
		
		System.out.println("Value of matrix created after DP : ");
		
		for( int i = 0 ; i < 6; i ++)
		{
			for ( int j = 0; j < 5 ; j ++)
			
			{
				
				System.out.print(SumMat[i][j]+ "	");
			}
			
			System.out.println();
			
		}
		
		
		//Finding maximum value inside matrix :
		
		int[] maximum_vals = new int [3];
		maximum_vals = maxOfMat(SumMat);
		
		
		System.out.println("The maximum size square sub-matrix with all 1's is .."+maximum_vals[0]+" X "+maximum_vals[0]);
		
		System.out.println("The submatrix is : ");
		
		display(input , maximum_vals); //Display the sub matrix 
		
		
		
	}
	
	public static int[] maxOfMat (int [][] SumMat)
	{
		int[] maximum_vals = new int[3];
		
		maximum_vals[0] = Integer.MIN_VALUE;
		maximum_vals[1] = 0 ; 
		maximum_vals[2] = 0 ; 
		
		for(int i = 0 ; i < 6 ; i++)
		{
			for (int j = 0 ; j < 5 ; j++ )
			{
				if (SumMat[i][j]>maximum_vals[0] )
				{
					maximum_vals[0] = SumMat[i][j]; 
					maximum_vals[1]= i ;
					maximum_vals[2]= j ;
				}
			}
		}
		return maximum_vals;
		
	}
	
	
	public static void display(int[][] input , int[] maximum_vals)
	{
		System.out.println("Maximum size sub-matrix is: ");
        for(int i = maximum_vals[1]; i > maximum_vals[1] - maximum_vals[0]; i--)
        {
            for(int j = maximum_vals[2]; j > maximum_vals[2] - maximum_vals[0]; j--)
            {
                System.out.print(input[i][j] + " ");
            }  
            System.out.println();
        }  
	}

}

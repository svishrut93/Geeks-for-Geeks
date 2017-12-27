//Program for finding minimum cost path given a set of constraints using Dytnamic Programming 


package MinCostPathGivenConstraints;

import java.util.*;

public class MinCost {
	
	
	//Driver
	
	public static void main(String[] args) {
		
	Scanner s = new Scanner (System.in); 
	
		
	int[][] inputMat = {{1,2,3},
						{4,8,2},
						{1,5,3}	}; 
	
	
	System.out.println("Input matrix : ");
	
	for(int i = 0 ; i < inputMat.length; i ++)
	{
		for(int j = 0 ; j < inputMat[0].length; j ++)
		{
			System.out.print(inputMat[i][j]+"	");
		}
		System.out.println();
	}
	
	System.out.println("Enter the indices to which you want to find the minimum path ");
	int index1 = s.nextInt();
	int index2 = s.nextInt();
	
	
	//Call the DP function : 
	minCostDP (inputMat,index1 ,index2 ); 
		
		
	}
		
	//Function with dynamic programming solution 
	public static void minCostDP(int [][] mat , int i1 , int i2 )
	
	{
		//Create a total cost matrix
		//It is sufficient to have size of total cost same as that of max(inidces) 
		
		int [][] totalCost = new int [i1+1] [i2+1];
		
		
		totalCost[0][0] = mat[0][0]; 
		
		
		//Initialize first row of total cost 
		for(int i = 1 ; i <i2+1 ;  i ++)
		{
			totalCost[0][i] = totalCost[0][i-1]+mat[0][i];
		}
		
		//Initialize first column of totalcost 
		
		for(int i = 1 ; i < i1+1 ; i ++)
		{
			totalCost[i][0] = totalCost[i-1][0]+mat[i][0];
				
		}
		
		//Filling the remain positions of totalCost
		
		//According to constraints we can only traverse in 3 ways 
		// 0,0 --> 0,1
		// 0,0 --> 1,0 
		// 0,0 --> 1,1 
		
		for(int i = 1 ; i <  i1+1 ; i ++ )
		{
			for (int j = 1 ; j < i2+1 ; j ++)
			{
				totalCost[i][j] = 
						Math.min(totalCost[i-1][j],Math.min(totalCost[i][j-1], totalCost[i-1][j-1])) + mat[i][j];
			}
		}
		
		//Print the totalCost matrix 
		
		System.out.println("The total cost matrix is "); 
		
		for( int i = 0 ; i < i1+1; i ++)
		{
			for(int j = 0 ; j < i2+1; j++)
			{
				System.out.print(totalCost[i][j]+"	");
				
			}
			System.out.println();
		}
		
		System.out.println("The minimum path is .. "+totalCost[i1][i2]);
	
		
	}

}

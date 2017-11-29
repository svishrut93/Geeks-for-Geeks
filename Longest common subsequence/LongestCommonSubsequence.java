package geeks4geeks;
import java.util.Scanner; 

public class LongestCommonSubsequence {
	
	public static void main(String[] args)
	{
		Scanner s = new Scanner (System.in);
		System.out.println("Enter first string : ");
		String FIRST = s.next();
		System.out.println("Enter second string : ");
		String SECOND = s.next();
		
		char[] s1 = FIRST.toCharArray();
		char[] s2 = SECOND.toCharArray();
		
		int len1 = FIRST.length()+1;  // Adding one for the matrix
		int len2 = SECOND.length()+1 ; //Adding one for the matri 
		int answer  = LCS(s1,s2,len1,len2);
		
		
		System.out.println("\n\n Length of longest common subsequence  = "+answer);
		
		
	}
	
	public static int LCS (char[] s1 , char[] s2 , int len1 , int len2)
	{
		//Construct a matrix and initialize the first row AND FIRST COLUMN = 0 
		int [][] DP = new int [len1][len2];
		
		for (int i = 0 ; i < len1; i ++)
		{
			for ( int j = 0 ; j < len2 ; j++)
			{
				if(i==0 || j==0)
				{
					DP[i][j]=0;
				}
				
				else if (s1[i-1]==s2[j-1])
				{
					DP[i][j]= DP[i-1][j-1]+1;
					
				}
				else
				{
					DP[i][j] = Math.max(DP[i-1][j],DP[i][j-1]); 	
				}
			}
			
		}

		//Display DP 
		
		for(int i = 0 ; i<len1 ; i ++)
		{
			System.out.println();
			for(int j =0 ; j < len2; j++)
			{
				System.out.print(DP[i][j]+ "\t");
			}
		}
		
		 return DP[len1-1][len2-1]; 

	}
	
}

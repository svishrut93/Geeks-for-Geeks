package geeks4geeks;
import java.util.Scanner;

//finding combination for a given nCk

//Given 2 integers n and k , finding nCk = n! / k! (n-k)!

public class Combination {
	
	public static void main(String args[])
	{
		Scanner s = new Scanner (System.in);
		System.out.println("Enter value of n ");
		int n = s.nextInt();
		System.out.println("Enter value of k ");
		int k = s.nextInt(); 
		
		int nfact =1 ;
		int nminusk_fact = 1; 
		int kfact = 1; 
		
		//Passing these 3 to the fact method : 
		nfact =fact(n,nfact);
		nminusk_fact=fact((n-k),nminusk_fact); 
		kfact = fact(k,kfact); 
		
	
		displaynfact(nfact);
		displaynminuskfact(nminusk_fact);
		displaykfact(kfact);
		
		
		System.out.println("Result for combination is ...");
		try
		{
		int combination = nfact/((nminusk_fact)*kfact);
		System.out.println("Combination is "+combination);
		
		}
		catch(Exception e)
		{
			System.out.println("Division by zero not allowed");
		}
		finally{
			System.out.println("Exit");
		}
		
	}
	
	public static int fact( int number , int answer )
	{
		
		if (number ==1)
			return number; 
		return answer =number * fact(number-1,answer); 
	}
	
	public static void displaynfact(int answer)
	{
		System.out.println("n factorial is : " +answer);
	}
	public static void displaynminuskfact(int answer)
	{
		System.out.println("n - k factorial is : " +answer);
	}
	
	
	public static void displaykfact(int answer)
	{
		System.out.println("k factorial is " +answer);
	}
	
}

package FibbonacciPackage;

import java.util.Scanner;

public class FibonaaciRecurssion {
	
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter number to know its Fibonacci ");
		
		int n = s.nextInt(); 
		
		int ans = fib (n ) ; 
		
		
		System.out.println("Answer is "+ans  );
			
		}

	private static int fib(int i)
	{
		// TODO Auto-generated method stub
		
		int ans ; 
		
		if(i==1 ) 
		{
			ans = 0 ;
		}
		else if (i ==2)
		{
			ans = 1 ; 
		}
		else
		{
			ans = fib (i-1)+fib(i-2);
		}
		
		return ans ; 
	}

}

package FibbonacciPackage;

import java.util.*;


public class BasicFibonacci {
	
	public static void main(String[] args) {
	
	Scanner s = new Scanner(System.in);
	
	System.out.println("Enter number to know its Fibonacci ");
	
	int n = s.nextInt(); 
	
	int [] Arr = new int [n+1];
	
	Arr[0] = 0; 
	Arr[1] = 1 ; 
	
	for(int i = 2 ; i < n ; i ++)
	{
		Arr[i] = Arr[i-1]+Arr[i-2];
	}
	
	
	System.out.println("Answer is "+ Arr[n-1]);
		
	}
	
}

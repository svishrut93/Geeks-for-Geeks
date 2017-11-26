package geeks4geeks;
import java.util.Scanner;;

public class combination_recursive {
	
	
	public static void main(String args[])
	{
		Scanner s = new Scanner (System.in);
		System.out.println("Enter value of n ");
		long n = s.nextLong();
		System.out.println("Enter value of k ");
		long k = s.nextLong(); 
		
		
		long ans = binomialCoeff(n,k);
		System.out.println("answer = "+ans);
	}
	
	public static long binomialCoeff(long n, long k)
	{
	  // Base Cases
	  if (k==0 || k==n)
	    return 1;
	 
	  // Recur
	  return  binomialCoeff(n-1, k-1) + binomialCoeff(n-1, k);
	}

}

package geeks4geeks;


//finding factorial 
public class Factorial {

	
	public static void main (String args[])
	{
		int n = 7 ;  //input of choice 
		int ans1 = 1 ;
		int ans2 = 1 ;
		ans1 = fact1(n,ans1);
		System.out.println("Factorial according to iteration  ..."+ ans1);
		ans2 = fact2(n , ans2 );
		System.out.println("factorial according to recurssion ...."+ans2);
		
	}
	
	public static int fact1(int n,int ans)
	{
		for(int i = 1; i <= n ; i++ )
		
		{
			ans = ans * i ; 
		}
		return ans ; 
	}
	
	//factorial using recurssion 
	public static int fact2(int n,int ans2)
	{
		if (n ==1)
		{
			return n ; 
		}
		return ans2 = n * fact2(n-1, ans2 ); 
	}
	
	
}

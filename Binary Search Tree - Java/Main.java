package BasicProblems;

public class Main {
	
	
	public static void main(String[] args) {
		
		Binary_Tree bt = new Binary_Tree(100);
		

		
		bt.add(75);
		bt.add(80);
		bt.add(125);
		 
		display(bt);
		
	}
	
	public static void display(Binary_Tree bt )
	{
		System.out.println(bt.data + "---->");
		
		try
		{
		display(bt.left);
		}
		catch (Exception   ex )
		{
			System.out.println("Nothing on left ");
			
		}
		
		
		try
		{
		display(bt.right);
		}
		catch (Exception   ex )
		{
			System.out.println("Nothing on right");
			
		}
		//display(bt.right); 
		
	}
	
	
}

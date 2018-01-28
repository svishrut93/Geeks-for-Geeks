package BasicProblems;

public class Binary_Tree {
	
	int data ;   
	Binary_Tree left ; 
	Binary_Tree right ; 

	
	public Binary_Tree( int data)
	{
		
		this.data = data; 
		this.left = null;
		this.right = null ; 	
	}
	
	public void add ( int num )
	{
		
		if(num <this.data)
		{
			if (this.left==null)
			{
				this.left = new Binary_Tree(num);
			}
			else
			{
				this.left.add(num);
			}
			
		}
		
		else if ( num > this.data)
		{
			if(this.right==null)
			{
				this.right = new Binary_Tree(num);
				
			}
			else
			{
				this.right.add(num);
			}
		}
		
		
		
	}
	

	public void preorder()
	{
		
		System.out.println(this.data);
		
		if(this.left!=null)
		{
			this.left.preorder();
		}
		
		if(this.right!=null)
		{
			this.right.preorder();
		}
		
	}
	
	public void inorder()
	{
			if( this.left != null ) 
			{
				this.left.inorder();
			}
			
			System.out.println( this.data );
			
			if( this.right != null ) 
			{
				
			this.right.inorder();
			
			}
		
	}
	
	public void postorder()
	{
		
		if( this.left != null ) 
		{
			this.left.postorder();
		}
		

		
		if( this.right != null ) 
		{
			
		this.right.postorder();
		
		}
		
		System.out.println( this.data );
		
	}
	
}
	

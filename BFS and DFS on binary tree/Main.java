
import java.util.*; 

public class Main {
	
	
	public static void main(String[] args) 
	{
		
		Node root = new Node (10); 
		Node n1 = new Node (20); 
		Node n2 = new Node (30); 
		Node n3 = new Node (40); 
		Node n4 = new Node (50) ; 
		Node n5 = new Node (60); 
		Node n6 = new Node(740); 
		
		
		//Creating tree 1  
		
		root.left = n1 ; 
		root.right = n2 ; 
		
		
		n1.left = n3 ; 
		n1.right = n4 ; 
		
		
		n2.left = n5 ; 
		n2.right = n6 ; 
		
		
		
		//Creating tree 2 
		Node root2 = new Node (8); 
		Node p1 = new Node (5); 
		Node p2 = new Node (4);
		Node p3 =  new Node (9);
		Node p4 = new Node (7); 
		Node p5 = new Node (11);
		Node p6 = new Node (1);
		Node p7 = new Node (12); 
		Node p8 = new Node (3);
		Node p9 = new Node (2);
		
		
		
		root2.left = p1;
		root2.right = p2 ; 
		
		p1.left = p3 ; 
		p1.right = p4 ; 
		
		p2.right = p5 ;
		
		p4.left = p6 ; 
		p4.right = p7;
		
		p5.right = p8 ;
		
		p7.left = p9;
		
		
		
		
		
		
		
		Levelorder(root2); 
		
		System.out.println("Depth first search : Pre-order traversal is ");
		System.out.println("------------------------------------------------");
		DFSpreorder(root2); 
		System.out.println("Depth first search : In-order traversal is ");
		System.out.println("------------------------------------------------");
		DFSinorder(root2); 
		System.out.println("Depth first search : Post-order traversal is ");
		System.out.println("------------------------------------------------");
		DFSpostorder(root2); 
		
		
	}
	
	private static void DFSpreorder(Node pointer) 
	{
		
		System.out.println(pointer.data );
		if(pointer.left!= null )
		{
			DFSpreorder(pointer.left); 
		}
		
		if(pointer.right!= null )
		{
			DFSpreorder(pointer.right); 
		}
	
	}
	
	
	private static void DFSinorder(Node pointer) 
	{
		
		
		if(pointer.left!= null )
		{
			DFSinorder(pointer.left); 
		}
		System.out.println(pointer.data );
		
		if(pointer.right!= null )
		{
			DFSinorder(pointer.right); 
		}
	
	}
	
	private static void DFSpostorder(Node pointer) 
	{
		
		
		if(pointer.left!= null )
		{
			DFSpostorder(pointer.left); 
		}
		
		if(pointer.right!= null )
		{
			DFSpostorder(pointer.right); 
		}
		
		System.out.println(pointer.data );
	}
	

	public static void Levelorder( Node root )
	{
		
		System.out.println("Breadth First /Level order traversla of tree is ");
		System.out.println("------------------------------------------------");
		
		Queue <Node> queue = new LinkedList<Node>(); 
		Node temp_node = root ; 
		
		while (temp_node!= null )
		{
			System.out.println(temp_node.data);
			
			if(temp_node.left!= null )
			{
				queue.add(temp_node.left); 
			}
			
			if(temp_node.right !=null )
			{
				queue.add(temp_node.right); 
			}
			
			temp_node = queue.poll(); 
			
		}		
	}

}

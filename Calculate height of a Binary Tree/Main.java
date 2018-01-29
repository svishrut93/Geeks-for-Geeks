package Height_of_BT;

public class Main {
	
	
	public static void main(String[] args) {
		
		TreeNode one = new TreeNode(30);
		TreeNode two = new TreeNode(35);
		TreeNode three = new TreeNode(40);
		TreeNode four = new TreeNode(45);
		TreeNode five  = new TreeNode(50);
		TreeNode six  = new TreeNode(55);
		
		
		one.left = two ; 
		one.right = three ; 
		two.left = four ; 
		two.right = five ; 
		three.left = six ; 
		
		Tree t = new Tree(one); 
		
		
		int height  = findHeight (one );
		
		System.out.println("height of tree is "+height );
		
	
	}

	private static int findHeight(TreeNode t) {
		
		if (t == null )
			return 0; 
		
		
		int ans = Math.max(findHeight(t.left), findHeight(t.right))+1;
		return ans ;
		
			
	}
}
	




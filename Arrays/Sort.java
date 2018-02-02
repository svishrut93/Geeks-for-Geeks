package g4g;
import java.util.Arrays;



public class Sort {
	
	public static void main(String[] args)
    {
        // Our arr contains 8 elements
        int[] arr = {13, 7, 6, 45, 21, 9, 101, 102};
 
        Arrays.sort(arr);
 
        System.out.printf("Modified arr[] : %s",Arrays.toString(arr));
        
        System.out.println();
        for(int i = 0 ; i < arr.length; i++) 
		{
			System.out.println(arr[i ]);
		}
		
    }

}

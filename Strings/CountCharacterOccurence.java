package Prac;

public class CountCharacterOccurence {
	
	 public static void main(String[] args)
	    {
	        String s = "Java is java again java again";
	 
	        char c = 'a';
	        System.out.println("s length"+s.length());
	        
	        String m = s.replace("a", "");
	        System.out.println("m length "+m.length());
	        System.out.println(s);
	        System.out.println(m);

	        int count = s.length() - s.replace("a", "").length();
	 
	        System.out.println("Number of occurances of 'a' in "+s+" = "+count);
	    }
}

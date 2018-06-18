/*
Given a sequence of strings, the task is to 
find out the second most repeated 
(or frequent) string in the given sequence.(Considering no
two words are the second most repeated, there will be always a single word).
*/
import java.util.*;
import java.util.Map.Entry; 
public class IntoMap {
	
	public static void main(String[] args) {
		
		String [] arr = {"geeks", "for" , "feeks","geeks", "gels", "on" , "weeks","geeks","weeks"};
		
		String ans = ""; 
		int first_big  = Integer.MIN_VALUE;

		int second_big = Integer.MIN_VALUE; 
		
		Map <String , Integer> hm = new HashMap<String, Integer> () 
				{
					@Override
						public Integer get(Object key) {
						return containsKey(key) ? super.get(key) : 0;
					}
				};
		
		//Insert into hashmap
		for( String str : arr )
		{
			hm.put(str, hm.get(str)+1);
		}
		
		//Display contents of map
		
		System.out.println("Count of words : ");
		System.out.println("-------------------");
		for (Entry <String,Integer> ent : hm.entrySet())
		{
			System.out.println(ent.getKey()+ " "+ ent.getValue());
		}
		
		//Iterate over map and find second largest
		for (Entry <String,Integer> ent : hm.entrySet())
		{
			if(ent.getValue()>first_big)
			{
				second_big  = first_big ; 
				first_big = ent.getValue();	
			}
			
			else if (ent.getValue()>second_big && ent.getValue()<first_big )
			{
				second_big = ent.getValue();
				
			}
			
		}
		Iterator<Map.Entry<String, Integer>> itr = hm.entrySet().iterator();
		 while (itr.hasNext()) 
	       {
	           Map.Entry<String, Integer> entry = itr.next();
	           int v = entry.getValue();
	           if (v == second_big )
	                ans  = entry.getKey();
	       }
		System.out.println("Second most common word is : "+ ans );
	}

}

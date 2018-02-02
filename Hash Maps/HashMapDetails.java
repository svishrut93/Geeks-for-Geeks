package hashprac;

import java.util.HashMap;


public class HashMapDetails 
{	
	public static void main(String args[]) 
	{
	
	/* This is how to declare HashMap */
    HashMap<Integer, String> hmap = new HashMap<Integer, String>();
	
    hmap.put(22, "Batman");
    hmap.put(2, "Superman");
    hmap.put(7, "Spiderman");
    hmap.put(49, "Aquaman");
    hmap.put(3, "Flash ");
    
    
    
    System.out.println("Printing HashMap as key-value pairs");
    System.out.println("------------");
    for (Integer name: hmap.keySet()){

        String key =name.toString();
        String value = hmap.get(name).toString();  
        System.out.println(key + " " + value);  
    } 
    
    System.out.println("Shortcut to print the hashmap");
    System.out.println("------------");
    System.out.println(hmap);
    
    
    System.out.println("Get value for key 22 ");
    System.out.println("------------");
    System.out.println(hmap.get(22));
    
    
    System.out.println("Check if contais value : Superman");
    System.out.println("------------");
    System.out.println(hmap.containsValue("Superman"));
    
    
    System.out.println("Printing all valuess ");
    System.out.println("------------");
    System.out.println(hmap.values());
    
    System.out.println("Printing all keys ");
    System.out.println("------------");
    System.out.println(hmap.keySet());
    
    
    hmap.remove(2); 
    
    System.out.println("After removal of a key  .. ");
    System.out.println("------------");
    
    for (Integer name: hmap.keySet()){

        String key =name.toString();
        String value = hmap.get(name).toString();  
        System.out.println(key + " " + value);  
    } 
	}
}

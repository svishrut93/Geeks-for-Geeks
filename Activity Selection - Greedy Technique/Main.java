package Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		
		Event One = new Event ("Machine Learning ",12,25);
		Event Two = new Event ("Algorithms ", 10, 20 ); 
		Event Three = new Event("Data Structures ",27,30); 
		Event Four = new Event ("Networks",33,45);
		Event Five = new Event ("Databases",15 ,19);
		
		List <Event> al = new ArrayList(); 
		
		al.add(One);
		al.add(Two);
		al.add(Three); 
		al.add(Four);
		al.add(Five);
		
		
		/* Sort statement*/
		 
		   Collections.sort(al);
		   
		List <Integer> SortedEndTime = new ArrayList(); 
		List <Event> Temp = new ArrayList(); 
		List <Event> FinalOrder = new ArrayList();
		   
		   /* Sorted List*/
		   System.out.println("Sorted end time of evnts  :");
		   for(Event mover: al)
		   {
			   SortedEndTime.add(mover.end_time); 
			   Temp.add(mover);
			   System.out.println(mover.end_time);
			}	
		   
		   
		   //Choose the first activity 
		   FinalOrder.add(Temp.get(0));
		   
		   //Conditions for adding subsequent events : Greedy Approach 
		   	
		   for (int i = 1 ; i < Temp.size(); i ++)
		   {
			   if (Temp.get(i).start_time>=Temp.get(i-1).end_time)
			   {
				   FinalOrder.add(Temp.get(i));
				   
			   }
			   
		   }
		    
		   display(FinalOrder); 
		   
		   }

	private static void display(List<Event> finalOrder) {
		// TODO Auto-generated method stub
		
		  System.out.println("Order of Event selection after Greedy Strategy  :");
		
		 for(Event mover: finalOrder)
		   {
//			
			   System.out.println(mover.EventName);
			}			
	}

}

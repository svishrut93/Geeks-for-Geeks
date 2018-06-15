package Points;

/*
Given an array of pairs, find all symmetric pairs in it
Two pairs (a, b) and (c, d) are said to be symmetric if 
c is equal to b and a is equal to d. For example (10, 20) and (20, 10) are symmetric. 
Given an array of pairs find all symmetric pairs in it.
It may be assumed that first elements of all pairs are distinct
*/

import java.util.*;
public class Symmetric_Pairs {
	
	public static void main(String[] args) {
		Point p1 = new Point (11, 20) ; 
		Point p2 = new Point (30, 40) ; 
		Point p3 = new Point (5, 10)  ; 
		Point p4 = new Point (40, 30) ; 
		Point p5 = new Point (10, 5)  ; 
	
		
	/*	No pairs test case
		Point p1 = new Point (1, 2) ; 
		Point p2 = new Point (3, 4) ; 
		Point p3 = new Point (5, 10)  ; 
		Point p4 = new Point (40, 30) ; 
		Point p5 = new Point (100, 5)  ;
	*/
		Point [] arr = {p1 , p2 , p3 ,  p4 , p5 }; 
		
		Map <Integer,Integer> hm = new HashMap <Integer,Integer >() ; 
		Boolean check = false; 
		for (Point p : arr )
		{
			if (hm.containsKey(p.two ) && (hm.get(p.two).equals(p.one)) )
			{
				check = true ; 
				System.out.println("Found Symmetric pair : "+ p.one +"  " +p.two);
			}
			else
				hm.put(p.one, p.two); 
		}
		if(check == false )
		{
			System.out.println("No symmetric pairs ");
		}
	}
}

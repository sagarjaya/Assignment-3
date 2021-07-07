package com.assignment3.java;
import java.util.*;

public class SetHashset {

	public static void main(String[] args) {
		
		HashSet<String> h = new HashSet<String>();
        h.add("India");// Adding elements into HashSet using add()
        h.add("Australia");
        h.add("South Africa");
        h.add("India"); // adding duplicate elements in hashset

        System.out.println(h);
        
        System.out.println("List contains India or not:"+ h.contains("India")); //verify wheather India exist or not
  
        
        h.remove("Australia");// Removing items from HashSet using remove()
        System.out.println("List after removing Australia:" + h);
  
        System.out.println("Iterating over list:");
        Iterator<String> i = h.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
    }
        HashSet<String> clonedSet = new HashSet<String>();  
        clonedSet = (HashSet)h.clone();   //Clone the HashSet  
        System.out.println("The new clone set elements: " + clonedSet);     //Displaying the new Set after Cloning;  
      
        
        
	}
}

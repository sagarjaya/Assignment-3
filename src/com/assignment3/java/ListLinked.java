package com.assignment3.java;
import java.util.*;

public class ListLinked {

	public static void main(String[] args) {
	
        LinkedList<String> al= new LinkedList<>(); 
        al.add("abc");  
        al.add("pqr");  
        al.add("xyz");  
        al.add("lmn");  
        
        Iterator<String> itr=al.iterator();  
        while(itr.hasNext()){  // using iterator to print
         System.out.println(itr.next());  
        }  
        
        for (int i = 0; i < al.size(); i++) {  // Using the Get method 
            System.out.println(al.get(i) + " "); 
        } 
        al.add(1, "raj");   //Adding an element at the specific position  
        
        List<String> ll2=new LinkedList<String>();  
        ll2.add("Sonoo");  
        ll2.add("Hanumat");  	
       
        for (int i = 0; i < ll2.size(); i++) { 
            System.out.println("second linkedlist: "+ll2.get(i)); 
        } 
        
        al.addAll(ll2); //Adding second list elements to the first list  
        System.out.println("After invoking addAllmethod: "+al);  
        al.removeAll(ll2);
        al.removeLast(); 
        System.out.println("After removing 2nd list: "+al);
        al.addFirst("rew");
        System.out.println("After invoking addFirstmethod: "+al);  
       
	}
}

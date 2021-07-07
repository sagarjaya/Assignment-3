package com.assignment3.java;
import java.util.*;
public class QueuePriority {

	public static void main(String[] args) {
		 PriorityQueue<String> pq = new PriorityQueue<>();
	        pq.add("hello");
	        pq.add("For");
	        pq.add("holla");
	        pq.add("abc");
	        pq.add("xyz");
	        Iterator iterator = pq.iterator();
	        while (iterator.hasNext()) { //using iterator
	            System.out.println(iterator.next() + " ");
	        }
	        System.out.println("Does the Queue contains 'holla'? "+pq.contains("holla"));
	        
	        System.out.println(pq.poll());  // Printing the top element and removing it
	 
	      
	        System.out.println(pq.peek());  // Printing the top element again
	        
	        System.out.println("queue : "+pq);
	        pq.remove("holla");
	        System.out.println("after removing: "+pq);
	        System.out.println("is queue empty : "+pq.isEmpty());
	        
	        String[] arr = new String[5];
	        String[] arr1 = pq.toArray(arr);// to char array
	        System.out.println("The arr[] is:");
	        for (int j = 0; j < arr.length; j++)
	        {
	            System.out.println(arr[j]);
	}
	        
	        pq.clear();
	        System.out.println("after removing queue, is queue empty? : "+pq.isEmpty());
	}

}

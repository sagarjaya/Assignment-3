package com.assignment3.java;
import java.util.*;

public class ListArray {
	public static void main(String[] args) {
		
		List<Integer> arrli= new ArrayList<Integer>();
		arrli.add(1);
		arrli.add(2); 
		arrli.add(4);
		arrli.add(3);
		System.out.println(arrli); 
		
		for(int i:arrli) { // print using for each
			System.out.println(i);	
		}
		 for (int i = 0; i < arrli.size(); i++) { // print using forloop
	            System.out.println("using for loop : "+arrli.get(i));
		 }

		arrli.remove(1);
		System.out.println(arrli);//after removing
		
		
		System.out.println(arrli.get(2));//returns the element of the specified index
		arrli.set(1,9); // replacing element
		System.out.println(arrli);//
		Collections.sort(arrli);
		for(int i:arrli) {
			System.out.println(i);	
		}
		
		Iterator itr=arrli.iterator();//using iterator
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("Is array list empty : "+arrli.isEmpty());
		System.out.println("size of list : "+arrli.size());
	arrli.clear(); // it will remove all the elements
	System.out.println("Is array list empty : "+arrli.isEmpty());
	}
}



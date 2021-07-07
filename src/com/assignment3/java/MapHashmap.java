package com.assignment3.java;
import java.util.*;
public class MapHashmap {

	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<>();
        map.put("vishal", 10);
        map.put("sachin", 30);
        map.put("vaibhav", 20);
        map.put("vaibhav", 20);// no duplicate values

        System.out.println("Size of map is:"+ map.size());
        System.out.println(map);

        if (map.containsKey("vishal")) { // verifying wheather vishal is exist or not
            Integer a = map.get("vishal");
            System.out.println("value for key" + " \"vishal\" is:- " + a);
        }
        map.remove( "sachin",30);  //removing
        System.out.println("Updated list of elements: "+map); 
        map.replace("vishal",18); 
        System.out.println("after replacing list of elements: "+map); 
        System.out.println("Size of map is:"+ map.size());
        System.out.println("particular key: "+map.get("vishal"));
        System.out.println("The values is: " +map.values());
        System.out.println("The set is: " + map.entrySet());
        System.out.println("Is the value 20 present? " + map.containsValue(20));
        System.out.println("The set is: " + map.keySet());
        System.out.println("The hashcode value of the map: "+map.hashCode());
	}

}

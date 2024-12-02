package com.example.collectiondemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {

	  public static void main(String[] args) {
	  Map<String, Integer> hashMapEx = new HashMap<>();
	  Map<String, Integer> treeMapEx = new TreeMap<>();
	  
	  // Adding item in the HashMap
	  // Item : Quantity
	  // Key is unique, and not reusable
	  //For HashMap there is a notion of arrangement does not matter
	  // Insertion, Retrieve , Remove is O(1) // better
	  // Let say that I have 10000 items, 
	  // it will take me 1 step to add / retrieve and delete
	  
	  hashMapEx.put("apple", 1);
	  hashMapEx.put("banana", 3);
	  hashMapEx.put("cherry", 5);
	  hashMapEx.put("date", 3);
	  hashMapEx.put("elderberry", 3);
	  
	  //TreeMap - Arrangement Matters
	  // Insertion, Retrieve , Remove is O log (n) // more time
	  // TreeMap is created with the basis of Binary Tree/ Tree (Data Structure and Algrothim)
	  
	  treeMapEx.put("apple",1);
	  treeMapEx.put("banana",5);
	  treeMapEx.put("cherry", 6);
	  treeMapEx.put("date", 3);
	  treeMapEx.put("elderberry", 3);
	  
	  System.out.println("HashMap is "+hashMapEx);
	  System.out.println("TreeMap is "+treeMapEx);
	
	  
	  // Retrieving an item using get
	  
	  System.out.println(hashMapEx.get("date"));
	  System.out.println(treeMapEx.get("cherry"));
	  
	  // put will update/ override the item previously inside the map
	  
	  treeMapEx.put("date",10);
	  hashMapEx.put("date", 10);
	  
	  System.out.println("HashMap is "+hashMapEx);
	  System.out.println("TreeMap is "+treeMapEx);
	  
	  // For loop
	  System.out.println("HashMap element");
	  // For every item in the hashMap, called it entry
	  for(Map.Entry<String,Integer> entry: hashMapEx.entrySet()) {
		  System.out.println(entry.getKey() + " : "+ entry.getValue());
	  }
	  
	  System.out.println("TreeMap element");
	  Iterator treeMapIt = treeMapEx.entrySet().iterator();
	  while(treeMapIt.hasNext()) {
		  System.out.println(treeMapIt.next());
	  }
	  
	  
	  
	  }
}

package com.example.collectiondemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
	public static void main(String[] args) {

		// Create a new empty ArrayList
		List<String> arrayList = new ArrayList<String>();

		// Create a new empty LinkedList
		// Normally on the left side is the interface
		// right side is the implementation

		List<String> linkedList = new LinkedList<String>();

		// Add multiple items in the arrayList
		arrayList.add("apple");
		arrayList.add("banana");
		arrayList.add("cherry");
		arrayList.add("date");
		arrayList.add("elderberry");

		// Add multiple items in the linkedlist
		linkedList.add("apple");
		linkedList.add("banana");
		linkedList.add("cherry");
		linkedList.add("date");
		linkedList.add("elderberry");

		System.out.println("ArrayList " + arrayList);
		System.out.println("LinkedList " + linkedList);

		/// Retrieving the third item

		String thirdElementOfArrayList = arrayList.get(2);
		String thirdElementOfLinkedList = linkedList.get(2);

		System.out.println("Third element of ArrayList:" + thirdElementOfArrayList);
		System.out.println("Third element of LinkedList:" + thirdElementOfLinkedList);

		// Modify item in the List using set

		arrayList.set(2, "citrus");
		linkedList.set(2, "citrus");

		System.out.println("Updated ArrayList: " + arrayList);
		System.out.println("Updated LinkedList " + linkedList);

		// Enhanced - For loop (available for anything)

		for (String item : arrayList) {
			System.out.println("Item is " + item);
		}

		// Iterator interface -> Only available for Collection Class

		System.out.println("List Iterator");

		Iterator<String> iterator = linkedList.iterator();

		// While there is an item there
		while (iterator.hasNext()) {
			// print the item
			System.out.println(iterator.next());
		}

		List<Integer> numberArrayList = new ArrayList<>();
		List<Integer> numberLinkedList = new LinkedList<>();

		// Measure time for insertion for LinkedList
		long startTime = System.nanoTime();
		for (int i = 0; i < 1000000; i++) {
			numberLinkedList.add(i);

		}
		long endTime = System.nanoTime();
		System.out.println("Time taken to add 100 000 element in LinkedList is " + (endTime - startTime) + " ns");

		// Measure insertion time for ArrayList
		startTime = System.nanoTime();
		for (int i = 0; i < 1000000; i++) {
			numberArrayList.add(i);
		}
		endTime = System.nanoTime();
		System.out.println("Time taken to add 100 000 element in ArrayList is " + (endTime - startTime) + " ns");

	}
}

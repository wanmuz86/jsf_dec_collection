package com.example.collectiondemo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionUtils {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(4,3,2,1,5);
		
		// Call the sort method.
		// This method is called from the class / sort , shuffle
		// When the method is called from the class => class method
		// When the method is created a keyword static was added to the front
		// eg: private static void sayHello
		// Person.sayHello()
		// It is used for utilities method: Logging, sorting etc
		
		Collections.sort(list);
		System.out.println("Sorted List "+list);
		
		// Shuffle the list
		Collections.shuffle(list);
		System.out.println("Shuffled List "+list);
		
		// Finding min
		int min = Collections.min(list);
		
		int max = Collections.max(list);
		
		System.out.println("Min is "+min+" and max is "+max);

	}

}

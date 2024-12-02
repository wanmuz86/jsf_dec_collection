package com.example.collectiondemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortWithComparator {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>(List.of("banana","cherry","apple","kiwi","date","elderberry"));
		
		Collections.sort(list, new StringLengthComparator());
		System.out.println("COllection sorted by length "+list);
		

	}

}

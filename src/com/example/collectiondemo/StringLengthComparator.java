package com.example.collectiondemo;

import java.util.Comparator;

// When we implement an interface / contract
// I need to override some methods to fulfil the contract of the interface

public class StringLengthComparator implements Comparator<String>{

	
	// Part of the interface/contract,
	// create the implematation of this compare method
	
	@Override
	public int compare(String o1, String o2) {
		
		// To compare the length of a word (o1 and o2)
		return Integer.compare(o1.length(), o2.length());
	}

}

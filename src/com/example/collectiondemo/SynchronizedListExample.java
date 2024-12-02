package com.example.collectiondemo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SynchronizedListExample {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(4,3,2,1,5);
		// A synchrnonized is a List that will be automatically locked
		// When it is accessed from the background thread
		// When multiple process wants to have access to it
		List<Integer> synchronizedList = Collections.synchronizedList(list);
		
		// Create a background process
		// What the backgroind process will do
		// It will access to the "synchronizedList" and just show it in console.
		Runnable task = () -> {
			synchronized (synchronizedList ) {
				for (int i = 0; i < synchronizedList.size(); i ++) {
					System.out.println(Thread.currentThread().getName() + " - "+ 
				synchronizedList.get(i));
				}
			}
		};
		
		// Create process 1
		Thread thread1 = new Thread(task);
		// Create process 2
		Thread thread2 = new Thread(task);
		// In this case, only 1 thread can access the collection at one time
		// the other thread/process will wait for it to finish before accessing it
		thread1.start();
		thread2.start();

	}

}

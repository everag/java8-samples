package com.mastercard.trainees.lambdas;


public class ThreadExample {
	
	public static void main(String[] args) {

		// The good old way
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("The good old way...");
			}
		}).start();
		
		// Example 1: Inline lambda expression
		new Thread(() -> System.out.println("Inline lambda!")).start();
		
		// Example 2: Explicit lambda as Runnable
		Runnable runner = () -> System.out.println("Explicit runnable!");
		new Thread(runner).start();

		// Example 3: Method reference in place of lambda expression
		new Thread(ThreadExample::methodReference).start();
	}
	
	public static void methodReference() {
		System.out.println("Method reference!");
	}
}
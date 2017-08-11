package br.evertonagner.java8.threads.atomicinteger;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {

	public static AtomicInteger ATOMIC_COUNTER = new AtomicInteger();
	public static int COUNTER = 0;

	public static void main(String[] args) {

		Runnable incrementor = new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
//					System.out.println("Counter is now " + ++Main.COUNTER);
					System.out.println("Counter is now " + Main.ATOMIC_COUNTER.incrementAndGet());
				}
			}
		};

		for (int i = 0; i < 10; i++) {
			new Thread(incrementor).start();
		}
	}
}

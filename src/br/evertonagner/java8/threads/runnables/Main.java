package br.evertonagner.java8.threads.runnables;

public class Main {

	public static void main(String[] args) {
		String threadName = Thread.currentThread().getName();

		Thread t = new Thread(new CountToTen());
		t.setName("CountTo10");
		t.start();

		System.out.println(threadName + " - Started CountToTen thread!");
	}
}

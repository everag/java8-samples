package br.evertonagner.java8.threads.runnables;

public class CountToTen implements Runnable {

	@Override
	public void run() {
		String threadName = Thread.currentThread().getName();

		try {
			for (int i = 1; i <= 10; i++) {
				System.out.println(threadName + " - " + i);
				Thread.sleep(1000);
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

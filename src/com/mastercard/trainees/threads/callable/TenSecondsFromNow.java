package com.mastercard.trainees.threads.callable;

import java.time.LocalDateTime;
import java.util.concurrent.Callable;

public class TenSecondsFromNow implements Callable<LocalDateTime> {
	@Override
	public LocalDateTime call() throws Exception {
		String threadName = Thread.currentThread().getName();

		LocalDateTime before = LocalDateTime.now();
		System.out.println(threadName + " - start counting at " + before);

		try {
			for (int i = 1; i <= 10; i++) {
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		LocalDateTime after = LocalDateTime.now();
		System.out.println(threadName + " - woke up at " + after);

		return after;
	}
}

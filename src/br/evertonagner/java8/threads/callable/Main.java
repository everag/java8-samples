package br.evertonagner.java8.threads.callable;

import java.time.LocalDateTime;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

	public static void main(String[] args) throws ExecutionException, InterruptedException {
		String threadName = Thread.currentThread().getName();

		ExecutorService executor = Executors.newSingleThreadExecutor();

		Future<LocalDateTime> future = executor.submit(new TenSecondsFromNow());

		System.out.println(threadName + " - Started TenSecondsFromNow thread!");

		LocalDateTime result = future.get();

		System.out.println(threadName + " - Result time: " + result);
	}
}

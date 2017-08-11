package com.mastercard.trainees.datetime;

import java.time.Duration;
import java.time.Instant;
import java.util.Date;

public class InstantExample {

	public static void main(String[] args) throws InterruptedException {
		
		Instant start = Instant.now();
		
		Thread.sleep(3 * 1000);
		
		Instant end = Instant.now();
		
		System.out.println("Started at " + start);
		System.out.println("Ended at " + end);
		
		Duration durationOfSleep = Duration.between(start, end);
		
		System.out.println(durationOfSleep);
		
		Instant instantFromDate = new Date().toInstant();
		System.out.println(instantFromDate);
	}

}

package com.mastercard.trainees.datetime;

import java.time.LocalTime;
import java.time.ZoneId;

public class LocalTimeExample {

	public static void main(String[] args) {
		
		LocalTime now = LocalTime.now();
		System.out.println("Now its " + now);
		
		LocalTime oneHourAndHalfAgo = now.minusHours(1).minusMinutes(30);
		System.out.println("One hour and a half ago: " + oneHourAndHalfAgo);
		
		LocalTime elevenPM = LocalTime.of(23, 00);
		LocalTime overlappedTime = elevenPM.plusHours(2).plusMinutes(30);
		System.out.println("Overlapped time: " + overlappedTime);
		
		LocalTime nowOnFinland = LocalTime.now(ZoneId.of("Europe/Helsinki"));
		System.out.println("Now in Finland its " + nowOnFinland);
	}

}

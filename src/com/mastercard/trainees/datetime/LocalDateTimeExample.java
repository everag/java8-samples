package com.mastercard.trainees.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class LocalDateTimeExample {

	public static void main(String[] args) {
		
		LocalDateTime now = LocalDateTime.now();
		System.out.println("Current time: " + now);
		
		LocalDateTime worldCupFinal = LocalDate.of(2014, Month.JULY, 13).atTime(16, 0);
		System.out.println("World cup final will be on: " + worldCupFinal);
		
		LocalDateTime thirdPlaceMatch = worldCupFinal.minusDays(1).withHour(17);
		System.out.println("Third place match will be on: " + thirdPlaceMatch);
		
		LocalDateTime lunchTimeYesterday = LocalDate.now().minusDays(1).atTime(12, 00);
		System.out.println("Yesterday's lunch time: " + lunchTimeYesterday);
	}

}

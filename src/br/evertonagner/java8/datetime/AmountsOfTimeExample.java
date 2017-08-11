package br.evertonagner.java8.datetime;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class AmountsOfTimeExample {

	public static void main(String[] args) {
		
		// Duration
		
		LocalDateTime wcStart = LocalDate.of(2014, Month.JUNE, 12).atTime(17, 00);
		LocalDateTime wcEnding = LocalDate.of(2014, Month.JULY, 13).atTime(16, 00);
		
		Duration wcDuration = Duration.between(wcStart, wcEnding);
		
		System.out.println(String.format("WC duration: %d days and %d hours", wcDuration.toDays(), wcDuration.toHours() % 24));
		
		long wcWeeks = wcStart.until(wcEnding, ChronoUnit.WEEKS);
		
		System.out.println("WC duration in weeks: " + wcWeeks);
		
		// Periods
		
		Period twoMonthsAndAHalf = Period.of(0, 2, 15);
		LocalDateTime someTimeAfterWc = wcEnding.plus(twoMonthsAndAHalf);
		System.out.println("Some time after WC: " + someTimeAfterWc);
	}
}

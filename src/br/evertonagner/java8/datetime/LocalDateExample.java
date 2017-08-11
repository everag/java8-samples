package br.evertonagner.java8.datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

import static java.time.temporal.TemporalAdjusters.*;

public class LocalDateExample {

	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();
		System.out.println("Today is " + today);
		
		LocalDate worldCupStart = LocalDate.of(2014, Month.JUNE, 12);
		System.out.println("World Cup opening was in " + worldCupStart);
		
		LocalDate yesterday = today.minusDays(1);
		System.out.println("Yesterday was " + yesterday);
		
		LocalDate tomorrowInLastYear = today.plusDays(1).minusYears(1);
		System.out.println("Tomorrow, last year, was in " + tomorrowInLastYear + ", on a " + tomorrowInLastYear.getDayOfWeek());
		
		LocalDate day200 = LocalDate.ofYearDay(2014, 200);
		System.out.println("200th day of 2014 will be " + day200);
		
		LocalDate lastDayOfMonth = today.with(lastDayOfMonth());
		System.out.println("This month will end on " + lastDayOfMonth);
		
		LocalDate nextMonday = today.with(next(DayOfWeek.MONDAY));
		System.out.println("Next monday will be on " + nextMonday);
		
		LocalDate fathersDay = LocalDate.of(2017, Month.AUGUST, 1).with(dayOfWeekInMonth(2, DayOfWeek.SUNDAY));
		System.out.println("This year, Father's Day will be on " + fathersDay);

//		LocalDate payroll = lastDayOfMonth.with(previousOrSame(DayOfWeek.FRIDAY));
//		System.out.println("The pagode will fall on " + payroll);
	}
}

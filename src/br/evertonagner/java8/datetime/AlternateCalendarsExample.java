package br.evertonagner.java8.datetime;

import java.time.LocalDate;
import java.time.chrono.HijrahDate;
import java.time.chrono.JapaneseDate;

public class AlternateCalendarsExample {

	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();
		
		JapaneseDate todayInJpCalendar = JapaneseDate.from(today);
		System.out.println("Today in Japanese Calendar is: " + todayInJpCalendar);
		
		HijrahDate todayInHijrahCalendar = HijrahDate.from(today);
		System.out.println("Today in Hijrah Calendar is: " + todayInHijrahCalendar);
	}

}

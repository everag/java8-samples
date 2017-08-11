package com.mastercard.trainees.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterExample {

	public static void main(String[] args) {

		LocalDate today = LocalDate.now();

		DateTimeFormatter ldFormater = DateTimeFormatter.ofPattern("dd/MM/uuuu");
		
		System.out.println("Today is: " + today.format(ldFormater));
		System.out.println("ISO LOCAL DATE: " + today.format(DateTimeFormatter.ISO_LOCAL_DATE));
		System.out.println("BASIC ISO DATE: " + today.format(DateTimeFormatter.BASIC_ISO_DATE));
		
		LocalTime now = LocalTime.now();
		
		DateTimeFormatter tFormatter = DateTimeFormatter.ofPattern("HH:mm");
		
		System.out.println("\nNow (time): " + now.format(tFormatter));
		System.out.println("ISO TIME: " + now.format(DateTimeFormatter.ISO_TIME));
		
		LocalDateTime nowDT = LocalDateTime.now();
		
		DateTimeFormatter ldtFormatter = DateTimeFormatter.ofPattern("EEEE', at ' HH:mm", Locale.ENGLISH);
		
		System.out.println("\nNow (date time): " + nowDT.format(ldtFormatter));
		System.out.println("ISO LOCAL DATE TIME: " + nowDT.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
	}
}

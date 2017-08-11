package com.mastercard.trainees.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;


public class ZonedDateTimeExample {

	public static void main(String[] args) {

		ZoneId paris = ZoneId.of("Europe/Paris");
		
		LocalDate today = LocalDate.now();
		
		ZonedDateTime sodInParis = today.atStartOfDay(paris);
		
		System.out.println(sodInParis);
		
		ZonedDateTime inBrazil = sodInParis.withZoneSameInstant(ZoneId.of("America/Sao_Paulo"));
		
		System.out.println(inBrazil);
		
		ZonedDateTime nowInBrazil = LocalDateTime.now().atZone(ZoneId.of("America/Sao_Paulo"));
		
		System.out.println("Now in BRA: " + nowInBrazil);
		
		ZonedDateTime nowInSTL = nowInBrazil.withZoneSameInstant(ZoneId.of("America/Chicago"));
		
		System.out.println("Now in STL: " + nowInSTL);
		System.out.println("Now in CHN: " + nowInBrazil.withZoneSameInstant(ZoneId.of("Asia/Kolkata")));
		
		System.out.println("Diff BRA->STL: " + nowInBrazil.until(nowInSTL, ChronoUnit.MINUTES));
	}

}

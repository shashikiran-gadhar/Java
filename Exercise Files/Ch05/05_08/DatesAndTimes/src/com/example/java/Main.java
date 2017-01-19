package com.example.java;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);

		GregorianCalendar gc = new GregorianCalendar(2010, 11, 26);
		gc.add(GregorianCalendar.MONTH, 1);
		System.out.println(gc.getTime());

		DateFormat df =  DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println(df.format(d));

		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);

		LocalDate ld = LocalDate.of(2009, 11, 12);
		System.out.println(ld);

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("M/d/yyyy");
		System.out.println(dtf.format(ld));

	}

}

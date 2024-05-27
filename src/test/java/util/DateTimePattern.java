package util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimePattern {

	public static String formattedDateTime;

	public static String getDateTime() {
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyyHHmmss");
		formattedDateTime = now.format(formatter);
		System.out.println("Current date and time in DD-MM-YYYY HH-MM-SS format: " + formattedDateTime);
		return formattedDateTime;
	}
}

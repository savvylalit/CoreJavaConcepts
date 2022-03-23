package basic;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

/*
 * DateTime API 1.8
 * Immutable
 * Better to use
 * java.time package
 * */
public class DateTimeDemo {

	public static void main(String[] args) {
		LocalDate d = LocalDate.now();
		System.out.println("LocalDate : " + d);
		
		LocalDate d2 = LocalDate.of(1987, Month.SEPTEMBER, 29);
		System.out.println("Get a specific date : " + d2);
		
		LocalTime t = LocalTime.now();
		System.out.println("LocalTime : " + t);
		
		LocalTime t2 = LocalTime.of(12,35,10,999);
		System.out.println("Get a specific time : " + t2);

		LocalTime t3 = LocalTime.now(ZoneId.of("GMT"));
		System.out.println("Get time as per zone  : " + t3);
		
		LocalDateTime dt = LocalDateTime.now();
		System.out.println("Get date time : " + dt);
	}

}

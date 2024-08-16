package datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate date = LocalDate.now();

		System.out.println(date);

		LocalTime time = LocalTime.now();

		System.out.println(time);
		
		
		System.out.println("Day of month "+date.getDayOfMonth());
		System.out.println("Day of year "+ date.getDayOfYear());
		
		System.out.println("Year  "+date.getYear());
		
		
		System.out.println(date.plusMonths(1));
		
		System.out.println(date.plusYears(5));
		
		System.out.println(date.minusWeeks(2));
		
		
		System.out.println("Is Leap year "+date.isLeapYear());
		
		
		
			LocalDate  independanceDay =	LocalDate.of(1947, 8, 15);
		
			System.out.println(date.isAfter(independanceDay));
			System.out.println(date.isBefore(independanceDay));
		
		
		
		LocalDateTime  dateTime =		LocalDateTime.now();
		
		
				System.out.println(dateTime);
		
		

	}

}

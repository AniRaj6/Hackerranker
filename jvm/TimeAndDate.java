package jvm;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeAndDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime  myTime =  LocalDateTime.now();
		System.out.println(myTime);
		
		DateTimeFormatter myFormate = DateTimeFormatter.ofPattern("dd-mm-yyy HH:mm:ss");
		String myDateTimeFormated = myTime.format(myFormate);
		System.out.println(myDateTimeFormated);
		
		LocalDate myDate=LocalDate.now();
		System.out.println(myDate);
		
		LocalTime myTimer = LocalTime.now();
		System.out.println(myTimer);
		
		

	}

}

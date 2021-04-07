package datetime;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class LocalDateTimeEx2 {
	public static void main(String[] args) {  
	    LocalDateTime a = LocalDateTime.of(2021, 1, 10, 15, 56);    
	    System.out.println(a.get(ChronoField.DAY_OF_WEEK));  
	    System.out.println(a.get(ChronoField.DAY_OF_YEAR));  
	    System.out.println(a.get(ChronoField.DAY_OF_MONTH));  
	    System.out.println(a.get(ChronoField.HOUR_OF_DAY));  
	    System.out.println(a.get(ChronoField.MINUTE_OF_DAY));   
	  }  
}
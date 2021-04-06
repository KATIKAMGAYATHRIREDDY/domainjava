package datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TestDate {
public static void main(String[] args) {
	LocalDate localDate=LocalDate.now();
	int day = localDate.getDayOfMonth();
	LocalTime time1=LocalTime.of(10,43 ,12);
	LocalDateTime localdatetime=LocalDateTime.now();
	System.out.println(LocalDate.now());
	
	LocalTime time2=time1.plusMinutes(18);
	System.out.println(time2);
}
}

package datetime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneEx {
	public static void main(String[] args) {
		ZoneId zone = ZoneId.systemDefault();
		System.out.println(zone);
		
		ZoneId officZoneId = ZoneId.of("America/Los_Angeles");
		ZonedDateTime zdt = ZonedDateTime.now(officZoneId);
		System.out.println("date and time in los angeles now is"+zdt);
	}

	private static int add(int i, int j) {
		// TODO Auto-generated method stub
		return i+j;
	}
}

package datetime;

import java.time.LocalDate;
import java.time.Period;
import java.time.Year;

public class LeapYear {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalDate dob = LocalDate.of(1981, 01, 01);
		Period period = Period.between(dob, today);
		LocalDate lastDay = dob.plusYears(60);
		Period periodLeft = Period.between(today, lastDay);

		System.out.printf("no of years = %d, no of months = %d, no of days = %d",period.getYears(),period.getMonths(),period.getDays());
		System.out.printf("\nno of years left = %d, no of months left = %d, no of days left= %d",periodLeft.getYears(),periodLeft.getMonths(),periodLeft.getDays());

		Year year = Year.of(2020);
		if(year.isLeap()) {
			System.out.println(" leap year");
		}
		else {
			System.out.println(" not a leap year");
		}
	}

	private static int add(int i, int j) {
		// TODO Auto-generated method stub
		return i+j;
	}
}

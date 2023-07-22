package Calendar;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Calendar {
	private static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	private static final int[] LEAP_MAX_DAYS = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
	public boolean isLeapYear(int year) {
		if (year % 4 == 0 && year % 100 != 0 || year % 400 != 0)
			return true;
		else
			return false;
	}
	
	public int maxDaysOfMonth(int year, int month) {
		if (isLeapYear(year)) {
			return LEAP_MAX_DAYS[month - 1];
		}else {
			return MAX_DAYS[month - 1];
		}
	}
	
	public int weekNumber(int year, int month) {
		LocalDate date = LocalDate.of(year, month, 1);
		DayOfWeek dayOfWeek = date.getDayOfWeek();
		int dayOfWeekNumber = dayOfWeek.getValue();
		return dayOfWeekNumber;
	}

	
	public void sampleCalendar(int year, int month) {
		System.out.printf("<<%d년%d월>>\n",year,month);
		System.out.println("SU MO TU WD TH FR SA");
		System.out.println("--------------------------");
		
		//get weekday automatically
		int weekday = weekNumber(year, month);
		
		for (int i = 0; i<weekday; i++) {
			System.out.print("   ");
		}
		int maxDay = maxDaysOfMonth(year, month);
		int count =  7 - weekday;
		
		int daylimit = (count < 7) ? count : 0;
		
		/*
		 int daylimit = 0;
		 if (count < 7) {
		 
			daylimit = count;
		} else {
			daylimit = 0;
		}
		*/
		
		//print first line
		for (int i = 1; i <= count; i++) {
			System.out.printf("%3d",i);
		}
		System.out.println();
		
		//print from second line
		count++;
		for (int i = count; i<=maxDay; i++) {
			System.out.printf("%3d",i);
			if (i%7 == daylimit) {
				System.out.println();
			}
		}
			
		System.out.println();
		System.out.println();

	}
	
	
	public static void main(String[] args) {
		
		
		
		

	}

}

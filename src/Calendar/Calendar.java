package Calendar;

import java.util.Date;
import java.util.HashMap;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class Calendar {
	private static final int[] MAX_DAYS = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	private static final int[] LEAP_MAX_DAYS = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	private HashMap <Date, String> planMap;
	
	public Calendar() {
		planMap = new HashMap<Date, String>();
	}
	
	/*
	 * 
	 * 
	 *  date ex: "2023-7-23"
	 *  plan
	 */
	
	
	public void registerPlan(String strDate, String plan) throws ParseException {
		Date date = new SimpleDateFormat("yyyy-MM-dd").parse(strDate);
		//System.out.println(date);
		planMap.put(date, plan);
		
	}
	
	public String searchPlan(String strDate) throws ParseException {
		Date date = new SimpleDateFormat("yyyy-MM-dd").parse(strDate);
		String plan = planMap.get(date);
		return plan;
	}
	
	public boolean isLeapYear(int year) {
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))
			return true;
		else
			return false;
	}
	
	public int maxDaysOfMonth(int year, int month) {
		if (isLeapYear(year)) {
			return LEAP_MAX_DAYS[month];
		}else {
			return MAX_DAYS[month];
		}
	}
	
	
	private int getWeekday(int year, int month, int day) {
		int syear = 1970;
		final int STANDARD_WEEKDAY = 4; //1970 1 1 = 목요일 Thursday
		
		int count = 0;
		
		for (int i = syear; i<year; i++) {
			int delta;
			if (isLeapYear(year)) {
				delta = 366;
			}else{
				delta = 365;
			};
		
			count += delta;
		}
		
		for (int i = 1; i < month; i++) {
			int delta = maxDaysOfMonth(year, i);
			count += delta;
		}
		count += day - 1 ;
		
		int weekday = (count + STANDARD_WEEKDAY) % 7;
		return weekday;
	}
	
	public void sampleCalendar(int year, int month) {
		System.out.printf("<<%d년%d월>>\n",year,month);
		System.out.println("SU MO TU WD TH FR SA");
		System.out.println("--------------------------");
		
		//get weekday automatically
		int weekday = getWeekday(year, month, 1);
		
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
	
	
	
	public static void main(String[] args) throws ParseException {
		
		Calendar cal = new Calendar();
		System.out.println(cal.getWeekday(1970, 1, 1));
		System.out.println(cal.getWeekday(1971, 1, 1));
		System.out.println(cal.getWeekday(1972, 1, 1));
		System.out.println(cal.getWeekday(1973, 1, 1));
		System.out.println(cal.getWeekday(1974, 1, 1));
		
		cal.registerPlan("2023-07-23", "소고기 먹는 날!");
		System.out.println(cal.searchPlan("2023-07-23").equals("소고기 먹는 날!"));
	}

}

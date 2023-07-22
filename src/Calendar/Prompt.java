package Calendar;

import java.util.Scanner;

public class Prompt {
		
	public int parseDay(String week) {
		if (week.equals("su")) {
			return 0;
		} else if (week.equals("mo"))	{
			return 1;			
		} else if (week.equals("tu")){ 
			return 2;			
		} else if (week.equals("wd")){ 
			return 3;			
		} else if (week.equals("th")){ 
			return 4;			
		} else if (week.equals("fr")){ 
			return 5;			
		} else if (week.equals("sa")){ 
			return 6;			
		} else {
			return 0;
		}
		
	}
		 
	
	
	
	public void runPrompt() {
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();
		System.out.println("반복횟수를 입력하세요.");
		
		int month = 1;	
		int year = 0;
		int weekday = 0;
		
		boolean run = true;
		while (run) {
		System.out.println("년도를 입력하세요.");
		System.out.print("YEAR> ");
		year = scanner.nextInt();
		if (year == -1) {
			break;
		}
		System.out.println("월을 입력하세요.");
		System.out.print("MONTH> ");
		month = scanner.nextInt();
		System.out.println("첫번째 요일을 입력하세요.(su, mo ...");
		System.out.print("WEEKDAY> ");
		String str_weekday = scanner.next();
		weekday = parseDay(str_weekday);
		
		
		
		
		if (month > 12 || month <1) {
			System.out.println("잘못된 입력입니다.");
			continue;
		}
		
		cal.sampleCalendar(year, month, weekday);			
		}
		System.out.println("프로그램 종료");
		scanner.close();
			
	}

	public static void main(String[] args) {
		Prompt p = new Prompt(); 
		p.runPrompt();

		
	}

}

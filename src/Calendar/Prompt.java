package Calendar;

import java.util.Scanner;

public class Prompt {
	
	
	public void runPrompt() {
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();
		System.out.println("반복횟수를 입력하세요.");
		
		int month = 1;	
		int year = 1;
		String dOW = null;
		boolean run = true;
		while (run) {
		System.out.println("년도를 입력하세요.");
		System.out.print("YEAR> ");
		year = scanner.nextInt();
		System.out.println("월을 입력하세요.");
		System.out.print("MONTH> ");
		month = scanner.nextInt();
		System.out.println("첫번째 요일을 입력하세요.");
		System.out.print("WEEKDAY> ");
		dOW = scanner.nextLine();
		
		if (month == -1||year == -1) {
			run = false;
		} else if (month>12){
			continue;
		} else {
			cal.sampleCalendar(year, month);			
		}
		}
		System.out.println("프로그램 종료");
		scanner.close();
			
	}

	public static void main(String[] args) {
		Prompt p = new Prompt(); 
		p.runPrompt();

		
	}

}

package Calendar;

import java.util.Scanner;

public class Prompt {
		
	
	
	
	
	public void runPrompt() {
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();
		System.out.println("반복횟수를 입력하세요.");
		
		int month = 1;	
		int year = 0;
		
		
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
		
		
		
		
		
		if (month > 12 || month <1) {
			System.out.println("잘못된 입력입니다.");
			continue;
		}
		
		cal.sampleCalendar(year, month);			
		}
		System.out.println("프로그램 종료");
		scanner.close();
			
	}

	public static void main(String[] args) {
		Prompt p = new Prompt(); 
		p.runPrompt();

		
	}

}

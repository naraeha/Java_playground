package Calendar;

import java.util.Scanner;

public class Prompt {
	
	private final static String PROMPT	=	"cal> ";
	
	public void runPrompt() {
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();
		System.out.println("반복횟수를 입력하세요.");
		
		int month = 1;	
		while (true) {
		System.out.println("월을 입력하세요.");
		System.out.print(PROMPT);
		month = scanner.nextInt();
		if (month == -1) {
			break;
		} else if (month>12){
			continue;
		} else {
			cal.sampleCalendar(2023, month);			
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

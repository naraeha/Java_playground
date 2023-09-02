package Calendar;

import java.text.ParseException;
import java.util.Scanner;

public class Prompt {
		
	public void printMenu() {
		System.out.println("+----------------------+");
		System.out.println("| 1. 일정 등록");
		System.out.println("| 2. 일정 검색");
		System.out.println("| 3. 달력 보기");
		System.out.println("| h. 도움말 q. 종료");
		System.out.println("+----------------------+");
				
	}
	
	
	
	public void runPrompt() throws ParseException {
		printMenu();
		
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();
		
		
	
		
		
		boolean run = true;
		while (run) {
			System.out.println("명령 (1, 2, 3, h, q)");
			String cmd = scanner.next();
			switch(cmd) {
			case "1" :
				cmdRegister(scanner, cal);
				break;
			case "2" :
				cmdSearch(scanner, cal);
				break;
			case "3" :
				cmdCal(scanner, cal);
				break;
			case "h" :
				printMenu();
				break;
			case "q" :
				run = false;
				break;
			}
//			if(cmd.equals("1")) cmdRegister(scanner, cal);
//			else if (cmd.equals("2")) cmdSearch(scanner, cal);
//			else if (cmd.equals("3")) cmdCal(scanner, cal);
//			else if (cmd.equals("h")) printMenu();
//			else if (cmd.equals("q")) break;
		}
		System.out.println("프로그램 종료");
		scanner.close();
			
		}

	private void cmdCal(Scanner s, Calendar c) {
		int month = 1;	
		int year = 2023;
			
		System.out.println("년도를 입력하세요.");
		System.out.print("YEAR> ");
		year = s.nextInt();
		
		System.out.println("월을 입력하세요.");
		System.out.print("MONTH> ");
		month = s.nextInt();
		
		if (month > 12 || month <1) {
			System.out.println("잘못된 입력입니다.");
			return;
		}
		
		c.sampleCalendar(year, month);			
		
		
	}



	private void cmdSearch(Scanner s, Calendar c) {
		System.out.println("[일정 검색]");
		System.out.println("날짜를 입력해 주세요(yyyy-MM-dd).");
		String date = s.next();
		PlanItem plan;
		plan = c.searchPlan(date);
		if (plan != null) {
		System.out.println(plan.detail);
		} else {
			System.out.println("일정이 없습니다.");
		}
		
	}



	private void cmdRegister(Scanner s, Calendar c) throws ParseException {
		System.out.println("[일정 등록]");
		System.out.println("날짜를 입력해 주세요(yyyy-MM-dd).");
		String date = s.next();
		String text = " ";
		System.out.println("일정을 입력해 주세요.(문장 끝에 ;를 입력해주세요.)");
		while (true) {
			String word = s.next();
			text += word + " ";
			if (word.endsWith(";")) {
				break;
			}
			
		}
		c.registerPlan(date, text);
			
		
	}



	public static void main(String[] args) throws ParseException {
		Prompt p = new Prompt(); 
		p.runPrompt();

		
	}

}

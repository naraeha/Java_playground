package Calendar;

import java.util.Scanner;

public class Calendar {
	
	public void sampleCalendar() {
		System.out.println("일 월 화 수 목 금 토");
		System.out.println("----------------");
		System.out.println("1 2 3 4 5 6 7");
		System.out.println("8 9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
		
	}
	
	private static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public int maxDaysOfMonth(int month) {
		return MAX_DAYS[month - 1];
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();
		System.out.println("반복횟수를 입력하세요.");
		int times = scanner.nextInt();
			
		for (int i = 0; i<times; i++) {
		System.out.println("월을 입력하세요.");
		int month = scanner.nextInt();
		System.out.printf("%d월은 %d일까지 있습니다.\n",month, cal.maxDaysOfMonth(month));
		}
		
		System.out.println("프로그램 종료");
		scanner.close();

	}

}

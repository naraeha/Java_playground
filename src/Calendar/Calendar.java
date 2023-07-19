package Calendar;

import java.util.Scanner;

public class Calendar {
	public static void main(String[] args) {
//		System.out.println("일 월 화 수 목 금 토");
//		System.out.println("----------------");
//		System.out.println("1 2 3 4 5 6 7");
//		System.out.println("8 9 10 11 12 13 14");
//		System.out.println("15 16 17 18 19 20 21");
//		System.out.println("22 23 24 25 26 27 28");
		
		//숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램
		
		System.out.println("달을 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		String month = scanner.nextLine();
		
		//존나 무식하게 해보기
		if (month.equals("1월")) {
			System.out.println("1월은 31일까지 있습니다.");
		} else if (month.equals("2월")) {
			System.out.println("2월은 28/29일까지 있습니다.");
		} else if (month.equals("3월")) {
			System.out.println("3월은 31일까지 있습니다.");
		}else if (month.equals("4월")) {
			System.out.println("4월은 30일까지 있습니다.");
		}else if (month.equals("5월")) {
			System.out.println("5월은 31일까지 있습니다.");
		}else if (month.equals("6월")) {
			System.out.println("6월은 30일까지 있습니다.");
		}else if (month.equals("7월")) {
			System.out.println("7월은 31일까지 있습니다.");
		}else if (month.equals("8월")) {
			System.out.println("8월은 31일까지 있습니다.");
		}else if (month.equals("9월")) {
			System.out.println("9월은 30일까지 있습니다.");
		}else if (month.equals("10월")) {
			System.out.println("10월은 31일까지 있습니다.");
		}else if (month.equals("11월")) {
			System.out.println("11월은 30일까지 있습니다.");
		}else {
			System.out.println("12월은 31일까지 있습니다.");
		}

	}

}

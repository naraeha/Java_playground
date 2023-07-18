package multiplication_table;

import java.util.Scanner;

public class GugudanLast {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
					
		System.out.println("원하는 구구단 값을 입력하세요");
		System.out.println("---------------------");
		
		String inputValue = scanner.nextLine();
		String[] splitedValue = inputValue.split(",");
		int first = Integer.parseInt(splitedValue[0]);
		int second = Integer.parseInt(splitedValue[1]);
			
		int[] result = new int[second];
		for(int k = 2; k<=first; k++) {
			for(int i = 0; i<second; i++) {
				result[i] = k * (i + 1); 
			}
		
			for(int i = 0; i<result.length; i++) {
				System.out.println(result[i]);
			}
			System.out.println();
			
		}
		
	
	}

}

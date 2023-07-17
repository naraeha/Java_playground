package multiplication_table;

import java.util.Scanner;

public class Gugudan_Arragement {
	
	public static void main(String[] args) {
				
		int[] result = new int[9];
		for(int k = 2; k<=result.length; k++) {
			for(int i = 0; i<result.length; i++) {
				result[i] = k * (i + 1); 
			}
		
			for(int i = 0; i<result.length; i++) {
				System.out.println(result[i]);
			}
			System.out.println();
		}

		
	}

}

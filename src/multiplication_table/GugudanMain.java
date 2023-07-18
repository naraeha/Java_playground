package multiplication_table;

public class GugudanMain {
		public static void main(String[] args) {
		for (int i = 2; i<10; i++) {
		int[] result = Gugudan_method.calculate(i);
		Gugudan_method.print(result);
		System.out.println();
		}
		
		
		
	}

}


public class Main {

	public static void main(String[] args) {
		printNumbers(1, 2, 3);
		printNumbers(6, 5, 4);
		printNumbers(2, 3, 4);
		printNumbers(5, 10, 3);
		printNumbers(4, 1, 5);
	}

	private static void printNumbers(int a, int b, int c) {
		int i = a * b * c;
		System.out.println("a * b * c = " + i);			
	}
}

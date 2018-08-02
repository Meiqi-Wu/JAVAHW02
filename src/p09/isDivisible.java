package p09;

import java.util.Scanner;

public class isDivisible {

	public boolean isDivisibleBy(int a, int b) {
		if(a < b || a <= 0 || b<=0) return false;
		
		if(a % b ==0 ) {
			return true;
		} else {
			return false;
		}
	}
	
	
	public static void main(String[] args) {
		isDivisible program = new isDivisible();
		program.run();		
	}
	
	public void run() {
		println("Welcome to the IsDivisible program.");
		getLine("Press enter to start");
		println("");
		
//		println("Running automatic tests...");
//		runTest(10, 2, true);
//		runTest(9, 3, true);
//		runTest(5, 1, true);
//		runTest(3, 9, false);
//		runTest(10, 0, false);
//		runTest(-10, 2, false);
//		runTest(10, -2, false);
		
		println("\n\nRunning manual tests...");
		while(true) {
			runManualTest();
		}
		

	}
	
	private void runTest(int a, int b, boolean expectedReturn) {
		boolean actualReturn = isDivisibleBy(a, b);
		println("Input:           " + "a = " + a + ", b = " + b);
		println("Expected return: " + expectedReturn);
		println("Actual return:   " + actualReturn);

		if(expectedReturn == actualReturn) {
			println("Test passed");
		} else {
			println("Test did not pass");
		}
		println("");
	}
	
	private void runManualTest() {		
		println("Enter two numbers (a and b) and isDivisibleBy will tell you");
		println("If a is divisible by b");
		int a = readInt("a: ");
		int b = readInt("b: ");
		boolean result = isDivisibleBy(a, b);
		println("isDivisibleBy returned: " + result);
		println("");	
	}
	
	public int readInt(String str) {
		Scanner scanner = new Scanner(System.in);
		System.out.print(str);
		int x = scanner.nextInt();
//		scanner.close();
		return x;
	}
	
	private void getLine(String str) {
		println(str);
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
//		sc.close();
	}
		
	private void println(String str) {
		System.out.println(str);
	}
}



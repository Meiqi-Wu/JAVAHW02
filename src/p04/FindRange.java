package p04;

import java.util.Scanner;

public class FindRange {
	private final int SENTINEL = 0;
	private int max;
	private int min;
	
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.print("? ");
		int number = sc.nextInt();
		min = number;
		max = number;
		
		while(number != SENTINEL) {
			if(number > max) {
				max = number;
			}
			if(number < min) {
				min = number;
			}
			System.out.print("? ");
			number = sc.nextInt();
		}
		System.out.println("Smallest: "+min);
		System.out.println("Largest: "+max);
		sc.close();
	}
	
	public static void main(String[] args) {
		FindRange program = new FindRange();
		program.run();
	}
}

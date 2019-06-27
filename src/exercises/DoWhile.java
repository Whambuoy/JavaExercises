package exercises;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int value = 0;
		//Regardless of the condition, a do while loop will always execute once or more
		do {
			System.out.println("Enter a number: ");
			value = scanner.nextInt();
		}
		while (value != 5);
			
			System.out.println("Got 5!");
	}
}

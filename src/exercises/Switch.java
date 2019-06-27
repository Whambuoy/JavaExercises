package exercises;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter some text: ");
		String text = input.nextLine();
		
		switch (text) {
		case "one":
			System.out.println("You entered 'one'");
			break;

		default:
			System.out.println("Try typing 'one'");
			break;
		}
	}

}

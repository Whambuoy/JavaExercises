package exercises;

import java.util.Scanner;

public class GetUserInput {
	public static void main(String[] args) {
		
		//Create scanner object
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a line of text: ");
		
		//Wait for the user to enter a line of text. Others include nextDouble, nextInt, etc
		String line = input.nextLine();
		
		System.out.println("You entered:" + line);
	}
}

package exercises;

public class ForLoop {
	public static void main(String[] args) {
		/* initialization, condition, increment/decrement
		 * Infinite loop:
		 * 	for(;;) {
		 *	System.out.println(Hey);
		 *		}
		 */
	
		for(int i = 0; i < 5; i++) {
			 	//System.out.println("Hey" + " " + i);
			 	//REquires 2 arguments and doesn't print in new line
			 	System.out.printf("The value of i is: %d\n", i);
			 		}
	}
}

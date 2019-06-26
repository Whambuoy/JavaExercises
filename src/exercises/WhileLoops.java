package exercises;

public class WhileLoops {
	public static void main(String[] args) {
		boolean loop = 4<5;
		System.out.println(loop);
		
		
		int value = 0;
		boolean loop2 = value<20;
		
		/*
		 * Infinite loop:
		 * while (value<10){
		 * 		System.out.println(loop);
		 * }
		 */
		
		while (value<10) {
			System.out.println("Hello" + " " + value);
			value = value + 1;
		}
			 		
	}
}

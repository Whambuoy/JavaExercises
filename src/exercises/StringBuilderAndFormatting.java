package exercises;

public class StringBuilderAndFormatting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String info = " ";
		info += "text 1 ";
		info +="text 2";
		
		System.out.println(info);
		
		//A more memory-efficient way:
		StringBuilder sb = new StringBuilder(" ");
		sb.append("My name is: ");
		sb.append("Esther Wambui");
		
		System.out.println(sb);
		
		//Method chaining:
		StringBuilder example = new StringBuilder();
		example.append(" Here we go! ").append("Kaboom!");
		System.out.println(example);

		//Formatting:
		System.out.println("Hey. \t That is a tab. \n This is a new line.");
		
		for (int i = 0; i < 15; i++) {
			
			//The 2 makes the output line-up (Specifies the width)	
			System.out.printf("%2d: %2s\n", i, "some text here");
		}
		
		//Formatting floating point values (The .2 specifies number of decimal places
		System.out.printf("Total value: %.2f\n", 5.6789);
	}

}

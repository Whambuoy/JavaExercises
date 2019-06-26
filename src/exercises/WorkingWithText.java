package exercises;

public class WorkingWithText {
	public static void main(String[] args) {
		double myDouble = 7.98;
		
		/*String is type of object that can hold text
		 *'text' stores the String instance, thus capable of referring to a thing with type String
		 *"Hello" is text object
		 */
		String text = "Hello";
		String blank = " ";
		String name = "Esther";
		
		//Concatenation
		System.out.println(text + blank + name);
		System.out.println("My integer is:" + blank + myDouble);
	}
}

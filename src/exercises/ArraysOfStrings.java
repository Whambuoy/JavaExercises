package exercises;

public class ArraysOfStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = new String[3];
		
		words[0] = "Esther";
		words[1] = "Wambui";
		words[2] = "Maina";
		
		System.out.println(words[2]);
		System.out.println();
		
		String[] fruits = {"apple", "passion fruit", "avocado", "kiwi"};
		
		for(String fruit: fruits) {
			System.out.println(fruit);
		}

	}

}

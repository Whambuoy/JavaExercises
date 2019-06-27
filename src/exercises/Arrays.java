package exercises;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] values;
		
		//The new key word is used to allocate memory to hold 3 integers
		values = new int [3];
		
		values[0] = 45;
		
		System.out.println(values[0]);
		System.out.println();
		
		for(int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}
	}

}

package exercises;

class Check{
	public void start() {
		System.out.println("Getting checked.");
	}
}

interface Plant{
	public void grow();
}

public class AnonymousClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//This is a child class of Check, that does not have a name
		//You cannot create objects under it though
		//It is called an anonymous class
		Check check1 = new Check() {
			@Override public void start() {
				System.out.println("Getting checked in Override");
			}
			
		};
		
		check1.start();
		
		//Example with interface
		
		Plant plant1 = new Plant() {

			@Override
			public void grow() {
				// TODO Auto-generated method stub
				System.out.println("Plant is growing");
			}
			
		};
		
		plant1.grow();
		
	}

}

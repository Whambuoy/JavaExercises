package exercises;

	//You can add other classes
class Person{
	String name;
	int age;
}


public class ClassesAndObjects {

	/*
	 * You can only have one public class.
	 * A class is a template for creating objects (specifies the objects.
	 * Classes contain: Data & Subroutines
	 */
	
	
	
	//This is a subroutine in the main class
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//DEclaring a variable person1 of type Person which holds an object of type Person
		Person person1 = new Person();
		
		person1.name = "Esther";
		person1.age = 22;
		
		Person person2 = new Person();
		
		person2.name = "Wambui";
		person2.age = 23;
	}

}

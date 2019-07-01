package exercises;

class Individual{
	String name;
	int age;
	
	// method name starts with a small letter
	void speak() {
		System.out.println("My name is " + name + " and I am " + age + " years old.");
	}
}


public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Individual person1 = new Individual();
		person1.name = "Camilla";
		person1.age = 23;
		person1.speak();
	}

}

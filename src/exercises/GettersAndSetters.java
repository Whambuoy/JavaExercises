package exercises;

class Peeps{
	String name;
	int age;
	
	void talk() {
		System.out.println("My name is: " + name);
	}
	
	int calculateYearsToRetirement() {
		int yearsLeft = 65 - age;
		//System.out.println(yearsLeft);
		
		//The return value enables one to get the result within the main function
		return yearsLeft;
	}
	
	String getName() {
		return name;
	}
}
public class GettersAndSetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Peeps peep1 = new Peeps();
		peep1.name = "Jane";
		peep1.age = 35;	
		//peep1.talk();
		
		peep1.calculateYearsToRetirement();
		
		int years = peep1.calculateYearsToRetirement();
		
		System.out.println("Years to retirement: " + years);
		
		
		String name = peep1.getName();
		System.out.println(name);
	}

}

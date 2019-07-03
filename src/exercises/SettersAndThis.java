package exercises;

class Frog{
	String name;
	int age;
	
	public void setName(String newName) {
		name = newName;
	}
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
}
public class SettersAndThis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Frog frog1 = new Frog();
		//frog1.name = "Maddie";
		//frog1.age = 2;
		frog1.setName("Maddie");
		
		System.out.println(frog1.getName());
	}

}

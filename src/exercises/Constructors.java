package exercises;

class Machine {
	
	private String name;
	
	//Constructors can be used for initialization of instance variables
	public Machine() {
		
		//This needs to be at the first line
		this ("Wambui");

		System.out.println("Constructor executing");
		name = "Foie";
		
		//Calling a constructor within a constructor
	}
	
	public Machine (String name) {
		this.name = name;
		System.out.println("Go");
	}
}
public class Constructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Machine machine1 = new Machine();
		
		//Invokes the constructor
		new Machine();
		
		//Invokes the constructor with parameters
		new Machine("July");
	}

}

package exercises;

//Inheritance3 is derived from Interafce2 or Inheritance3 inherits from Inheritance2
//Means that interface3 has all the methods that interface2 has
public class Inheritance3 extends Inheritance2{
	
	//This one calls that of interface2. (Right click on body, go to source, select override)
	//You can edit the body of the method too
	//Override has a capital "O", which means that it is a class
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		super.stop();
	}

	public void wipeWindShield() {
		System.out.println("Wiping windshield :-)");
	}
	
	//This automatically overrides because there is a method in interface 2 with the same name
	public void start() {
		System.out.println("Inheritance3 started");
	}
	
	public void displayName() {
		System.out.println("My name is: " + name);
	}
}

/*Some classes cannot be extended because they are final, for example String class
 * You can also override methods
 * Never attempt to override variables, only override methods
 * 
*/
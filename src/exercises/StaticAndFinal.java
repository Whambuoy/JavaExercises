package exercises;

class Thing{
	//final is Java's version of "constant'
	//Note that constant values are conventionally represented with uppercase letters
	//You cannot assign a value to such later in the program since it is final
	public final static int MY_NUMBER = 19;
	
	//In most cases, instance variables are declared private
	public String name;
	
	//static variables also known as class variables and there's only one copy for that class
	public static String description;
	
	public static int count;
	//This constructor is executed whenever class Thing is called.
	//Thus, you can use such an opportunity to increment count
	//Any time an object increments count, there will only be one copy of count for that class
	//Remember that a static variable is not tied to objects but classes
	public Thing() {
		count ++;
	}
	
	public void showName () {
		System.out.println(name);
	}
	
	
	/*Sample of static method
	*Static methods cannot access instance variables eg. "sysout name"
	*Static instance variables exist even before the existence of any objects. 
	*So how can a method know about instance variables? It cannot
	*However, instance methods can access static methods
	*/
	public static void showInfo() {
		System.out.println("Hello there!");
	}
}
public class StaticAndFinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Thing.description = "How lovely";
				//System.out.println(Thing.description);
				
				Thing.showInfo();

		System.out.println("Before creating objects, thing is: " + Thing.count);

		Thing thing1 = new Thing();
		Thing thing2 = new Thing();
		
		System.out.println("After creating objects, thing is: " + Thing.count);

		thing1.name = "Esther";
		thing2.name = "Wambui";
		
		thing1.showName();
		thing2.showName();
		

		
		
		//This will give an error because PI is a constant in the Math class, thus static.
		//Math.PI = 3.456799;
		
		System.out.println(Thing.MY_NUMBER);
		
	}

}

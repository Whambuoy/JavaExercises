package exercises;

public class AccessPlant {
	
	//Bad practice
	public String name;
	
	//This can only be accessed within this class
	private String type;
	
	protected String size;
	
	//No modifier
	//Without an access specifier, the variable is accessible anywhere within the package.
	//Even subclasses of this class won' access it when outside this package
	String bag;
	
	//Acceptable practice
	//Can be accessed from anywhere but cannot be changed from anywhere
	//Capitalize constant names
	//Final - won't change
	public final static int ID = 19;
	
	public AccessPlant() {
		this.name = "Mart";
		this.type = "Plant";
		this.size = "Large";
	}
}

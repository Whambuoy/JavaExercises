package exercises;


class Wambui{
	
	//Cannot be changed from outside the class
	public static final int id = 19;
	
	private String name;
	
	public String getData() {
		String data = "Some stuff" + calculateGrowthForecast();
		return data;
	}
	
	//This method is only accessible within this class
	private int calculateGrowthForecast() {
		return 9;
	}

	//Getters and setters are methods that allow you to access private data
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

public class Encapsulation1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

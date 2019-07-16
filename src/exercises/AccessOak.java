package exercises;

public class AccessOak extends AccessPlant{
	public AccessOak() {
		
		//Won't work because type was private
		//type = "Tree";
		
		//Size was protected
		//Thus it is accessible within the class, subclass and package
		this.size = "large";
	}
}

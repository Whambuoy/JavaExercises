package exercises;

public class AccessField {
	private AccessPlant plant = new AccessPlant();
	
	public AccessField() {
		
		//Works because size is protected and AccessField is in the same package
		System.out.println(plant.size);
	}
}

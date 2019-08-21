package exercises;

/*
 * The base class holds a base for other classes
 * Say there is a base class called AbstractBase for the hierarchy
 */
public class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractCamera cam1 = new AbstractCamera();
		cam1.setId(5);
		
		AbstractCar car1 = new AbstractCar();
		car1.setId(3);
		
		//This is no possible
		//AbstractBase base = new AbstractBase();
	}

}

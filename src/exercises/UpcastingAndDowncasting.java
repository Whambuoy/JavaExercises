package exercises;

class Upcasting{
	public void start() {
		System.out.println("Machine started.");
	}
}

//Create a child class
class Camera extends Upcasting{
	public void start() {
		System.out.println("Camera started.");
	}
	
	public void snap() {
		System.out.println("Photo taken.");
	}
}

public class UpcastingAndDowncasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Upcasting machine1 = new Upcasting();
		Camera camera1 = new Camera();
		
		machine1.start();
		camera1.start();
		camera1.snap();
		
		//Upcasting
		//This is polymorphism
		//Upcasting machine2 = new Camera();
		//or
		Upcasting machine2 = camera1;
		machine2.start();
		//Error: machine2.snap;
		//This is because machine2 knows which methods it can call
		
		
		//Downcasting
		//This can be risky. be careful
		//Similarly you need to cast similar types eg string and string
		Upcasting machine3 = new Camera();
		//You have to cast (Camera) to specify teh type
		Camera camera2 = (Camera)machine3;
		//Now you can call Camera's start and snap
		camera2.start();
		camera2.snap();
		
		/*
		 * This won't work
		 * Upcasting machine3 = new Machine();
		 *
		 *Camera camera2 = (Camera)machine3;
		 *The following methods won't work: this is because machine3 was initially of class Machine, not Camera
		 *camera2.start();
		 *camera2.snap();
		 */
		
	}
	
	

}

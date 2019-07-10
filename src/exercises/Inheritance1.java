package exercises;

public class Inheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inheritance2 mach1 = new Inheritance2();
		mach1.start();
		mach1.stop();
		
		System.out.println();
		
		Inheritance3 mach2 = new Inheritance3();
		mach2.start();
		mach2.wipeWindShield();
		mach2.stop();
	}

}

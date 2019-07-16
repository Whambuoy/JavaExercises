package exercises;

public class Interface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Interface2 inter2 = new Interface2();
		inter2.start();
		
		Interface3 inter3 = new Interface3(null);
		inter3.greet();
		
		Interface4 inter4 = new Interface2();
		inter4.showInfo();
		
		Interface4 inter41 = inter2;
		inter41.showInfo();
		
		outputInfo(inter2);
		//outputInfo(inter3);

	}
	public static void outputInfo(Interface4 inter4) {
		inter4.showInfo();
	}
}

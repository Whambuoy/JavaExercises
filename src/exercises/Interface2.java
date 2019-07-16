package exercises;

//A class can have as many interfaces as you'd wish, but it can only extend one parent class
//You can't use "new" for interfaces to allocate new memory for an interface name normally.
public class Interface2 implements Interface4{

		private int id = 7;
		
		public void start() {
			System.out.println("Interface2 started");
		}

		@Override
		public void showInfo() {
			// TODO Auto-generated method stub
			System.out.println("Interface2 id is " + id);
		}

}

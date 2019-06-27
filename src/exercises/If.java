package exercises;

public class If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int myInt = 4;
				
		/*If else control statement
		if(myInt < 5) {
			System.out.println("It is true");
		}
		else if (myInt == 5){
			System.out.println("It is false");
		}
		else {
			System.out.println("None of the above");
		} */
		
		int mySecondInt = 1;

		while (mySecondInt < 5) {
			System.out.println(mySecondInt);
			
			if (mySecondInt == 3) {
				System.out.println("End");
				break;
			}
			
			mySecondInt++;
		}
	}
}

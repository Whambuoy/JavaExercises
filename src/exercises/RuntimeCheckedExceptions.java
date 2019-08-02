package exercises;

public class RuntimeCheckedExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Checked exceptions have to be handled
		try {
			Thread.sleep(111);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Unchecked or runtime do not have to be handled
		//This, for instace gives an arithemetic exception
		/*
		int value = 7;
		value = value/0;
		*/
		
		//Or
		/*
		String text;
		System.out.println(text.length());
		*/
		
		//--------------------------------------------------------------------------------
		//Arratindexoutofbounds exception
		//You can add your own try-catch block
		try {
		String[] texts = {"One", "Two"};
		System.out.println(texts[3]);
		
		//Can be (RuntimeException e) or (ArrayIndexOutOfBoundsException e)
		} catch(Exception e){
			System.out.println(e.getMessage());
			System.out.println(e.toString());
		}

}
}

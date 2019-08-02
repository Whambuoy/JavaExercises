package exercises;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class MultipleExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleExceptionsTest test = new MultipleExceptionsTest();
		/*
		try {
			test.run();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		*/
		
		
		//Introduced in Java 7
		
		/*try {
			test.run();
		} catch (IOException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		try {
			test.run();
			
			//Using "Exception" covers both parse and IO exceptions
			//Exception is a parent class, the others are child classes
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			test.input();
		} 
		//Note that filenotfoundexception comes first because it is a child of IO
		//If IO came first, there will be an unreachable catch block
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

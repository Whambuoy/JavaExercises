package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class HandlingExceptions2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("test.txt");
		
		//This is a try catch block
		try {
			FileReader fr = new FileReader(file);
			
			//This will not be executed if there are exceptions
			System.out.println("Proceeding...");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File not found " + file.toString());
		}
		
		System.out.println("Finished");
	}

}

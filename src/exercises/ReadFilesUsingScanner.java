package exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFilesUsingScanner {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		String fileName = "/home/whambuoy/Desktop/sample.txt";
		
		//Create a Java object
		File textFile = new File(fileName);
		
		Scanner in = new Scanner(textFile);

		if (in.hasNextInt()) {
		    //in.nextInt();
		    System.out.println(in.nextInt());
		
		}else {
		     throw new RuntimeException("Wanted an integer number, but got: " + in.next());
			   }
		
		//Loop that will read the whole file line by line
		while(in.hasNextLine()) {
			String line = in.nextLine();
			System.out.println(line);
		}
		
		in.close();
	}

}

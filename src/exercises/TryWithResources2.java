package exercises;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources2 {

	
	//Try with resources works on Java 7
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("TryWithResoucesText.txt");
		
		try (BufferedReader br = new BufferedReader(new FileReader(file))){
			
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
					
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Unable to finde file: " + file.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Unable to read file: " + file.toString());
		}
	}

}

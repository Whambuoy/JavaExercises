package exercises;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReading {

	public static void main(String[] args) {
		File file = new File("FileReaderText.txt");
		
		BufferedReader br = null;
		
		try {
			FileReader fr = new FileReader(file);
			br = new BufferedReader(fr);
			
			String line;
			
			while ( (line = br.readLine()) != null) {
				System.out.println(line);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File not found: " + file.toString());		
			} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Unable to read file: " + file.toString());
		}
		
		//The finally clause will always be executed
		finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NullPointerException ex) {
				//File was probably never opened
			}
		}
	}

}

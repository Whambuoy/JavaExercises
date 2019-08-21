package exercises;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingTextFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("WritingTextFilesText.txt");
		
		try (BufferedWriter br = new BufferedWriter(new FileWriter(file))){
			
			br.write("Line 1");
			br.newLine();
			br.write("Second one");
					
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Unable to read file: " + file.toString());
		}

}
}

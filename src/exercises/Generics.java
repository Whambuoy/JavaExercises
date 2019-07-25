package exercises;

import java.util.ArrayList;
import java.util.HashMap;

class WambuiAnimals{
	
}

public class Generics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Before Java 5 ---------------------------------------------------------------
		ArrayList list = new ArrayList();
		
		list.add("Papaya");
		list.add("Pineapple");
		list.add("Watermelon");
		
		//You have to downcast the result given by get
		String fruit = (String) list.get(1);
		System.out.println(fruit);
		
		//Modern style ----------------------------------------------------------------
		ArrayList<String> strings = new ArrayList<String>();
		strings.add("Dogs");
		strings.add("Donkey");
		strings.add("Monkey");
		
		String animal = strings.get(2);
		System.out.println(animal);
		
		//You can have multiple parametarized types -----------------------------------
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		//Java 7 style ----------------------------------------------------------------
		ArrayList<WambuiAnimals> wambuiList = new ArrayList<>();
	}

}

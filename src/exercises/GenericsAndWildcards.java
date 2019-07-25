package exercises;

import java.util.ArrayList;

class Vehicles{

	@Override
	public String toString() {
		return "Vehicles indeed!";
	}
	
	public void start() {
		System.out.println("Vehicles Started.");
	}
	
}

class Vegetables extends Vehicles{

	@Override
	public String toString() {
		return "Vegetables here we come!";
	}
	
}
public class GenericsAndWildcards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ------------------------------------------------------------------------------------------
		ArrayList<Vehicles> list = new ArrayList<Vehicles>();
		
		list.add(new Vehicles());
		list.add(new Vehicles());
		showList(list);
		
		// -------------------------------------------------------------------------------------------
		ArrayList<Vegetables> list2 = new ArrayList<Vegetables>();
		
		list2.add(new Vegetables());
		list2.add(new Vegetables());
		showList2(list2);

	}
	
	public static void showList(ArrayList<Vehicles> list) {
		// TODO Auto-generated method stub
		for (Vehicles value: list) {
			System.out.println(value);
		}
	}
	
	//Wild card marked with question mark
	public static void showList2(ArrayList<?> list2) {
		// TODO Auto-generated method stub
		//You can downcast Object to Camera, to use Camera specific methods
		for (Object value: list2) {
			System.out.println(value);
		}
	}
	
	//This could be machine or its subtype
	public static void showList3(ArrayList<? extends Vehicles> list) {
		// TODO Auto-generated method stub
		//You can downcast Object to Camera, to use Camera specific methods
		for (Vehicles value: list) {
			System.out.println(value);
			value.start();
			list.get(2);
		}

	}
	
	//Upperbound
	//Could be a camera or super type of camera
	public static void showList4(ArrayList<? super Vegetables> list2) {
		// TODO Auto-generated method stub
		//You can downcast Object to Camera, to use Camera specific methods
		for (Object value: list2) {
			System.out.println(value);
		}

	}
	

}

package exercises;

public class Polymorphism extends PolymorphismPlant {
	
	/*
	public static PolymorphismPlant opp;
	   public Polymorphism(PolymorphismPlant oppp) {
	    oppp.grow();
	     //System.out.print(oppp.grow());
	   } 
	 */
	   
	public static void main(String[] args) {
		PolymorphismPlant plant1 = new PolymorphismPlant();
		PolymorphismTree tree1 = new PolymorphismTree();
		
		//PolymorphismPlant plant2 = plant1; 
		//or
		PolymorphismPlant plant2 = tree1; 
		//Now that is polymorphism
		
		plant2.grow();
		tree1.shedLeaves();
		doGrow(tree1);
	}
	
	public static void doGrow(PolymorphismPlant plant) {
		plant.grow();
	}
	
}

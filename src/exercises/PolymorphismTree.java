package exercises;

public class PolymorphismTree extends PolymorphismPlant{
	
	@Override
	public void grow() {
		// TODO Auto-generated method stub
		//super.grow();
		System.out.println("The tree is growing");

	}

	public void shedLeaves() {
		System.out.println("Time to shed some leaves");
	}
	
}

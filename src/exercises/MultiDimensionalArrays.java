package exercises;

public class MultiDimensionalArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//This is an array within an array
		int [] [] grid = {
				{34, 45, 56},
				{67, 78},
				{11, 22, 33}
		};	
		
		System.out.println(grid [1] [1]);
		
		String [] [] words = new String [2][3];
		words [0] [1] = "Esther Wambui";
		System.out.println(words[0][1]);
			
		System.out.println(grid.length);
		for(int row = 0; row < grid.length; row++) {
			for(int column = 0; column < grid[row].length; column++) {
				System.out.print(grid[row][column] + "\t");
			}
			System.out.println();
		}
	}

}

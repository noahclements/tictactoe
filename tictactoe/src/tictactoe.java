
public class tictactoe {
	public static void main(String[] args) {
		
		String[][] grid = {
				{"|", "|"}, 			
				{"|", "|",},		  								
				{"|", "|",}  			
	};

		System.out.println("  A    B    C");
		for(int row=0; row < grid.length; row++) {				// this will display all rows 
			System.out.println("--------------");
			for(int column=0; column < grid[row].length; column++) {	// this will display all columns, 
				System.out.print("    ");
				System.out.print(grid[row][column] + "");		// prints out the rows and columns along with integers
			}
			System.out.print("      " + (row+1));
			System.out.println();
}
		
		System.out.println("Player vs Player (A)");
		System.out.println("Player vs AI (B)");
		
		
		
		
		
		
	}
}

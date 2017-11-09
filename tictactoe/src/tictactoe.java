
public class tictactoe {
	public static void main(String[] args) {

		System.out.println("Player vs Player (A)");
		System.out.println("Player vs AI (B)");
		
		gridMaker();

	}

	public static void gridMaker() {
	
		char[][] grid;
		grid = new char[3][3];

		System.out.println("  A   B   C");
		System.out.println("-------------");
		
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(grid[i][j] + " | ");
            }
            System.out.print(i+1);
            System.out.println("\n" + "-------------");
        }
		
		
	}
}

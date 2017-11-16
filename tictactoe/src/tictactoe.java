import java.util.Scanner;

public class tictactoe {
	private static char[][] grid = new char[3][3];

	static char marker = 'x';
	static int rowPicked;
	static int columnPicked;
	private static Scanner scanner;
	private static String numInput;
	private static String input;
	
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		gridInitialize();
		/*
		System.out.println("Player vs Player (A)");
		System.out.println("Player vs AI (B)");
		String input = scanner.nextLine();
		if(input.equalsIgnoreCase("A")) {
			
		} else if(input.equalsIgnoreCase("B")) {
			
		}
		*/
	}

	public static void gridInitialize() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				grid[i][j] = '-';
			}
		}
		gridMaker();
	}

	public static void gridMaker() {

		System.out.println("  A   B   C ");
		System.out.println("-------------");

		for (int i = 0; i < 3; i++) {
			System.out.print("| ");
			for (int j = 0; j < 3; j++) {
				System.out.print(grid[i][j] + " | ");
			}
			System.out.print(i + 1);
			System.out.println("\n" + "-------------");
		}
		rowPicker();
	}
		// this will decide the designated place where the player wants their marker to be placed
	public static void rowPicker() {
		rowPicked = 3;
		System.out.println("Pick a row (A-C)");
		scanner = new Scanner(System.in);
		while(!(rowPicked == 0 || rowPicked == 1 || rowPicked == 2)) {
			input = scanner.nextLine();
			if (input.equalsIgnoreCase("A")) {
				rowPicked = 0; // A = 0, etc.
			} else if (input.equalsIgnoreCase("B")) {
				rowPicked = 1;
			} else if (input.equalsIgnoreCase("C")) {
				rowPicked = 2;
			} else {
				System.out.println("INVALID INPUT, please enter a row from A-C");
			}
		}
		columnPicker();
	}

	public static void columnPicker() {
		columnPicked = 3;
		System.out.println("Pick a column (1-3)");
		scanner = new Scanner(System.in);
		while (!(columnPicked == 0 || columnPicked == 1 || columnPicked == 2)) {
			numInput = scanner.nextLine();	// chose to use String instead of int so it doesnt crash if non-int
			if (numInput.equals("1")) {		
				columnPicked = 0; // grid array starts at 0..
			} else if (numInput.equals("2")) {
				columnPicked = 1;
			} else if (numInput.equals("3")) {
				columnPicked = 2;
			} else {
				System.out.println("INVALID INPUT, please enter a number between 1 and 3");
			}
				
		}
		placeMark(columnPicked, rowPicked);
	}
		
	

	public static void markerChange() {
		if (marker == 'x') {
			marker = 'o';
		} else {
			marker = 'x';
		}
		gridMaker();
	}

	public static void placeMark(int rowPicked, int columnPicked) {
		if (grid[rowPicked][columnPicked] == '-') {
			grid[rowPicked][columnPicked] = marker;
			checkWinner();
		} else if (grid[rowPicked][columnPicked] == 'x' || grid[rowPicked][columnPicked] == 'o') {
			System.out.println("Please pick an empty space");
			rowPicker();
		}
	}
	
	public static boolean rowChecker() {
		for(int i = 0; i < 3; i++) {
		if(grid[i][0] == marker && grid[i][1] == marker && grid[i][2] == marker) {
				return true;
			}
	}
		return false;
}
	
	public static boolean columnChecker() {
		for(int i = 0; i < 3; i++) {
		if(grid[0][i] == marker && grid[1][i] == marker && grid[2][i] == marker) {
				return true;
			}
		}
			return false;
	}
	
	public static boolean diagonalChecker() {
		if((grid[0][0] == 'x' && grid[1][1] == 'x' && grid[2][2] == 'x') || (grid[0][0] == 'o' && grid[1][1] == 'o' && grid[2][2] == 'o')) {
			return true;
		} else if((grid[0][2] == 'x' && grid[1][1] == 'x' && grid[2][0] == 'x') || (grid[0][2] == 'o' && grid[1][1] == 'o' && grid[2][0] == 'o')) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean checkFull() {
		for (int i = 0; i < 3; i++) {
			for (int x = 0; x < 3; x++) {
				if (grid[i][x] == '-') {
					return false;
				}
			}
		}
		return true;
	}

	public static void checkWinner() {
		if (rowChecker() == true || columnChecker() == true || diagonalChecker() == true) {
			System.out.println("Player " + marker + " is the winner!");
			System.out.println("Thank you for playing!");
		} else if (checkFull() == true) {
			System.out.println("The Grid is full, Game Over!");
		} else {
			markerChange();
		}
	}

}

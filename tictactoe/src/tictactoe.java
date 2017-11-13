import java.util.Scanner;

public class tictactoe {
	private static char[][] grid = new char[3][3];
	static char Player_X = 'x';
	static char Player_O = 'o';
	static char marker = 'x';
	static int rowPicked;
	static int columnPicked;
	private static Scanner scanner;
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		gridInitialize();
		
		System.out.println("Player vs Player (A)");
		System.out.println("Player vs AI (B)");
		String input = scanner.nextLine();
		if(input.equalsIgnoreCase("A")) {
			
		} else if(input.equalsIgnoreCase("B")) {
			
		}
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
		areaPicker();
	}
		// this will decide the designated place where the player wants their marker to be placed
	public static void areaPicker() {
		System.out.println("Pick a row (A-C)");
		String input = scanner.nextLine();
		if(input.equalsIgnoreCase("A")) {
			rowPicked = 0;		// A = 0, etc.
		} else if(input.equalsIgnoreCase("B")) {
			rowPicked = 1;
		} else if(input.equalsIgnoreCase("C")) {
			rowPicked = 2;
		}
		
		System.out.println("Pick a column (1-3)");
		int numInput = scanner.nextInt();
		if(numInput == 1) {
			columnPicked = 0;	// grid array starts at 0..
			markerChange();
			placeMark(columnPicked, rowPicked);
		} else if(numInput == 2) {
			columnPicked = 1;
			markerChange();
			placeMark(columnPicked, rowPicked);
		} else if(numInput == 3) {
			columnPicked = 2;
			markerChange();
			placeMark(columnPicked, rowPicked);
		}
	}
	
	
	
	public static void markerChange() {
		if(marker == 'x') {
			marker = 'o';
		} else {
			marker = 'x';
		}	 
	}
	
	
	public static void placeMark(int rowPicked, int columnPicked) {
		if(grid[rowPicked][columnPicked] == '-') {
			grid[rowPicked][columnPicked] = marker;
		}
		gridMaker();
	}
		
	
	
	
	
	
	
}

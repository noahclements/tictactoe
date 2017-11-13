import java.util.Scanner;

public class tictactoe {
	private static char[][] grid = new char[3][3];
	static char Player_X = 'x';
	static char Player_O = 'o';
	static char marker = 'x';
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
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
	
	public static void areaPicker() {
		System.out.println();
	}
	
	
	
	public static void markerChange() {
		if(marker == Player_X) {
			marker = Player_O;
		} else if(marker == Player_O) {
			marker = Player_X;
		}	 
	}
	
	
	public static void placeMark() {
		
	}
	
	
	
	
	
}

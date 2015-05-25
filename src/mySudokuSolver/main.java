package mySudokuSolver;

public class main {

	public static void main(String[] args) {
		
		Game game = new Game();
		
		// matrixTest();
		
	}

	private static void matrixTest() {
		// TODO Auto-generated method stub
		int counter = 1;
		int[][] matrix = new int[9][9];
		
		for (int x = 0; x < matrix.length; x++) {
			for (int y = 0; y < matrix[0].length; y++) {
				matrix[x][y] = counter;
				System.out.print(counter + space(counter));
				counter++;
			}
			System.out.println();
		}
		
		System.out.println("--------");
		
		// create the rows
		for (int x = 0; x < matrix.length; x++) {
			int[] row = matrix[x];	
			
			//print rows
			for (int i : row) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		System.out.println("-------------");
		
		// create the columns
		for (int tempCol = 0; tempCol < matrix.length; tempCol++) {
			int[] col = new int[9];
			for (int tempRow = 0; tempRow < matrix.length; tempRow++) {
				col[tempRow] = matrix[tempRow][tempCol];
			}
			
			//print columns
			for (int i : col) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		
	}

	private static String space(int counter) {

		if (counter < 10) {
			return "   ";
		}
		return "  ";
	}

}

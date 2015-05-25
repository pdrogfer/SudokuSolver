package mySudokuSolver;

public class Game {

	private Board board;
	
	// to iterate
	private CellSet myRow, myCol;

	public Game() {
		board = new Board();
		
		// Play Routine:
		
		// 1. Check all rows
		// checkRows();
		
		// 2. Check all columns
		checkCols();
		
		// board.printBoard();
	}

	private void checkRows() {
		for (int i = 0; i < 9; i++) {
			myRow = new CellSet(board.getRow(i));
			myRow.checkSet();
			myRow.seeSet();
		}
	}
	
	private void checkCols() {
		for (int i = 0; i < 9; i++) {
			myCol = new CellSet(board.getCol(i));
			myCol.checkSet();
			myCol.seeSet();
		}
	}
}

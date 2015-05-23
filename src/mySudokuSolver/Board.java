package mySudokuSolver;

import java.util.Arrays;

public class Board {
	
	//TODO create a two-dimensional array of objects Cell, 'board'
	private Cell[][] board = new Cell[9][9];
	
	public Board() {
		
		// initialize cells with default value
		for (int x = 1; x < 10; x++) {
			for (int y = 1; y < 10; y++) {
				board[x-1][y-1] = new Cell(0);
				System.out.println(board[x-1][y-1].toString());
			}
		}
		
		initRows();
		initCols();
		initSqrs();
		
	}
	
	//TODO create nine instances of CellSet (which takes the Cells from the board), the rows, and store them in an array
	private void initRows() {
		for (int i = 1; i < 9; i++) {
			CellSet row = new CellSet(board[i]);
			//row.populateSet();
			//row.seeSet();
		}
	}

	private void initSqrs() {
		// TODO Auto-generated method stub
		
	}

	private void initCols() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "Board [board=" + Arrays.toString(board) + "]";
	}

}

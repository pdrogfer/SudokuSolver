package mySudokuSolver;

import java.util.Arrays;
import java.util.Random;

public class Board {
	
	//TODO create a two-dimensional array of objects Cell, 'board'
	private Cell[][] board = new Cell[9][9];
	private Cell cell;
	
	// for test purposes
	private Random random = new Random();
	
	public Board() {
		
		// initialize cells with random value
		for (int x = 1; x < 10; x++) {
			for (int y = 1; y < 10; y++) {
				cell = new Cell(0);
				board[x-1][y-1] = cell;
				if (cell.getCellIndex() % 2 == 0) {
					cell.setValue(random.nextInt(10));
				} else {
					cell.setValue(0);
				}
				System.out.println(cell.toString());
			}
		}
		System.out.println("--Board initialized--");
		
		//initRows();
		initCols();
		//initSqrs();
		
	}
	
	//TODO create nine instances of CellSet (which takes the Cells from the board), the rows, and store them in an array
	private void initRows() {
		for (int x = 1; x < 10; x++) {
			Row row = new Row(board[x-1]);
			row.seeSet();
		}
	}

	//TODO problems here
	private void initCols() {
		Cell[] tempCol = new Cell[9];
		for (int x = 1; x < 10; x++) {
			for (int y = 1; y < 10; y++) {
				tempCol[x-1] = board[y-1][x-1];				
			}
			Row col = new Row(tempCol);
			//col.seeSet();
		}
		for (int i = 0; i < tempCol.length; i++) {
			System.out.println(tempCol[i].toString());

		}
	}
	
	private void initSqrs() {
	}

	@Override
	public String toString() {
		return "Board [board=" + Arrays.toString(board) + "]";
	}
	
	private class Row extends CellSet {

		public Row(Cell[] cells) {
			super(cells);
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {
			return "myRow [toString()=" + super.toString() + ", getClass()="
					+ getClass() + ", hashCode()=" + hashCode() + "]";
		}
		
	}

}

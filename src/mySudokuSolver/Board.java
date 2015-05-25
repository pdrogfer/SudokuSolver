package mySudokuSolver;

import java.util.Arrays;
import java.util.Random;

public class Board {

	// TODO create a two-dimensional array of objects Cell, 'board'
	private Cell[][] board = new Cell[9][9];
	private Cell cell;
	private Cell[] row;
	private Cell[] col;
	private Cell[] sqr;
	private Cell[][] columns = new Cell[9][];

	// for test purposes
	private Random random = new Random();
	private int[] testGame = { 0, 8, 0, 5, 0, 1, 0, 7, 0, 5, 0, 0, 0, 9, 0, 0, 0,
			8, 0, 0, 9, 0, 0, 0, 5, 0, 0, 3, 0, 0, 2, 0, 5, 0, 0, 4, 0, 2, 0,
			0, 0, 0, 0, 1, 0, 4, 0, 0, 8, 0, 6, 0, 0, 3, 0, 0, 0, 0, 0, 0, 3,
			0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 1, 0, 0, 0, 7, 0, 4, 0, 6, 2 };

	public Board() {

		// initialize cells with testGame value
		for (int x = 0; x < board.length; x++) {
			for (int y = 0; y < board.length; y++) {
				cell = new Cell(0);
				board[x][y] = cell;
				cell.setValue(testGame[cell.getCellIndex() - 1]);
			}
		}
		printBoard();

		initRows();
		initCols();
		// initSqrs();

	}

	public void printBoard() {
		for (int i = 0; i < this.board.length; i++) {
			Cell[] cells = this.board[i];
			for (int j = 0; j < cells.length; j++) {
				Cell cell = cells[j];
				System.out.print(cell.getCellValue() + "  ");				
			}
			System.out.println();
		}
		System.out.println("--Board initialized--");
	}

	// TODO create nine instances of CellSet (which takes the Cells from the
	// board), the rows, and store them in an array
	private void initRows() {
		
		Cell[] tempRow = new Cell[9];
		for (int x = 0; x < board.length; x++) {
			for (int y = 0; y < board.length; y++) {
				tempRow[y] = board[x][y];
			}
//			System.out.println("Row " + (x + 1));
//			for (int i = 0; i < board.length; i++) {
//				System.out.println(tempRow[i].toString());
//			}
		}
	}

	private void initCols() {
		
		Cell[] tempCol = new Cell[9];
		for (int x = 0; x < board.length; x++) {
			for (int y = 0; y < board.length; y++) {
				tempCol[y] = board[y][x];
			}
			columns[x] = tempCol;
		
//			System.out.println("Col " + (x + 1));
//			for (int i = 0; i < tempCol.length; i++) {
//				System.out.println(tempCol[i].toString());
//			}
		}
	}

	private void initSqrs() {
	}
	
	

	public Cell[] getRow(int x) {
		return board[x];
	}

	public void setRow(Cell[] row, int x) {
		this.row = row;
	}

	public Cell[] getCol(int y) {
		return columns[y];
		
	}

	public void setCol(Cell[] col, int y) {
		this.col = col;
	}

	public Cell[] getSqr() {
		return sqr;
	}

	public void setSqr(Cell[] sqr) {
		this.sqr = sqr;
	}

	@Override
	public String toString() {
		return "Board [board=" + Arrays.toString(board) + "]";
	}


}

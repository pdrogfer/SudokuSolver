package mySudokuSolver;

import java.util.Random;

public class Game {

	//TODO create board and put the numbers
	private int numCells = 9;
	private Cell[] cells = new Cell[numCells];
	// for test purposes
	private Random random = new Random();

	public Game(int numCells) {
		super();
		this.numCells = numCells;
		
		populateBoard(numCells);
	}
	
	public void populateBoard(int numCells) {
		for (int i = 0; i < numCells; i++) {
			cells[i] = new Cell(random.nextInt(numCells));
			
		}
		System.out.println("Board populated");
	}
	
	public void seeBoard() {
			for (Cell tempCell : cells) {
				System.out.println(tempCell.toString());;
		}
	}
	
	
	
	
}

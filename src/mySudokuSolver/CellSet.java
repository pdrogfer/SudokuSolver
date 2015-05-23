package mySudokuSolver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class CellSet {

	//TODO create board and put the numbers
	private int numCells = 9;
	private Cell[] cells = new Cell[numCells];
	private ArrayList<Integer> possibleSetVals = new ArrayList<>();

	// for test purposes
	private Random random = new Random();

	public CellSet(int numCells) {
		super();
		this.numCells = numCells;
		// initialize cells with default value
		for (int i = 0; i < numCells; i++) {
			cells[i] = new Cell(0);
		}
		
		for (int i = 1; i < 10; i++) {
			possibleSetVals.add(i);
		}
		
	}
	
	public void populateSet() {
		for (int i = 0; i < numCells; i++) {
			// populating cells with random numbers for test purposes
			if (i%2 == 0) {
				cells[i].setValue(random.nextInt(10));
			} else {
				cells[i].setValue(0);
			}
		}
		// System.out.println("Board populated");
	}
	
	public void seeSet() {
		for (Cell tempCell : cells) {
			System.out.println(tempCell.toString());;
		}
	}
	
	public void checkSet() {
		for (Cell tempCell : cells) {
			tempCell.checkValue();
			
			//TODO this part still don't work properly. Removes the wrong items from possibleSetVals
			int tempVal = tempCell.getCellValue();
			if (tempVal != 0 && possibleSetVals.contains(tempVal)) {
				possibleSetVals.remove(tempVal);
			}
		}
	}

	@Override
	public String toString() {
		return "CellSet: numCells=" + numCells + " possibleSetVals="
				+ possibleSetVals + "]\n";
	}

	
	
	
}

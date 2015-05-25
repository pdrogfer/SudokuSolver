package mySudokuSolver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class CellSet {

	private int numCells;
	private Cell[] cells;
	private ArrayList<Integer> possibleSetVals = new ArrayList<>();

	// for test purposes
	private Random random = new Random();

	public CellSet(Cell[] cells) {
		super();
		this.numCells = cells.length;
		this.cells = cells;
		
		for (int i = 1; i < 10; i++) {
			possibleSetVals.add(i);
		}
		
	}
	
	public void seeSet() {
		System.out.println("----------------");
		for (int i = 0; i < cells.length; i++) {
			System.out.println(cells[i].toString());
		}
		for (Cell tempCell : cells) {
			System.out.println(tempCell.toString());
		}
	}
	
	public void checkSet() {
		int tempVal;
		for (Cell tempCell : cells) {
			// first check if the cell has already a value and reduce possibleCellVals to it
			tempCell.checkValue();
			tempVal = tempCell.getCellValue();
			// if so update the possible values for the rest of the cells accordingly
			if (tempVal != 0 && possibleSetVals.contains(tempVal)) {
				possibleSetVals.remove(new Integer(tempVal));
			} else if (tempVal == 0) {
				// update cell possible vals from set possible vals
				tempCell.setPossibleVals(possibleSetVals);
			}
		}
	}
	
	@Override
	public String toString() {
		return "CellSet: possibleSetVals="
				+ possibleSetVals + "]\n";
	}

	
	
	
}

package mySudokuSolver;

import java.util.ArrayList;
import java.util.Arrays;

public class Cell {

	private static int generalIndex = 0;
	private int cellIndex;
	private int value;
	private ArrayList<Integer> possibleCellVals = new ArrayList<>();
	
	// default constructor
	public Cell() {
		generalIndex ++;
		setCellIndex(generalIndex);
		value = 0;
		initiateCellValues();
	}
	
	// constructor with value assigned
	public Cell(int val) {
		generalIndex ++;
		setCellIndex(generalIndex);
		this.setValue(val);
		initiateCellValues();
	}
	
	private void initiateCellValues() {
		
		for (int i = 1; i < 10; i++) {
			possibleCellVals.add(i);
		}
	}

	public int getCellValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int checkValue() {
		// if cell has already a value
		if (value != 0) {
			possibleCellVals.clear();
			possibleCellVals.add(value);
		}
		else if (possibleCellVals.size() == 1) {
			setValue(possibleCellVals.get(0));
		}
		return value;
	}
	
	public static int getGeneralIndex() {
		return generalIndex;
	}

	public static void setGeneralIndex(int generalIndex) {
		Cell.generalIndex = generalIndex;
	}

	public int getCellIndex() {
		return cellIndex;
	}

	public void setCellIndex(int cellIndex) {
		this.cellIndex = cellIndex;
	}

	public ArrayList<Integer> getPossibleVals() {
		return possibleCellVals;
	}

	public void setPossibleVals(ArrayList<Integer> possibleVals) {
		this.possibleCellVals = possibleVals;
	}

	@Override
	public String toString() {
		return "Cell n." + cellIndex + ": value=" + value + "; possible Cell values " + possibleCellVals;
	}
	
	
	
	
}

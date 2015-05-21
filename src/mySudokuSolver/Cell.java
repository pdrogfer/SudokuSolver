package mySudokuSolver;

import java.util.ArrayList;
import java.util.Arrays;

public class Cell {

	private static int generalIndex = 0;
	private int cellIndex;
	private int value;
	private ArrayList<Integer> possibleVals = new ArrayList<>();
	
	// default constructor
	public Cell() {
		value = 0;
		initiateValues();
	}
	
	// constructor with value assigned
	public Cell(int val) {
		this.setValue(val);
		initiateValues();
	}
	
	private void initiateValues() {
		generalIndex ++;
		cellIndex = generalIndex;
		for (int i = 1; i < 10; i++) {
			possibleVals.add(i);
		}
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public void checkValue() {
		
		
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
		return possibleVals;
	}

	public void setPossibleVals(ArrayList<Integer> possibleVals) {
		this.possibleVals = possibleVals;
	}

	@Override
	public String toString() {
		
		return "Cell n." + cellIndex + ": value=" + value + " and possible values " + possibleVals;
	}
	
	
	
	
}

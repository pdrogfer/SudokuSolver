package mySudokuSolver;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int setSize = 9;

		CellSet row = new CellSet(setSize);
		
		System.out.println(row.toString());
		
		row.populateSet();
		
		row.checkSet();
		
		row.seeSet();
		
		System.out.println();
		System.out.println(row.toString());

	}

}

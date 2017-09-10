package models;

public class Cell {
	private Pawn pawn;
	private Cell nextCell;
	private boolean isRoset;
	
	public Cell () {
		//Create an empty cell
	}
	
	public Cell (boolean isRoset) {
		setRoset(isRoset);
	}
	
	public Cell (Cell nextCell, boolean isRoset) {
		setNextCell(nextCell);
		setRoset(isRoset);
	}

	public boolean isRoset() {
		return isRoset;
	}

	public void setRoset(boolean isRoset) {
		this.isRoset = isRoset;
	}

	public Pawn getPawn() {
		return pawn;
	}

	public void setPawn(Pawn pawn) {
		this.pawn = pawn;
	}

	public Cell getNextCell() {
		return nextCell;
	}

	public void setNextCell(Cell nextCell) {
		this.nextCell = nextCell;
	}
	
	
}

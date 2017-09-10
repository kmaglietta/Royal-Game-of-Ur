package models;

public class Cell {
	private Pawn pawn;
	private Cell nextCell;
	
	public Cell (Cell nextCell) {
		setNextCell(nextCell);
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

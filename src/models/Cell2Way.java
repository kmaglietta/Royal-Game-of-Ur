package models;

public class Cell2Way extends Cell {
	private Cell _1_nextCell;
	private Cell _2_nextCell;
	
	public Cell2Way() {
		
	}
	
	public void set_1_nextCell(Cell _1_nextCell) {
		this._1_nextCell = _1_nextCell;
	}

	public void set_2_nextCell(Cell _2_nextCell) {
		this._2_nextCell = _2_nextCell;
	}

	public void setNextCells(Cell _1_nextCell, Cell _2_nextCell) {
		set_1_nextCell(_1_nextCell);
		set_2_nextCell(_2_nextCell);
	}
}

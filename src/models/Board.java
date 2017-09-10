package models;

public class Board {
	private Cell _1_stattingCell;
	private Cell _2_startingCell;
	
	public Board() {
		createClassicBoard();
	}
	
	public Cell get_1_stattingCell() {
		return _1_stattingCell;
	}

	public Cell get_2_startingCell() {
		return _2_startingCell;
	}

	private void createClassicBoard() {
		Cell _1_nextCell = new Cell();
		Cell _2_nextCell = new Cell();
		Cell _0_nextCell = new Cell();
		
		Cell _1_tempCell;
		Cell _2_tempCell; 
		
		this._1_stattingCell = _1_nextCell;
		this._2_startingCell = _2_nextCell;
		
		for (int i = 0; i <= 2; i++){
			_1_tempCell = new Cell(i == 2);
			_2_tempCell = new Cell(i == 2);
			
			_1_nextCell.setNextCell(_1_tempCell);
			_2_nextCell.setNextCell(_2_tempCell);
			
			_1_nextCell = _1_tempCell;
			_2_nextCell = _2_tempCell;
		}
		
		_1_nextCell.setNextCell(_0_nextCell);
		_2_nextCell.setNextCell(_0_nextCell);
		
		for (int i = 0; i <= 6; i++) {
			Cell _0_tempCell;
			if (i == 6) {
				_0_tempCell = new Cell2Way(i == 2);
			}
			else {
				_0_tempCell = new Cell(i == 2);
			}
			
			_0_nextCell.setNextCell(_0_tempCell);
			
			_0_nextCell = _0_tempCell;
		}
		

		_1_nextCell = new Cell();
		_2_nextCell = new Cell();
		((Cell2Way) _0_nextCell).setNextCells(_1_nextCell, _2_nextCell);
		
		for (int i = 0; i <= 1; i++) {
			_1_tempCell = new Cell(i == 1);
			_2_tempCell = new Cell(i == 1);
			
			_1_nextCell.setNextCell(_1_tempCell);
			_2_nextCell.setNextCell(_2_tempCell);
			
			_1_nextCell = _1_tempCell;
			_2_nextCell = _2_tempCell;
		}
		
		// Classic board made
	}
}

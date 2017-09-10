package models;

public class Pawn {
	private int player;
	
	public Pawn(int player) {
		setPlayer(player);
	}
	
	public int getPlayer() {
		return this.player;
	}
	
	public void setPlayer(int player) {
		this.player = player;
	}
}

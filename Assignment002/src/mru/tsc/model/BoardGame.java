package mru.tsc.model;

import java.util.Arrays;

public class BoardGame extends Toy{

	private int minPlayers;
	private int maxPlayers;
	private String[] designers;
	
	
	public BoardGame(long serialNumber, String name, String brand, double price, int availableCount,
			String ageAppropriate, int minPlayers, int maxPlayers, String[] designers) {
		super(serialNumber, name, brand, price, availableCount, ageAppropriate);
		this.minPlayers = minPlayers;
		this.maxPlayers = maxPlayers;
		this.designers = designers;
	}



	public int getMinPlayers() {
		return minPlayers;
	}



	public void setMinPlayers(int minPlayers) {
		this.minPlayers = minPlayers;
	}



	public int getMaxPlayers() {
		return maxPlayers;
	}



	public void setMaxPlayers(int maxPlayers) {
		this.maxPlayers = maxPlayers;
	}



	public String[] getDesigners() {
		return designers;
	}


	public void setDesigners(String[] designers) {
		this.designers = designers;
	}
	
	
	public String toString() {
		
		return "Category: BoardGame, " + super.toString() + " # of players: " + minPlayers + "-" + maxPlayers + ", Designer(s): " + Arrays.toString(designers);
		
	}
	
	
	
	
	
	
}

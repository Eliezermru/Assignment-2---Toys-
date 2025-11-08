package mru.tsc.model;

public class Puzzle extends Toy{

	private String puzzleType;

	

	public Puzzle(long serialNumber, String name, String brand, double price, int availableCount,
			String ageAppropriate, String puzzleType) {
		super(serialNumber, name, brand, price, availableCount, ageAppropriate);
		this.puzzleType = puzzleType;
	}



	public String getPuzzleType() {
		return puzzleType;
	}



	public void setPuzzleType(String puzzleType) {
		this.puzzleType = puzzleType;
	}
	
	public String toString() {
		
		return "Category: Puzzle, " + super.toString() + " Puzzle Type: " + puzzleType;
		
	}
	
	
	
	
	
}

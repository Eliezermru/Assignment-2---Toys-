package mru.tsc.model;

public class Figure extends Toy{

	private String classification;
	
	
	public Figure(long serialNumber,  String name, String brand, double price, int availableCount, String ageAppropriate, String classification) {
		super(serialNumber, name, brand, price, availableCount, ageAppropriate);
		this.classification = classification;
	}


	public String getClassification() {
		return classification;
	}


	public void setClassification(String classification) {
		this.classification = classification;
	}
	
	public String toString() {
		
		return "Category: Figure " + super.toString() + " Classification: " + classification;
		
	}
	
	
	
	


	
	

	
}

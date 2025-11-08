package mru.tsc.model;

/**
 * This class is a template for other toy types
 */
public abstract class Toy {

	private long serialNumber; // 189654231
	private String name; //ex G.I. Joe
	private String brand; //ex: Toy Factory
	private double price; //ex  54.25
	private int availableCount; // ex: 5
	private String ageAppropriate; // ex: +3
	

	public Toy(long serialNumber, String name, String brand, double price, int availableCount, String ageAppropriate) {
		this.serialNumber = serialNumber;
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.availableCount = availableCount;
		this.ageAppropriate = ageAppropriate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(long serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getAvailableCount() {
		return availableCount;
	}

	public void setAvailableCount(int availableCount) {
		this.availableCount = availableCount;
	}

	public String getAgeAppropriate() {
		return ageAppropriate;
	}

	public void setAgeAppropriate(String ageAppropriate) {
		this.ageAppropriate = ageAppropriate;
	}
	
	
	@Override
	public String toString() {
		return "Serial Number: " + serialNumber + ", Name: " + name + ", Brand: " + brand + ", Price: " + price
				+ ", Available Count: " + availableCount + ", Age Appropriate: " + ageAppropriate;
	}

}


/*Along with the functionality mentioned above, you will need the following methods in your program:

I. Implement a method that parses the supplied “toys.txt” file into a single arraylist. The
arraylist will be able to contain all Toy types (puzzles, figure, animals, and board games). Use the
first digit of the SN to determine what a valid type of Toy needs to be created (see Formatting
for more information).

II. Implement a method that allows a customer to search and purchase a toy. The customer will be
prompted to enter either SN, name, type of a toy (validate the data!). More information is
described in page 3 (purchase a toy).
a. Make sure all of the search functions are case-insensitive.

III. Implement a method for add a new toy (described above).

IV. Implement a method for remove a new toy (described above).

V. (Optional – Bonus) Implement a method to make a gift suggestion (described above).

VI. Implement and call a method, when the program exits, that takes the toys stored in the arraylist
and store them back to the “toys.txt” file in the proper format.*/

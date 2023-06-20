package CoreJava6;

public class Item {
	private String name;
	private double price;
	
	public Item() {
		this.name = "";
		this.price = 0;
	}
	public Item(String nInput, double pInput) {
		this.name = nInput;
		this.price = pInput;
	}
	
	public String getName() {
		return this.name;
	}
	public double getPrice() {
		return this.price;
	}
	public void setName(String input) {
		this.name = input;
	}
	public void setPrice(double input) {
		this.price = input;
	}
}

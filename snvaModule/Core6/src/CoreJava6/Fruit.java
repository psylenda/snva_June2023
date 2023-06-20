package CoreJava6;

public class Fruit {
	private String color;
	private int weight;
	
	public Fruit(){
		this.color = "blue";
		this.weight = 200;
	}
	
	public Fruit(int w, String c) {
		this.color = c;
		this.weight = w;
	}
	public void color() {
		
	}
	public void avgweight() {
		
	}
	public void setColor(String input) {
		this.color = input;
	}
	public void setWeight(int input) {
		this.weight = input;
	}
	public int getWeight() {
		return this.weight;
	}
	public String getColor() {
		return this.color;
	}
}

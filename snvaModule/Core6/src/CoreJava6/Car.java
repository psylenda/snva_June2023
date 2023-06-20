package CoreJava6;

public class Car {
	private String color;
	private double speed;
	private String sc;
	private String model;
	
	public Car(){
		this.color = "red";
		this.speed = 90;
		this.sc = "Sports";
		this.model = "convertible";
	}
	public Car(String c, double s, String spocou, String m ) {
		this.color = c;
		this.speed = s;
		this.sc = spocou;
		this.model = m;
	}
	public void features(){
		
	}
	public void setColor(String in) {
		this.color = in;
	}
	public void setSpeed(double in) {
		this.speed = in;
	}
	public void setSC(String in) {
		this.sc=in;
	}
	public void setModel(String in) {
		this.model=in;
	}
	
	public String getColor() {
		return this.color;
	}
	public double getSpeed() {
		return this.speed;
	}
	public String getSC() {
		return this.sc;
	}
	public String getModel() {
		return this.model;
	}
	
	public void print() {

	}
	
	public void time() {
		
	}
}
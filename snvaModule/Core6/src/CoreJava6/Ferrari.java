package CoreJava6;

public class Ferrari extends Car{
	public Ferrari() {
		super("Red",120,"Sports","Ferrari");
	}
	public void features() {
		this.setColor("RED");
		this.setSpeed(120);
		this.setSC("Coupe");
		this.setModel("Ferrari");
	}
	public void print(){
		System.out.println("This car is a Ferrari.");
		System.out.println("Color: "+ this.getColor());
		System.out.println("Top speed:" + this.getSpeed());
		System.out.println("Type: "+this.getSC());
		System.out.println("Model: " +this.getModel());
	}
	
	public void time(double distance) {
		System.out.println("It would take "+ distance/this.getSpeed() + " hours to travel " + distance + " miles");
		
	}
	public void setColor(String newColor) {
		super.setColor(newColor);
		System.out.println("The ferrari has been repainted to be " + newColor);
		
	}
}

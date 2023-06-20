package CoreJava6;

public class Apple extends Fruit {
	
	public Apple(int w, String c) {
		super(w,c);
	}
	public void color() {
		this.setColor("red");
	}
	public void avgweight() {
		this.setWeight(80);
	}

}

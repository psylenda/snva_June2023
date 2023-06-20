package CoreJava6;

public class Mango extends Fruit {
	public Mango(int w, String c) {
		super(w,c);
	}
	public void color() {
		this.setColor("Yellow");
	}
	public void avgweight() {
		this.setWeight(100);
	}
}

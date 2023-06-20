package CoreJava6;

public class fruitMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit fruit = new Fruit();
		Apple apple = new Apple(80, "red");
		Mango mango = new Mango(100, "yellow");
		
		mango.color();
		apple.color();
		mango.avgweight();
		apple.avgweight();
		
		System.out.println(mango.getWeight());
		System.out.println(mango.getColor());
		System.out.println(apple.getWeight());
		System.out.println(apple.getColor());
		
	}

}

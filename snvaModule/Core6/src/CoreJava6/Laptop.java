package CoreJava6;

public class Laptop extends Item{
	public Laptop(int input){
		switch (input) {
		case 1:
			super.setName("Macbook Pro");
			super.setPrice(1975.99);
			break;
		case 2:
			super.setName("Alienware");
			super.setPrice(1500);
			break;
		}
	}
	
}

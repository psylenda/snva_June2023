package CoreJava6;

public class Accessories extends Item{
	public Accessories(int input) {
		switch (input) {
		case 1:
			super.setName("Mousepad");
			super.setPrice(14.50);
			break;
		case 2:
			super.setName("Cleaner");
			super.setPrice(29.99);
			break;
		case 3:
			super.setName("Headphones");
			super.setPrice(31.95);
			break;
		}
	}
}

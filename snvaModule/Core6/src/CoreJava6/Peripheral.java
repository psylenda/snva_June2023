package CoreJava6;

public class Peripheral extends Item{
	public Peripheral(int input){
		switch (input) {
		case 1:
			super.setName("External Mouse");
			super.setPrice(30.99);
			break;
		case 2:
			super.setName("LAN Cable");
			super.setPrice(10.99);
			break;
		case 3:
			super.setName("Keyboard");
			super.setPrice(90.99);
			break;
		}
	}
}

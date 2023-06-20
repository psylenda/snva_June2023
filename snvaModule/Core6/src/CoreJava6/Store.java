package CoreJava6;
import java.util.Scanner;
public class Store {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Register register = new Register();
		
		boolean running = true;
		while (running == true) {
			
			System.out.println("Hello! Thank you for shopping with SNVA Electronics.");
			System.out.println("PRODUCTS FOR SALE");
			System.out.println("=================");
			System.out.println("[1] Laptops");
			System.out.println("[2] Peripherals");
			System.out.println("[3] Accessories");
			System.out.println("=================");
			System.out.println("Please choose");
			int choice = scanner.nextInt();
			
			switch (choice) {
			case (1):
				System.out.println("LAPTOPS:");
				System.out.println("========");
				System.out.println("1.Macbook Pro $1975.99");
				System.out.println("2.Alienware $1500.00");
				System.out.println("Please choose");
				break;
				
			case (2):
				System.out.println("PERIPHERALS");
				System.out.println("============");
				System.out.println("1.External mouse $30.99");
				System.out.println("2.LAN Cable $10.99");
				System.out.println("3.Keyboard $90.99");
				System.out.println("Please choose");
				break;
			case (3):
				System.out.println("ACCESSORIES");
				System.out.println("===========");
				System.out.println("1.Mousepad 14.50");
				System.out.println("2.Cleaner $29.99");
				System.out.println("3.Headphones $31.95");
				System.out.println("Please choose");
				break;
			}
			int choice2 = scanner.nextInt();
			register.purchase(choice, choice2); 
			
			System.out.println("Would you like to purchase anything else? [1] yes [2] no");
			int choice3 = scanner.nextInt();
			if (choice3 == 2) {
				register.printReceipt();
				running = false;
				register.clearReceipt();
			}
			else {
				running = true;
			}
		}
		
		
		
		scanner.close();
	}

}

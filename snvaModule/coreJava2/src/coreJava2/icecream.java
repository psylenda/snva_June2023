package coreJava2;
import java.util.Scanner;

public class icecream {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hello, what is your Name?");
		String name = scanner.nextLine();
		System.out.println("Hello, "+name+"! How are you today?");
		String howToday = scanner.nextLine();
		String receipt = "=======================================================\nSL No.    "
				+ "Flavor      Quantity      Price      Total\n\n";
		System.out.println("Would you like [1] Scoops or [2] Exquisite?");
		int option = scanner.nextInt();
		
		if (option ==1) {
			System.out.println("      ICE CREAM SHOP    ");
			System.out.println("==========================");
			System.out.println("1. Chocolate    $8");
			System.out.println("2. Mango        $11");
			System.out.println("3. Vanilla      $10");
			System.out.println("4. Mint         $9");
			System.out.println("5. Strawberry   $4");
			System.out.println("==========================");
		}
		else {
			System.out.println("      ICE CREAM SHOP(ex) ");
			System.out.println("==========================");
			System.out.println("6. Sundae       $7");
			System.out.println("7. Banana Split $12");
			System.out.println("8. Dilly Bar    $2");
			System.out.println("9. Choco Taco   $3");
			System.out.println("10.Smoothie     $13");
			System.out.println("==========================");
		}

		
		
		boolean ordering = true;
		int total = 0;
		int currentSelect = 1;
		int cQ = 0;
		int manQ = 0;
		int vQ = 0;
		int mintQ = 0;
		int sQ = 0;
		int sunQ = 0;
		int bsQ = 0;
		int dbQ = 0;
		int ctQ = 0;
		int smQ = 0;
		
		do {
			
			System.out.println("What would you like to order?");
			currentSelect = scanner.nextInt();
			System.out.println("And how many would you like?");
			int q = scanner.nextInt();
			int quantity = q;
			
			if (option == 1) {
				switch(currentSelect) {
				case 1: 
					total += (8*quantity); 
					cQ += quantity;
					receipt += "1         Chocolate   "+quantity+"             $8         "+ quantity * 8 + "     \n"; 
					break;
				case 2: 
					total += (11*quantity);
					manQ += quantity;
					receipt += "2         Mango       "+quantity+"             $11        "+ quantity * 11 + "   \n"; 
					break;
				case 3: 
					total += (10*quantity);
					receipt += "3         Vanilla     "+quantity+"             $10        "+ quantity * 10 + "   \n"; 
					vQ += quantity;
					break;
				case 4: 
					total += (9*quantity);
					receipt += "4         Mint        "+quantity+"             $9         "+ quantity * 9 + "     \n"; 
					mintQ += quantity;
					break;
				case 5: 
					total += (4*quantity);
					receipt += "5         Strawberry  "+quantity+"             $4         "+ quantity * 4 + "     \n"; 
					sQ += quantity;
					break;
				}
				
			}
			else {
				switch(currentSelect) {
				case 6: 
					total += (7*quantity);
					sunQ += quantity;
					receipt += "6         Sundae      "+quantity+"             $7         "+ quantity * 7 + "    \n";
					break;
				case 7:
					total += (12*quantity);
					bsQ += quantity;
					receipt += "7         Banana Split"+quantity+"             $12        "+ quantity * 12 + "   \n";
					break;
				case 8:
					total += (2*quantity);
					dbQ += quantity;
					receipt += "8         Dilly Bar   "+quantity+"             $2         "+ quantity * 2 + "    \n";
					break;
				case 9:
					total += (3*quantity);
					ctQ += quantity;
					receipt += "9         Choco Taco  "+quantity+"             $3         "+ quantity * 3 + "    \n";
					break;
				case 10:
					total += (13*quantity);
					smQ += quantity;
					receipt += "10        Smoothie    "+quantity+"             $10        "+ quantity * 13 + "   \n";
					break;
				}

			}
			System.out.println("===========================");
			System.out.println("----------ORDERS-----------");
			System.out.println("===========================");
			System.out.println(receipt);
			System.out.println("=======================================================");
			System.out.println("TOTAL :   $"+total);
			System.out.println("Would you like to order anything else? [1] yes [2] no");
			
			int customerInput = scanner.nextInt();
			if (customerInput == 1) {
				ordering = true;
				System.out.println("Exquisite (2) or Regular? (1)");
				option = scanner.nextInt();
				if (option ==1) {
					System.out.println("      ICE CREAM SHOP    ");
					System.out.println("==========================");
					System.out.println("1. Chocolate    $8");
					System.out.println("2. Mango        $11");
					System.out.println("3. Vanilla      $10");
					System.out.println("4. Mint         $9");
					System.out.println("5. Strawberry   $4");
					System.out.println("==========================");
				}
				else {
					System.out.println("      ICE CREAM SHOP(ex) ");
					System.out.println("==========================");
					System.out.println("6. Sundae       $7");
					System.out.println("7. Banana Split $12");
					System.out.println("8. Dilly Bar    $2");
					System.out.println("9. Choco Taco   $3");
					System.out.println("10.Smoothie     $13");
					System.out.println("==========================");
				}
				
			}
			else {
				ordering = false;
			}
		} while(ordering == true);
		System.out.println("===========================");
		System.out.println("----------RECEIPT----------");
		System.out.println("===========================");
		System.out.println(receipt);
		System.out.println("===========================");
		System.out.println("your order comes out to $"+total);
		 
		scanner.close();
	}
}

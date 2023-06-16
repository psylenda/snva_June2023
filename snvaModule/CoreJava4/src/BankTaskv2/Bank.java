package BankTaskv2;

import java.util.Scanner;

public class Bank {
	public static void main(String[] args){
		String accountIDs[] = {"A", "AB1002", "AB1003", "AB1004"};
		String passwords[] = {"water", "fire", "pepper", "salt"};
		int[] balances = {30000, 123455, 111, 7};
		Scanner scanner = new Scanner(System.in);
		int run = 1;
		
		while (run == 1) {
			System.out.println("Welcome to SNVA Banking Online. Please enter your id to continue: ");
			String idInput = scanner.nextLine();
			boolean idFound = false;
			int indexofFoundID= 0;
			for (int i = 0; i < accountIDs.length; i++) {
				if (accountIDs[i].equals(idInput)) {
					indexofFoundID = i;
					idFound = true;
				}
			}
			
			System.out.println(idFound);
			if (idFound == false) {
				System.out.println("Sorry, couldn't find your id in the system.");
			}
			else {
				DisplayBalance patron = new DisplayBalance();
				patron.setBalance(balances[indexofFoundID]);
				patron.setUser(accountIDs[indexofFoundID]);
				patron.setPassword(passwords[indexofFoundID]);
				
				System.out.println("Please enter password:");
				String passwordInput = scanner.nextLine();
				if (patron.authenticator(passwordInput)==true) {
					System.out.println("Would you like to view your balance? [1] yes [2] no");
					int response = scanner.nextInt();
					if (response == 1) {
						patron.display();
					}
				}
				else {
					System.out.println("Sorry, incorrect password.");
				}
			}
			
			
			System.out.println("Would you like to do anything else? [1] yes [2] no");
			run = scanner.nextInt();
			scanner.nextLine();
			if (run == 2) {
				System.out.println("Thank you for banking with us. Have a great day.");
			}
		}
		scanner.close(); 
	}
	
}

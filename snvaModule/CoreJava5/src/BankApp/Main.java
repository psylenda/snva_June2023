package BankApp;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean running = true;
		
		Personal first = new Personal();
		Business second = new Business();
		
		while (running == true) {
			System.out.println("Welcome to the bank. Do you have a personal or business account? [1] or [2]");
			int input1 = scanner.nextInt();
			scanner.nextLine();
			System.out.println("What is your name?");
			String input2 = scanner.nextLine();
			
			System.out.println("And the password?");
			String input3 = scanner.nextLine();
			
			int index = 0;
			if (input1 ==1) {
				if (first.idFind(input2)) {
					index = first.idGet(input2);
					first.printBalance(first.login(index, input3),index);

				}
				else {
					System.out.println("ID not found");
				}
				
			}
			else {
				if (second.idFind(input2)){
					index = second.idGet(input2);
					second.printBalance(second.login(index, input3),index);
				}
				else {
					System.out.println("ID not found");
				}
				
			}
			
			
			System.out.println("Would you like to do anything else? [1]yes or [2]no");
			int input4 = scanner.nextInt();
			scanner.nextLine();
			if (input4 == 1) {
				running = true;
			}
			else {
				running = false;
			}
		}
		scanner.close();
		
	}
}

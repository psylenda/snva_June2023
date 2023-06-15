package coreJava2;
import java.util.Scanner;

public class ForLoop2 {
	public static void main(String[] args) {
			
		
		Scanner scanner = new Scanner(System.in);
		for(;;) {
			System.out.println("Enter y/n");
			char input = scanner.next().charAt(0);
			if (input == 'y') {
				System.out.println("Java is Easy to Learn");
			}
			else{
				break;
			}
		}
		scanner.close();
	}
}

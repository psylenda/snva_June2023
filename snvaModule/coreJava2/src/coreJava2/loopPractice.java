package coreJava2;
import java.util.Scanner;
public class loopPractice {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter age you started coding: ");
		int age = scanner.nextInt();
		int i = 0;
		while (i < age) {
			System.out.println(i+1);
			i++;
		}
		i = 0;
		while (i < age) {
			if ((i+1) % 2 == 0) {
				System.out.println(i+1);
			}
			i++;
		}
		
		System.out.println("Please enter two numbers:");
		int numOne = scanner.nextInt();
		int numTwo = scanner.nextInt();
		
		int x = numOne;
		int y = numTwo;
		
		while (x<y) {
			x++;
			y--;
		}
		System.out.println(x);
		
		scanner.close();
	}
}

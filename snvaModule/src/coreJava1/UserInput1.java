package coreJava1;
import java.util.Scanner;

public class UserInput1{
	public static void main(String[] args) {
		
		
		Scanner myObj = new Scanner(System.in);



		
		System.out.println("input side 1: ");
		int sideOne = myObj.nextInt();
		System.out.println("input side 2: ");
		int sideTwo = myObj.nextInt();
		System.out.println("input side 3: ");
		int sideThree = myObj.nextInt();
		
		if (sideOne == sideTwo && sideOne == sideThree) {
			System.out.println("The triangle is equilateral");
		}
		else if (sideOne == sideTwo || sideTwo == sideThree || sideThree == sideOne) {
			System.out.println("The Triangle is isoceles");
		}
		else {
			System.out.println("The triangle is scalene.");
		}
		myObj.close();

	}
}
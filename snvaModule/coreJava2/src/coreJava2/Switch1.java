package coreJava2;

import java.util.Scanner;

public class Switch1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Mont \n1.Jan\n2.Feb\n..\n12.Dec");
		int month = scanner.nextInt();
		String season = "";
		switch(month) {
		case 1: 
			season = "Winter";
		case 2:
			season = "Winter";
		case 3:
			season = "Spring";
		case 4:
			season = "Spring";
		case 5:
			season = "Spring";
		case 6:
			season = "Summer";
		case 7:
			season = "Summer";
		case 8:
			season = "Summer";
		case 9:
			season = "Fall";
		case 10:
			season = "Fall";
		case 11:
			season = "Fall";
		case 12:
			season = "Winter";
			break;
		}
		System.out.println("The month is "+ month + " and the season is " + season + ".");
		scanner.close();
	}
}
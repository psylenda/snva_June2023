package coreJava2;
import java.util.Scanner;
public class selector{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter topic (JS, Java, RDMBS: ");
		String input = scanner.next();
		String topic = input;
		String input2 = "";
		String subtopic = "";
		switch(input) {
		case "JS": 
			System.out.println("Enter subtopic (JS Varaible, ES6, Promise: ");
			input2 = scanner.next();
			switch(input2) {
			case "JS Variable":
				subtopic = "JS Variable";
				break;
			case "ES6":
				subtopic = "ES6";
				break;
			case "Promise":
				subtopic = "Promise";
				break;
			}
			break;
		case "Java": 
			System.out.println("Enter subtopic (Core Java, multithreading, swing: ");
			input2 = scanner.next();
			switch(input2) {
			case "Core Java":
				subtopic = "Core Java";
				break;
			case "multithreading":
				subtopic = "multithreading";
				break;
			case "swing":
				subtopic = "swing";
				break;
			}
			break;
		case "RDBMS": 
			System.out.println("Enter subtopic (SQL, oracle, mysql: ");
			input2 = scanner.next();
			switch(input2) {
			case "SQL":
				subtopic = "SQL";
				break;
			case "oracle":
				subtopic = "oracle";
				break;
			case "mysql":
				subtopic = "mysql";
				break;
			}
			break;
		}
		System.out.println("Your topic is " + topic + " and your subtopic is " + subtopic + ".");
		scanner.close();
	}

}

package coreJava2;
import java.util.Scanner;
public class Switch2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter char");
		char input = scanner.next().charAt(0);
		String cStatus = "";
		String v = "vowel";
		String c = "consonant";
		switch(input) {
		case 'a': 
			cStatus = v;
			break;
		case 'A':
			cStatus = v;
			break;
		case 'e':
			cStatus = v;
			break;
		case 'E':
			cStatus = v;
			break;
		case 'i':
			cStatus = v;
			break;
		case 'I':
			cStatus = v;
			break;
		case 'o':
			cStatus = v;
			break;
		case 'O':
			cStatus = v;
			break;
		case 'u':
			cStatus = v;
			break;
		case 'U':
			cStatus = v;
			break;
		default:
			cStatus = c;
		}
		System.out.println("Your character is a " + cStatus + ".");
		scanner.close();
	}

}
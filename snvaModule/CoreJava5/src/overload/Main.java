package overload;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter number");
		int input1 = scanner.nextInt();
		System.out.println("please enter second number:");
		int input2 = scanner.nextInt();
		Overload first = new Overload();
		OverloadSub second = new OverloadSub();
		
		System.out.println(second.sum(input1,input2));
		System.out.println(first.sum(input1));
		
		
		scanner.close();
		
	}
}

package StaticDemo;

public class StaticDemo {
	static int num1 = 1;
	static int num2 = 2;
	
	static void displayNum1(){
		System.out.println(num1);
	}
	static {
		System.out.println("From static block");
		System.out.println("ProducT: " + (num1*num2));
	}
}

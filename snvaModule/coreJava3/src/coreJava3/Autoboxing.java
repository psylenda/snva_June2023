package coreJava3;

public class Autoboxing {
	public static void main(String[] args) {
		long long1 = 82222;
		double double1 =020202;
		
		/*
		 *
		 *
		 *int: 1
float autoboxing: .333
boolean autoboxing: true
int unboxing: 4
float unboxing: .333
boolean unboxing: true
		 */
		
		//autoboxing
		Long longwrap = long1;
		Double doublewrap = double1;
		System.out.println(longwrap + " " + doublewrap);
		
		//Auto unboxing
		long long2 = longwrap;
		double double2 = doublewrap;
		System.out.println(long2 + " " + double2);
		
		
		Integer num = 12;
		int num1 = num;
				
		Float num2 = .333f;
		Boolean autobool = true;
		num = num1;
		float unboxfloat = num1;
		boolean unboxbool = autobool;
		
		
		
		System.out.println("Int Autoboxing: ");
		System.out.println("float autoboxing");
		System.out.println("boolean autoboxing");
		System.out.println("int unboxing");
		System.out.println("float unboxing");
		System.out.println("boolean unboxing:");
	}
}

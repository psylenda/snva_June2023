package coreJava3;

public class Declare {
	
	int num1,num2,num3;
	public Declare(){
		num1 = 3;
		num2 = 4;
		num3 = 5;
	}
	public int sum() {
		return this.num1+this.num2+this.num3;
	}
	public void product(int first, int second, int third) {
		System.out.println("The product is " + first*second*third);
	}
	
}

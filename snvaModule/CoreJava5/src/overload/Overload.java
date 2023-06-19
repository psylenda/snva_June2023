package overload;

public class Overload {
	int num1 = 10, num2 = 30;
	
	void sum() {
		int sum = num1+num2;
	}
	int sum(int param) {
		int sum = num1+num2+param;
		return sum;
	}
}

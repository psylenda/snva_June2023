package BankApp;

public class Personal extends Account{
	public Personal(){
		String[] input1 = {"Jon","Dave","Emily"};
		String[] input2 = {"skip","trace","void"};
		int[] input3 = {390,1300,3};
		String[]input4 = {"California","Redmond","Taipei"};
		this.setName(input1);
		this.setPassword(input2);
		this.setBalance(input3);
		this.setAddress(input4);
	}

	void printBalance(boolean result, int index){
		if (result == false) {
			System.out.println("Sorry, login failed.");
		}
		else {
			System.out.println("The balance for your personal account is: "+ this.getBalance(index));
		}
	}
}

package BankApp;

public class Business extends Account{
	Business(){
		String[] input1 = {"disney","microsoft","TSMC"};
		String[] input2 = {"mickey","windows","semiconduct"};
		int[] input3 = {39000,13000,32000};
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
			System.out.println("The balance for your business is: "+ this.getBalance(index));
		}
	}
}

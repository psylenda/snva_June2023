package core4;

public class BankApp {
	String accountID;
	String password;
	int balance;
	
	public BankApp(){
		accountID = "";
		password = "";
		balance = 0;
	}
	public BankApp(String idInput, String passwordInput, int balanceInput){
		accountID = idInput;
		password = passwordInput;
		balance = balanceInput;
	}
	
	
	public boolean login(String passwordInput) {
		if (passwordInput.equals(this.password)) { 
			return true;
		}
		else {
			return false;
		}
	}
	public void printBalance() {
		System.out.println("Your balance is $" + this.balance);
	}
}

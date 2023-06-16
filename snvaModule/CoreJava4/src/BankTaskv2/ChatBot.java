package BankTaskv2;

public class ChatBot {
	private String user;
	private String password;
	private int balance;
	
	ChatBot(){
		this.setBalance(0);
		this.setUser("");
		this.setPassword("");
	}
	ChatBot(String userInput, String passInput, int balanceInput){
		this.setBalance(balanceInput);
		this.setUser(userInput);
		this.setPassword(passInput);
	}
	
	public void setBalance(int input) {
		this.balance = input;
	}
	public void setUser(String input) {
		this.user = input;
	}
	public void setPassword(String input) {
		this.password = input;
	}
	public int getBalance() {
		return this.balance;
	}
	public String getPassword() {
		return this.password;
	}
	public String getUser() {
		return this.user;
	}
	
}

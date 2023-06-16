package BankTaskv2;

public class Authenticate extends ChatBot {
	public boolean authenticator(String input) {
		if (input.equals(this.getPassword())) {
			return true;
		}
		else return false;
	}
}

package BankTaskv3;

public class DisplayBalance extends Authenticate {
	public void display() {
		System.out.println("Your balance is "+this.getBalance());
	}
}

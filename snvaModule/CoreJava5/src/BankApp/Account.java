package BankApp;

public class Account {
	private String[] name;
	private String[] password;
	private String[] address;
	private int[] balance;
	
	public String getName(int index) {
		return this.name[index];
	}
	public String getAddress(int index) {
		return this.address[index];
	}
	public int getBalance(int index) {
		return this.balance[index];
	}
	public String getPassword(int index) {
		return this.password[index];
	}
	public void setName(String[] input) {
		this.name = input;
	}
	public void setPassword(String[] input) {
		this.password = input;
	}
	public void setAddress(String[] input) {
		this.address = input;
	}
	public void setBalance(int[] input) {
		this.balance = input;
	}
	
	public boolean login(int index, String input) {
		//System.out.print(password[index]);
		//System.out.println(input);
		if (password[index].equals(input)) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean idFind(String input) {
		boolean rVal = false;
		for (String entry: name) {
			if (entry.equals(input)) {
				rVal = true;
			}
		}
		return rVal;
	}
	public int idGet(String input) {
		int returnValue = 0;
		int index = 0;
		for (String entry: name) {
			if (entry.equals(input)) {
				returnValue = index;
			}
			index++;
		}
		return returnValue;
	}
}


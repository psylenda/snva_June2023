package BankTaskv3;

public class address extends DisplayBalance {
	private String name;
	private int door;
	private int street;
	private String city;
	private int zip;
	private int mobile;
	private int tele;
	
	public address() {
		this.name = "Jon";
		this.door = 2355;
		this.street = 990;
		this.city = "Seattle";
		this.zip = 98111;
		this.mobile = 4568000;
		this.tele = 6788900;
	}
	public address(String idInput, String passInput, int balanceInput, String nInput, int doorInput, int streetInput, String cityInput, int zipInput, int mobileInput, int teleInput) {
		setUser(idInput);
		setPassword(passInput);
		setBalance(balanceInput);
		this.name = nInput;
		this.door = doorInput;
		this.street = streetInput;
		this.city = cityInput;
		this.zip = zipInput;
		this.mobile = mobileInput;
		this.tele = teleInput;
		
	}
	public void display() {
		System.out.println("Your balance is : " + this.getBalance());
		System.out.println("========================="); //25
		System.out.printf("%-10s %15s%n","NAME:", this.name);
		System.out.printf("%-10s %15d%n", "DOOR:",this.door);
		System.out.printf("%-10s %15d%n", "STREET:",this.street);
		System.out.printf("%-10s %15s%n", "CITY:",this.city);
		System.out.printf("%-10s %15d%n", "ZIP CODE:",this.zip);
		System.out.printf("%-10s %15d%n", "MOBILE:",this.mobile);
		System.out.printf("%-10s %15d%n", "TELEPHONE:",this.tele);
		System.out.println("=========================");
	}
	
	public void setName(String in) {
		this.name = in;
	}
	
	
	
	
}

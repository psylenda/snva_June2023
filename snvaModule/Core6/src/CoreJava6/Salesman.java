package CoreJava6;

public class Salesman extends Dealer{
	private String name;
	private int carsSoldToday;
	private int carsSoldMonth;
	private String[] models = {"Model Y", "Civic", "GX470", "Forerunner"};
	private int[] sales = {0,0,0,0};
	
	Salesman(String input){
		this.name = input;
	}
	public void sellCar(int numSold, int modelIndex) {
		monthlySales += numSold;
		soldToday += numSold;
		
		carsSoldToday += numSold;
		sales[modelIndex] += numSold;
	}
	
	public int getSalesToday() {
		return carsSoldToday;
	}
	public int getSalesMonth() {
		return carsSoldMonth;
	}
	public void displayIndividual() {
		System.out.println(name + " sold:");
		System.out.println(sales[0] + " Model Ys");
		System.out.println(sales[1] + " Civics");
		System.out.println(sales[2] + " GX470s");
		System.out.println(sales[3] + " Forerunners");
		System.out.println("Their total for today is " + this.getSalesToday() + " sold");
		System.out.println("And their total for the month is " + this.getSalesMonth() + " sold");
	}
	
}

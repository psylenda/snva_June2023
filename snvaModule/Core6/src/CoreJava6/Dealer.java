package CoreJava6;

public class Dealer {
	static int monthlySales = 0;
	static int soldToday = 0;
	public Dealer(){
		
	}
	final public void display() {
		System.out.print(soldToday + " cars were sold today. " + monthlySales +" cars have been sold this month.");
	}
}

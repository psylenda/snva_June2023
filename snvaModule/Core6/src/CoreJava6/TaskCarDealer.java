package CoreJava6;

public class TaskCarDealer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dealer lynnwoodDealer = new Dealer();
		Salesman Robbie = new Salesman("Robbie");
		Salesman Janice = new Salesman("Janice");
		Salesman Moody = new Salesman("Moody");
		
		Robbie.sellCar(4, 0);
		Janice.sellCar(5, 3);
		Moody.sellCar(10, 1);
		Janice.sellCar(6, 2);
		
		Robbie.displayIndividual();
		Janice.displayIndividual();
		Moody.displayIndividual();
		
		lynnwoodDealer.display();
		
		
	}

}

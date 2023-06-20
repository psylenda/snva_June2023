package CoreJava6;
import java.util.ArrayList;

public class Register {
	private String receipt;
	private double total;
	private String endNote;
	private ArrayList<String> items = new ArrayList<String>();
	private ArrayList<Double> costs = new ArrayList<Double>();
	private ArrayList<Item> itemized = new ArrayList<Item>();
	
	Register(){
		receipt = "RECEIPT \n ========";
		endNote = "";
	}
	
	public void calculateTotal() {
		for(Item each : itemized) {
			this.total += each.getPrice();
		}
		if (this.total == 500) {
			endNote += "\n Balance exhausted. No cost";
		}
		else if (this.total > 500) {
			this.total -= 500;
			endNote += "\n 500 deducted from final price.";
		}
		
		
	}
	public void printReceipt() {
		this.calculateTotal();
		System.out.println(receipt);
		for (int i = 0; i < itemized.size(); i++) {
			//System.out.printf("%-3d %-10s $%10.2f %n", itemized.get(i).getName(),itemized.get(i).getPrice());
			System.out.println(itemized.get(i).getName() + "    " + itemized.get(i).getPrice());
		}
		System.out.printf("TOTAL: $%.2f %n",total);
		System.out.println(endNote);
	}
	public void AddItem(String input, double cost) {
		items.add(input);
		costs.add(cost);
	}
	public void clearReceipt() {
		itemized.clear();
	}
	
	public void purchase(int input1, int input2) {
		//System.out.println(input1);
		//System.out.println(input2);
		switch (input1) {
		case 1:
			itemized.add(new Laptop(input2));
			break;
		case 2:
			itemized.add(new Peripheral(input2));
			break;
		case 3:
			itemized.add(new Accessories(input2));
			break;
		default:
			System.out.println("ERROR, you chose out of range.");
			break;
		}
	}
}

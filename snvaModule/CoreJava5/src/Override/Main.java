package Override;

public class Main {
	public static void main(String[]args) {
		Override first = new Override();
		OverrideSub second = new OverrideSub();
		
		System.out.println(first.sum(1, 2));
		System.out.println(second.sum(1, 2));
	}
}

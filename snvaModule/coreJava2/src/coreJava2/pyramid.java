package coreJava2;

public class pyramid {
	public static void main(String args[]) {
		for (int i = 10; i >0; i--) {
			String output = "";
			for (int j = 0; j < i; j++){
				output += "%";
			}
			System.out.println(output);
		}
	}
}

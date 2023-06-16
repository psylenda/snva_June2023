package coreJava3;

public class foreach {
	public static void main(String[] args) {
		float marks[] = {99,100,80,67,99};
		float sum = 0;
		for (float ctr : marks) {
			System.out.println(ctr);
			sum += ctr;
		}System.out.println("Total Marks :" + sum);
	}
}

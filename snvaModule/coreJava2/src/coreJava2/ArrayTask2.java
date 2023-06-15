package coreJava2;
import java.util.Scanner;
public class ArrayTask2 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String[] sInfo = new String[4];
		int[] marks = new int[6];
		
		
		System.out.println("Please enter student Name");
		sInfo[0] = scanner.nextLine();
		System.out.println("Please enter student id");
		sInfo[1] = scanner.nextLine();
		System.out.println("Please enter branch");
		sInfo[2] = scanner.nextLine();
		System.out.println("Please enter semester");
		sInfo[3] = scanner.nextLine();
		
		String[] subjects = new String[6];
		subjects[0] = "Java";
		subjects[1] = "Python";
		subjects[2] = "Web";
		subjects[3] = "C";
		subjects[4] = "CPP";
		subjects[5] = "Springboot";
		System.out.println("Enter grade for Java");
		marks[0] = scanner.nextInt();
		System.out.println("Enter grade for Python");
		marks[1] = scanner.nextInt();
		System.out.println("Enter grade for Web");
		marks[2] = scanner.nextInt();
		System.out.println("Enter grade for C");
		marks[3] = scanner.nextInt();
		System.out.println("Enter grade for CPP");
		marks[4] = scanner.nextInt();
		System.out.println("Enter grade for Springboot");
		marks[5] = scanner.nextInt();
		
		
		int total = 0;
		for (int i = 0; i < 6; i++) {
			total+=marks[i];
		}
		double average = total/6;
		
		System.out.println("=====================================================================================");
		System.out.println("CIT REPORT CARD");
		System.out.println("=====================================================================================");
		System.out.println(sInfo[0] + "         " + sInfo[1]+ "       " + sInfo[2] + "      " + sInfo[3]+"       ");
		System.out.println("=====================================================================================\n");
		for (int i =0; i<6;i++) {
			System.out.println(i + "  " + subjects[i] + "    " +marks[i] + "\n");
		}
		System.out.println("=====================================================================================");
		System.out.print("Total: "+ total +    "      Average: " + average + "         Grade: ");
		if(average >= 90 ) {
			System.out.println("A++");
		}
		else if (average < 90 && average >=80) {
			System.out.println("A+");
		}
		else if (average <80 && average >= 70) {
			System.out.println("B++");
		}
		else if (average <70 && average >= 60) {
			System.out.println("B+");
		}
		else if (average <60 && average >= 50) {
			System.out.println("C");
		}
		else {
			System.out.println("E");
		}
		
		System.out.println("=====================================================================================");
		
	}

}

package app.e73;

import java.util.Scanner;

public class Ep73 {
	
	public Ep73() {
		// Reading input user challenge
		System.out.println("Episod 73");
		
		Scanner scanner = new Scanner(System.in);
		
		int counter = 1;
		//int sum = 0;
		double sum = 0; // change to double
		
		while(counter <= 5) {
			System.out.println("Eneter number #" + counter + ":");
			String nexNumber = scanner.nextLine();
			try {
				//int number = Integer.parseInt(nexNumber);
				double number = Double.parseDouble(nexNumber);
				counter++;
				sum += number;
			} catch(NumberFormatException nfe) {
				System.out.println("Invalid number!");
			}
		}
		
		System.out.println("The sum of the 5 numbers = "  + sum);
	}

}

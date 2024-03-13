package app.challenge;

import java.util.Scanner;

public class InputCalculator {

	public InputCalculator() {
		System.out.println("Run InputCalculator");
		inputThenPrintSumAndAverage();
		System.out.println("Quit InputCalculator");
	}

	public void inputThenPrintSumAndAverage() {
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		long avg = 0;
		int sum = 0;
		
		while(true) {
			boolean hasNextInt = scanner.hasNextInt();
			if(!hasNextInt) {
				// break the loop invalid input
				break;
			}
			sum += scanner.nextInt();
			count++;
			// clear buffer remove line separator
			scanner.nextLine();
		}
		if(count > 0) {
			avg = Math.round((double) sum / count);
		}
		System.out.println("Sum = " + sum + " Avg = " + avg);
		scanner.close();
	}
}

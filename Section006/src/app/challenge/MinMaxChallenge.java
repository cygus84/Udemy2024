package app.challenge;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class MinMaxChallenge {

	public MinMaxChallenge() {

		Scanner scanner = new Scanner(System.in);

		int max = 0;
		int min = 0;
		int loopCounter = 0;

		while(true){
			System.out.println("Eneter a number, or any charakter to exit:");
			String nextEnter = scanner.nextLine();
			try {
				int validNum = Integer.parseInt(nextEnter);
				if(loopCounter == 0 || validNum < min) {
					min = validNum;
				}
				if(loopCounter == 0 || validNum > max) {
					max = validNum;
				}
				loopCounter++;
			} catch(NumberFormatException nfe) {
				break;
			}
		}
		
		if(loopCounter > 0) {
			System.out.println("min = " + min + "max = " + max);
		} else {
			System.out.println("No valid data enetered");
		}
	}
}

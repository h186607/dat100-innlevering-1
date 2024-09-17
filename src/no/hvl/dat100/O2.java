package no.hvl.dat100;

import java.util.Scanner;

public class O2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int antallStudenter = 10;
		
		for (int i = 0; i < antallStudenter; i++) {

			int poengSum;

			do {
				System.out.print("Poengsum oppnådd: ");
				poengSum = (input.nextInt());

				if (poengSum < 0 || poengSum > 100) {
					System.out.println("Ugyldig poengsum, prøv igjen.");
				}
			} while (poengSum < 0 || poengSum > 100);

			if (poengSum < 40) {
				System.out.println("F");
			} else if (poengSum < 50) {
				System.out.println("E");
			} else if (poengSum < 60) {
				System.out.println("D");
			} else if (poengSum < 80) {
				System.out.println("C");
			} else if (poengSum < 90) {
				System.out.println("B");
			} else if (poengSum <= 100) {
				System.out.println("A");
			}
		}
	}
}

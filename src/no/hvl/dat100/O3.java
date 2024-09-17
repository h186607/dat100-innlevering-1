package no.hvl.dat100;

import java.util.Scanner;

public class O3 {

	public static void main(String[] args) {
		long sum = fakultet(lesInput());
		System.out.println("N fakultet av oppgitt tall er: " + sum);
	}

	private static int lesInput() {
		Scanner input = new Scanner(System.in);
		System.out.println("Oppgi et positivt tall, som vil gi tilbake n fakultet av tallet:");
		int n = input.nextInt();
		input.close();
		
		if (n < 0) {
			System.out.println("Ugyldig tall, tallet må være positivt.");
			System.exit(1);			
		}
		
		return n;
	}

	private static long fakultet(int n) {
		if (n <= 1) {
			return 1;
		}	
	
		long sum = 1;
		for (int i = 1; i <= n; i++ ) {
			sum *= i;		
		}
		
		return sum;
	}
}

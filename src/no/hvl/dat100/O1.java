package no.hvl.dat100;

import java.util.Scanner;

public class O1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Skriv inn brutto årslønn:");
		double aarsLonn = input.nextDouble();

		double skattTotal = 0;
		skattTotal += kalkulerSkatt(aarsLonn, 208_051, 292_850, 0.017);
		skattTotal += kalkulerSkatt(aarsLonn, 292_851, 670_000, 0.04);
		skattTotal += kalkulerSkatt(aarsLonn, 670_001, 937_900, 0.136);
		skattTotal += kalkulerSkatt(aarsLonn, 937_901, 1_350_000, 0.166);
		skattTotal += kalkulerSkatt(aarsLonn, 1_350_001, -1, 0.176);

		System.out.println("Din trinnskatt er: " + Math.round(skattTotal) + " kroner.");
	}

	private static double kalkulerSkatt(double lonn, double trinnStart, double trinnSlutt, double skatteProsent) {
		if (lonn < trinnStart) {
			return 0;
		}

		double trinnLonn = lonn;

		// Trekk fra trinnStart
		trinnLonn = trinnLonn - trinnStart;

		// Trekk fra trinnSlutt viss lønn er større enn trinnSlutt, eller det ikke er en trinnslutt.
		if (lonn > trinnSlutt && trinnSlutt != -1) {
			trinnLonn = trinnLonn - (lonn - trinnSlutt);
		}
		
		double trinnSkatt = trinnLonn * skatteProsent;
		
		return trinnSkatt;
	}
}

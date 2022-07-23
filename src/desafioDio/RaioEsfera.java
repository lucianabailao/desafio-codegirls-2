package desafioDio;

import java.util.Scanner;

public class RaioEsfera {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float R = sc.nextFloat();
		double pi = 3.14159;

		double volume = (4 / 3.0) * pi * (Math.pow(R, 3.0));
		System.out.printf("VOLUME = %.3f%n", +volume);
		sc.close();
	}

}

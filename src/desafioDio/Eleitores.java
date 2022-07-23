package desafioDio;

import java.util.Scanner;

public class Eleitores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int eleitores, brancos, nulos, validos;
		eleitores = sc.nextInt();
		brancos = sc.nextInt();
		nulos = sc.nextInt();
		validos = sc.nextInt();

		int pBrancos = (brancos * 100) / eleitores;
		int pNulos = (nulos * 100) / eleitores;
		int pValidos = (validos * 100) / eleitores;

		System.out.println("Brancos: " + pBrancos + "%");

		System.out.println("Nulos: " + pNulos + "%");

		System.out.println("Validos: " + pValidos + "%");
		sc.close();
	}

}

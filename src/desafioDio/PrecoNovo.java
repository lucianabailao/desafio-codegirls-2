package desafioDio;

import java.util.Scanner;

public class PrecoNovo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int desconto = sc.nextInt();
		int precoAntigo = sc.nextInt();
		int precoNovo = precoAntigo - (precoAntigo * desconto / 100);
		System.out.println(precoNovo);
		sc.close();

	}

}

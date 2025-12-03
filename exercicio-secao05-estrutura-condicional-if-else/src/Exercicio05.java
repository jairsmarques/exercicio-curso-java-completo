/*
 * Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. 
 * A seguir, calcule e mostre o valor da conta a pagar.
 * 
 *     CÓDIGO        ESPECIFICAÇÃO          PREÇO
 *       1          Cachorro Quente        R$ 4.00
 *       2             X-Salada            R$ 4.50
 *       3             X-Bacon             R$ 5.00
 *       4          Torrada Simples        R$ 2.00
 *       5           Refrigerante          R$ 1.50
 */

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int codigo, quantidade;
		double totalPagamento = 0.0;
		codigo = sc.nextInt();
		quantidade = sc.nextInt();

		if (codigo == 1) {
			totalPagamento = 4.00 * quantidade;
			System.out.printf("Total: R$ %.2f%n", totalPagamento);
		} else if (codigo == 2) {
			totalPagamento = 4.50 * quantidade;
			System.out.printf("Total: R$ %.2f%n", totalPagamento);
		} else if (codigo == 3) {
			totalPagamento = 5.00 * quantidade;
			System.out.printf("Total: R$ %.2f%n", totalPagamento);
		} else if (codigo == 4) {
			totalPagamento = 2.00 * quantidade;
			System.out.printf("Total: R$ %.2f%n", totalPagamento);
		} else if (codigo == 5) {
			totalPagamento = 1.50 * quantidade;
			System.out.printf("Total: R$ %.2f%n", totalPagamento);
		}

		sc.close();

	}

}

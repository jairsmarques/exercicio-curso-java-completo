/*
 * Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
 * código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser
 * pago.
 * 
 * */

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int codigoPeca1, codigoPeca2, qtdPeca1, qtdPeca2;
		double precoPeca1, precoPeca2, valorPagamento;

		codigoPeca1 = sc.nextInt();
		qtdPeca1 = sc.nextInt();
		precoPeca1 = sc.nextDouble();

		codigoPeca2 = sc.nextInt();
		qtdPeca2 = sc.nextInt();
		precoPeca2 = sc.nextDouble();

		valorPagamento = qtdPeca1 * precoPeca1 + qtdPeca2 * precoPeca2;

		System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorPagamento);

		sc.close();

	}

}

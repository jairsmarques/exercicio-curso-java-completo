/*
 * Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa que calcule
 *  e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número de homens.
 * 
 */

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		Pessoa[] vect = new Pessoa[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Altura da " + (i + 1) + "a pessoa: ");
			double altura = sc.nextDouble();
			System.out.print("Gênero da " + (i + 1) + "a pessoa: ");
			char genero = sc.next().charAt(0);
			vect[i] = new Pessoa(altura, genero);
		}

		double menorAltura = vect[0].getAltura();
		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getAltura() < menorAltura) {
				menorAltura = vect[i].getAltura();
			}
		}
		System.out.printf("MENOR ALTURA = %.2f%n", menorAltura);

		double maiorAltura = vect[0].getAltura();
		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getAltura() > maiorAltura) {
				maiorAltura = vect[i].getAltura();
			}
		}
		System.out.printf("MAIOR ALTURA = %.2f%n", maiorAltura);

		int quantidadeMulheres = 0;
		double somaMulheres = 0.0;
		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getGenero() == 'F') {
				somaMulheres += vect[i].getAltura();
				quantidadeMulheres++;
			}
		}
		double mediaAlturaMulheres = somaMulheres / quantidadeMulheres;
		System.out.printf("Média das altura das mulheres = %.2f%n", mediaAlturaMulheres);

		int quantidadeHomens = 0;
		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getGenero() == 'M') {
				quantidadeHomens++;
			}
		}
		System.out.println("Número de homens = " + quantidadeHomens);

		sc.close();

	}

}

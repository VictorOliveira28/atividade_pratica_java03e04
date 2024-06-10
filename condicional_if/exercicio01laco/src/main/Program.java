package main;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int valueA, valueB, valueC, soma;

		System.out.println("Digite o número A: ");
		valueA = sc.nextInt();

		System.out.println("Digite o número B: ");
		valueB = sc.nextInt();

		System.out.println("Digite o número C: ");
		valueC = sc.nextInt();

		soma = valueA + valueB;

		if (soma > valueC) {
			System.out.println("A Soma de A + B é Maior do que C");
		}
		
		if(soma < valueC) {
			System.out.println("A Soma de A + B é Menor do que C");
		}
		
		if(soma == valueC) {
			System.out.println("A Soma de A + B é igual a C");
		}

		sc.close();

	}

}

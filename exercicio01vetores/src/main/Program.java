package main;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n, num;

		System.out.println("tamanho do vetor: ");
		n = sc.nextInt();

		int[] vect = new int[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.println("digite os valores do vetor: ");
			vect[i] = sc.nextInt();
		}

		System.out.println("Digite o número que você deseja encontrar: ");
		num = sc.nextInt();

		for (int i = 0; i < vect.length; i++) {
			if(vect[i] == num) {
				System.out.printf("O número %d está localizado na posição %d", num, i);
			}
		}

		sc.close();

	}

}

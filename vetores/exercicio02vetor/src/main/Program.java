package main;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n;
		int sum = 0;
		double avg;

		System.out.println("Digite o tamnho do vetor: ");
		n = sc.nextInt();

		int[] vect = new int[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.println("Elementos do vetor: ");
			vect[i] = sc.nextInt();
			sum += vect[i];
		}
		
		System.out.print("Elementos nos índices ímpares: ");
		for(int i = 1; i < vect.length; i += 2) {			
			System.out.print(vect[i] + " ");
		}
		
		System.out.println();
		System.out.print("Elementos pares: ");
		for(int i = 0; i < vect.length; i++) {
			if(vect[i] % 2 == 0) {
				System.out.print(vect[i] + " ");
			}
		}
		
		System.out.println();
		System.out.printf("Soma: ", sum);
		
		avg = sum / vect.length;
		
		System.out.printf("Média: %.2f", avg);
		
		
		sc.close();
	}

}

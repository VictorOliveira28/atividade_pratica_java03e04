package main;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int num, count = 0;
		double avarage = 0.0, sum = 0;

		do {
			System.out.println("Digite um número: ");
			num = sc.nextInt();
			
			if(num % 3 == 0 && num != 0) {
				count++;
				sum += num;
				avarage = sum / count;
			}
		} while (num != 0);
		
		System.out.println("A média de todos os números múltiplos de 3 é: " + avarage);

		sc.close();
	}

}

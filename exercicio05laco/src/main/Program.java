package main;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int cod, quantity;
		double total, price;

		System.out.print("Código do Produto: ");
		cod = sc.nextInt();

		switch (cod) {
		case 1:
			System.out.print("Quantidade: ");
			quantity = sc.nextInt();
			price = 10.00;
			System.out.println("Produto: Cachorro Quente");
			total = quantity * price;
			System.out.printf("Valor total: R$ %.2f", total);

			break;

		case 2:
			System.out.print("Quantidade: ");
			quantity = sc.nextInt();
			price = 15.00;
			System.out.println("Produto: X-Salada");
			total = quantity * price;
			System.out.printf("Valor total: R$ %.2f", total);

			break;

		case 3:
			System.out.print("Quantidade: ");
			quantity = sc.nextInt();
			price = 18.00;
			System.out.println("Produto: X-Bacon");
			total = quantity * price;
			System.out.printf("Valor total: R$ %.2f", total);

			break;

		case 4:
			System.out.print("Quantidade: ");
			quantity = sc.nextInt();
			price = 12.00;
			System.out.println("Produto: Bauru");
			total = quantity * price;
			System.out.printf("Valor total: R$ %.2f", total);

			break;

		case 5:
			System.out.print("Quantidade: ");
			quantity = sc.nextInt();
			price = 8.00;
			System.out.println("Produto: Refrigerante");
			total = quantity * price;
			System.out.printf("Valor total: R$ %.2f", total);

			break;

		case 6:
			System.out.print("Quantidade: ");
			quantity = sc.nextInt();
			price = 13.00;
			System.out.println("Produto: Suco de laranja");
			total = quantity * price;
			System.out.printf("Valor total: R$ %.2f", total);

			break;

		default:
			System.out.println("Código inválido");
		}

		sc.close();

	}

}

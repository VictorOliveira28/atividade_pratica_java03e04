package main;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int cod;
		float balance = 1000.00f;
		float newBalance, withdraw, deposit;

		System.out.println("Operação: ");
		cod = sc.nextInt();

		switch (cod) {
		case 1:
			System.out.println("Operação - Saldo");
			System.out.printf("Saldo: R$ %.2f", balance);
			break;

		case 2:
			System.out.println("Operação - Saque");
			System.out.println("Valor: ");
			withdraw = sc.nextFloat();
			if (balance < withdraw) {
				System.out.println("Saldo insuficiente");
			} else {
				newBalance = balance - withdraw;
				System.out.printf("Novo Saldo: R$ %.2f", newBalance);
			}
			break;

		case 3:
			System.out.println("Operação - Depósito");
			System.out.println("Valor: ");
			deposit = sc.nextFloat();
			newBalance = balance + deposit;
			System.out.printf("Novo Saldo: R$ %.2f", newBalance);
			break;
		case 4:
			System.out.println("Valor: ");
			newBalance = sc.nextFloat();
			System.out.println("Operação Inválida!");
			break;

		}
		sc.close();

	}
}

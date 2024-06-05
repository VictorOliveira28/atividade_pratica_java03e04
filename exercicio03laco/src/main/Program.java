package main;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String name;
		int age;
		boolean firstTime;

		System.out.println("Digite o Nome do doador: ");
		name = sc.nextLine();

		System.out.println("Digite a Idade do doador: ");
		age = sc.nextInt();

		System.out.println("Primeira doação de sangue? (TRUE ou FALSE)");
		firstTime = sc.nextBoolean();

		if (age >= 18 && age <= 59 && firstTime) {
			System.out.println(name + " é uma pessoa que está apta para doar sange!");
		} else {
			System.out.println(name + " não é uma pessoa que está apta para doar sangue");
		}

		if (age >= 60 && age <= 69 && !firstTime) {
			System.out.println(name + " é uma pessoa que está apta para doar sange!");
		}

		sc.close();
	}

}

package main;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String name;
		int cod;
		float salary, newSalary;

		System.out.print("Nome do colaborador: ");
		name = sc.nextLine();

		System.out.print("Cargo: ");
		cod = sc.nextInt();

		System.out.print("Salário: ");
		salary = sc.nextFloat();

		switch (cod) {
		case 1:
			System.out.printf("Nome do colaborador: " + name + "\n");
			System.out.printf("Cargo: Gerente\n");
			newSalary = (float) (salary + (salary * 0.1));
			System.out.printf("Salário: %.2f", newSalary);
			break;

		case 2:
			System.out.printf("Nome do colaborador: " + name + "\n");
			System.out.printf("Cargo: Vendedor\n");
			newSalary = (float) (salary + (salary * 0.07));
			System.out.printf("Salário: %.2f", newSalary);
			break;

		case 3:
			System.out.printf("Nome do colaborador: " + name + "\n");
			System.out.printf("Cargo: Supervisor\n");
			newSalary = (float) (salary + (salary * 0.09));
			System.out.printf("Salário: %.2f", newSalary);
			break;

		case 4:
			System.out.printf("Nome do colaborador: " + name + "\n");
			System.out.printf("Cargo: Motorista\n");
			newSalary = (float) (salary + (salary * 0.06));
			System.out.printf("Salário: %.2f", newSalary);
			break;

		case 5:
			System.out.printf("Nome do colaborador: " + name + "\n");
			System.out.printf("Cargo: Estoquista\n");
			newSalary = (float) (salary + (salary * 0.05));
			System.out.printf("Salário: %.2f", newSalary);
			break;

		case 6:
			System.out.printf("Nome do colaborador: " + name + "\n");
			System.out.printf("Cargo: Técnico de TI\n");
			newSalary = (float) (salary + (salary * 0.08));
			System.out.printf("Salário: %.2f", newSalary);
			break;

		default:
			System.out.println("Codigo inválido");

		}

		sc.close();
	}

}

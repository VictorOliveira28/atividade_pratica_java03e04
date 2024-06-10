package main;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float num1, num2, result;
		int cod;
		
		System.out.println("Digite o 1º número: ");
		num1 = sc.nextInt();
		
		System.out.println("Digite o 2º número: ");
		num2 = sc.nextInt();
		
		System.out.println("Operação: ");
		cod = sc.nextInt();
		
		switch(cod) {
		case 1:
			result = num1 + num2;
			System.out.println(num1 + " + " + num2 + " = " + result);
			break;
		case 2:
			result = num1 - num2;
			System.out.println(num1 + " - " + num2 + " = " + result);
			break;
		case 3:
			result = num1 * num2;
			System.out.println(num1 + " * " + num2 + " = " + result);
			break;
		case 4:
			result = num1 / num2;
			System.out.println(num1 + " / " + num2 + " = " + result);
			break;
			
			default:
				System.out.println("Operação Inválida!");
			
		}
		
		
		sc.close();

	}

}

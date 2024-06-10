package main;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float grossSalary, additional, extraHour, discount, liquidSalary;
		
		System.out.println("Salário Bruto: ");
		grossSalary = sc.nextFloat();
		
		System.out.println("Adicional Noturno: ");
		additional = sc.nextFloat();
		
		System.out.println("Horas Extras: ");
		extraHour = sc.nextFloat();
		
		System.out.println("Descontos: ");
		discount = sc.nextFloat();
		
		liquidSalary = grossSalary + additional  + (extraHour * 5) - discount;
		
		System.out.printf("Salário Líquido: %.2f", liquidSalary);
		
		
		sc.close();

	}

}

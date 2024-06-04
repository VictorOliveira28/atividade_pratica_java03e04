package main;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float salary;
		float allowance;
		float newSalary;
		
		System.out.println("Salário: ");
		salary = sc.nextFloat();
		
		System.out.println("Abono: ");
		allowance = sc.nextFloat();
		
		newSalary = salary + allowance;
		
		System.out.printf("Novo Salário: %.2f", newSalary);
		
		sc.close();
	}

}

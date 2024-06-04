package main;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float n1, n2, n3, n4, result;
		
		System.out.println("numero1: ");
		n1 = sc.nextFloat();
		
		System.out.println("numero2: ");
		n2 = sc.nextFloat();
		
		System.out.println("numero3: ");
		n3 = sc.nextFloat();
		
		System.out.println("numero4: ");
		n4 = sc.nextFloat();
		
		result = (n1 * n2) - (n3 * n4);
		
		System.out.printf("Diferença: %.1f", result);
		
		sc.close();

	}

}

package main;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float note1, note2, note3, note4, avarage;
		
		System.out.println("Nota 1: ");
		note1 = sc.nextFloat();
		
		System.out.println("Nota 2: ");
		note2 = sc.nextFloat();
		
		System.out.println("Nota 3: ");
		note3 = sc.nextFloat();
		
		System.out.println("Nota 4: ");
		note4 = sc.nextFloat();
		
		avarage = (note1 + note2 + note3 + note4) / 4;
		
		System.out.printf("Média final: %.1f", avarage);
		
		sc.close();

	}

}

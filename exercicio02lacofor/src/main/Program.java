package main;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cont = 10;
		int par = 0, imp = 0, num;
		
		for(int i = 0; i < cont; i++) {
			System.out.println("Digite o " + (i+1) + "º número: ");
			num = sc.nextInt();
			if(num % 2 == 0) {
				par++;
			} else {
				imp++;
			}			
			
		}
		System.out.println("Total de números pares: " + par);
		System.out.println("Total de números ímpares: " + imp);
		
		sc.close();
		
	}

}

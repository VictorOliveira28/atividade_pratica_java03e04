package main;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
		int num, positive = 0;
	
	do {
		System.out.println("Digite um número: ");
		num = sc.nextInt();
		
		if(num > 0) {
			positive += num;
		}
		
	}while(num != 0);
	
	System.out.println("A soma dos números positivos é: " + positive);
	
	sc.close();

	}

}

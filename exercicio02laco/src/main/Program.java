package main;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("Digite um número: ");
		num = sc.nextInt();
		
		if(num % 2 == 0 && num >= 0) {
			System.out.println("O Número é par e positivo!");
		}
		
		if(num % 2 != 0 && num < 0) {
			System.out.println("O Número é ímpar e negativo!");
		}
		
		if(num % 2 == 0 && num < 0) {
			System.out.println("O Número é par e negativo!");
		}
		
		if(num % 2 != 0 && num >= 0) {
			System.out.println("O Número é ímpar e positivo!");
		}
		
		sc.close();

	}

}

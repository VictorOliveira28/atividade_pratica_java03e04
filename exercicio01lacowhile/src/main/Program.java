package main;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int age = 0, adultAge = 0, minorAge = 0;
				
		while(age >= 0) {
			System.out.println("Digite uma idade: ");
			age = sc.nextInt();
			
			if(age >= 0 && age < 21) {
				minorAge++;
			} 
			
			if(age > 50){
				adultAge++;
			}
		}
		
		System.out.println("Total de pessoas menores de 21 anos: " + minorAge);
		System.out.println("Total de pessoas maiores de 50 anos: " + adultAge);
		
		sc.close();
	}

}

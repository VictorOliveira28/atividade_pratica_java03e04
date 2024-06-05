package main;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String word1;
		String word2;
		String word3;
		
		System.out.println("*********************************************************");
		System.out.println("*****DIGITE 3 CARACTERÍSTICAS DE UM TIPO DE ANIMAL*******");
		System.out.println("*********************************************************");
		
		System.out.println();
		
		System.out.println("Digite a primeira caracteristica: ");
		word1 = sc.nextLine();
		
		System.out.println("Digite a segunda caracteristica: ");
		word2 = sc.nextLine();
		
		System.out.println("Digite a terceira caracteristica: ");
		word3 = sc.nextLine();
		
		// VERTEBRADOS
		
		if(word1.equalsIgnoreCase("vertebrado")) {		
			if(word2.equalsIgnoreCase("ave")) {
				if(word3.equalsIgnoreCase("carnivoro")) {
					System.out.println("Águia"); 				
				}
				if(word3.equalsIgnoreCase("onivoro")) {
					System.out.println("Pomba");
				}
			}
		}
		
		if(word1.equalsIgnoreCase("vertebrado")) {
			if(word2.equalsIgnoreCase("mamifero")) {
				if(word3.equalsIgnoreCase("onivoro")) {
					System.out.println("Homem");
				}
				if(word3.equalsIgnoreCase("herbivoro")) {
					System.out.println("Vaca");
				}
			}
		}
		
		// INVERTEBRADOS
		
		if(word1.equalsIgnoreCase("invertebrado")) {		
			if(word2.equalsIgnoreCase("inseto")) {
				if(word3.equalsIgnoreCase("hematofago")) {
					System.out.println("Pulga"); 				
				}
				if(word3.equalsIgnoreCase("herbivoro")) {
					System.out.println("Lagarta");
				}
			}
		}
		
		if(word1.equalsIgnoreCase("invertebrado")) {
			if(word2.equalsIgnoreCase("anelideo")) {
				if(word3.equalsIgnoreCase("hematofago")) {
					System.out.println("Sanguessuga");
				}
				if(word3.equalsIgnoreCase("onivoro")) {
					System.out.println("Minhoca");
				}
			}
		}
			
		sc.close();

	}

}

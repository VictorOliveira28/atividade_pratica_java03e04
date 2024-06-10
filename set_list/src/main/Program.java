package main;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> list = new HashSet<>();
		
		int n = 10;
		
		for(int i = 0; i < n; i++) {
			System.out.println("Digite os valores a serem adicionados a lista: ");
			int num = sc.nextInt();
			list.add(num);
		}
		
		System.out.println("Listar dados do Set:");
		for(Integer obj : list) {
			System.out.println(obj);
		}
		
		sc.close();

	}

}

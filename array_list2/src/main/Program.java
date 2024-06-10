package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		
		int n;

		list.addAll(Arrays.asList(2, 5, 1, 3, 4, 9, 7, 8, 10, 6));
		
		System.out.println("Digite o número que você deseja encontrar:");
		n = sc.nextInt();
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).equals(n)) {
				System.out.printf("O número %d está localizado na posição %d", n, i);
				return;
			}			
		}	
		
		System.out.printf("O número %d não foi encontrado!", n);
		
		sc.close();

	}

}
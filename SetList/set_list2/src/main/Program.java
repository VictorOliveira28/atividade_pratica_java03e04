package main;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Set<Integer> list = new HashSet<>();
		list.addAll(Arrays.asList(2, 5, 1, 3, 4, 9, 7, 8, 10, 6));
		Iterator<Integer> iList = list.iterator();

		int n;

		System.out.println("Digite o número que você deseja encontrar: ");
		n = sc.nextInt();

		for(; iList.hasNext();) {
			int num = iList.next();
			if(n == num) {
				
				System.out.printf("O número %d foi encontrado!", n);				
				return;
			}
		}
		
		System.out.printf("O número %d não foi encontrado!", n);
		
		sc.close();

	}

}

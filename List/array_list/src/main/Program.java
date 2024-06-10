package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<>();
		
		
		System.out.println("Digite 5 cores a serem adicionadas: ");
		
		for(int i = 0; i < 5; i++) {
			String color = sc.next();
			list.add(color);
		}
		
		
		System.out.println("Listar todas as cores:");
		for(String obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("-------------------------------------");
		
		System.out.println("Ordenar as cores:");
		Collections.sort(list);

		StringBuilder resultList = new StringBuilder();
		for(String str : list) {
			resultList.append(str).append("\n");
		}
		
		System.out.println(resultList.toString());
		sc.close();
	}

}

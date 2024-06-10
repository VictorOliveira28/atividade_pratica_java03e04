package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		
		list.add("Azul");
		list.add("Verde");
		list.add("Amarelo");
		list.add("Branco");
		list.add("Laranja");
		
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
	}

}

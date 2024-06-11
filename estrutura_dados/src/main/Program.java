package main;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int option;

		Queue<String> list = new LinkedList<>();

		while (true) {
			System.out.println("***********************************************");
			System.out.println("1 - Adicionar Cliente na Fila");
			System.out.println("2 - Listar todos os Clientes");
			System.out.println("3 - Retirar Cliente da Fila");
			System.out.println("0 - Sair");
			System.out.println("***********************************************");

			System.out.println("Entre com a opção desejada: ");
			option = sc.nextInt();
			sc.nextLine();
			
			if(option == 0) {
				return;
			}
			
			if(option == 1) {
				System.out.println("Digite o Nome: ");
				list.add(sc.nextLine());				
				System.out.println("Cliente Adicionado!");
				continue;
			}
			
			if(option == 2) {
				StringBuilder sb = new StringBuilder();
				for(String obj : list) {
					sb.append(obj).append("\n");
				}
				
				System.out.println(sb.toString());
				continue;
			}
			
			if(option == 2 && list.isEmpty()) {
				System.out.println("A Fila está vazia!");
				continue;
			}
			
			if(option == 3) {
				list.remove();
				System.out.println("Cliente Removido!");
				continue;
			}			
			
			System.out.println("Opção Inválida!");
			sc.close();
		}		
	
	}

}

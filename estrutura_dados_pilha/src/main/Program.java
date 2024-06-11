package main;

import java.util.Scanner;
import java.util.Stack;

public class Program {

	public static void main(String[] args) {

		Stack<String> list = new Stack<>();

		Scanner sc = new Scanner(System.in);

		int option;

		while (true) {
			System.out.println("***********************************************");
			System.out.println("1 - Adicionar Livros na Pilha");
			System.out.println("2 - Listar todos os Livros");
			System.out.println("3 - Retirar Livros da Pilha");
			System.out.println("0 - Sair");
			System.out.println("***********************************************");

			System.out.println("Entre com a opção desejada: ");
			option = sc.nextInt();
			sc.nextLine();

			if (option == 0) {
				System.out.println("Programa Finalizado!");
				return;
			}

			if (option == 1) {
				System.out.println("Digite o nome: ");
				String name = sc.nextLine();
				list.push(name);
				System.out.println();
				System.out.println(name + "\n" + "Livro adicionado!");
				continue;
			}

			if (option == 2 && !list.isEmpty()) {
				StringBuilder sb = new StringBuilder();
				for (String obj : list) {
					sb.append(obj).append("\n");
				}
				System.out.println(sb.toString());
				continue;
			}
			
			if(option == 2 && list.isEmpty()) {
				System.out.println("A Pilha Está Vazia!");
				continue;
			}
			
			if(option == 3) {			
				list.pop();
				System.out.println("Um Livro foi retirado da Pilha!");
				continue;
			}
			
			sc.close();
		}

	}

}

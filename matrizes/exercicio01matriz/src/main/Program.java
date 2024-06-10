package main;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, m, sumPrin = 0, sumSec = 0;
		
		System.out.println("Digite a quantidade de linhas: ");
		n = sc.nextInt();
		
		System.out.println("Digite a quantidade de colunas: ");
		m = sc.nextInt();
		
		int[][] mat = new int[n][m];
		
		for(int i = 0; i < n; i++) {			
			for(int j = 0; j < m; j++) {
				System.out.println("elementos: ");
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Elementos da diagonal Principal: ");
		for(int i = 0; i < mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}
		
		System.out.println();
		
		System.out.println("Elementos da diagonal secundária: ");
		for(int i = 0; i < mat.length; i++) {
			System.out.print(mat[i][2 - i] + " ");
		}
		
		System.out.println();
		
		System.out.println("Soma dos Elementos da Diagonal Principal: ");
		for(int i = 0; i < mat.length; i++) {
			sumPrin += mat[i][i];
		}
		System.out.print(sumPrin);
		
		System.out.println();
		
		System.out.println("Soma dos Elementos da Diagonal Secundária: ");
		for(int i = 0; i < mat.length; i++) {
			sumSec += mat[i][2 - i];
		}
		System.out.print(sumSec);
		sc.close();

	}

}

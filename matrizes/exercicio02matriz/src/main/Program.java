package main;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, m;
		
		System.out.println("Digite a quantidade de linhas: ");
		n = sc.nextInt();
		
		System.out.println("Digite a quantidade de colunas: ");
		m = sc.nextInt();
		
		double[][] notes = new double[n][m];
		double[] avg = new double[n];
		
		for(int i = 0; i < notes.length; i++) {
			System.out.println("Digite as notas do participante nº: " + (i+1));
			for(int j = 0; j < m; j++) {
				System.out.println((j+1) + "º Bimestre");
				notes[i][j] = sc.nextDouble();
			}
		}
		
		for(int i = 0; i < avg.length; i++) {
			double sum = 0;
			for(int j = 0; j < m; j++) {
				sum += notes[i][j];
			}
			
			avg[i] = sum / m;
		}
		
		System.out.println("Média dos participantes:");
		
		for(int i = 0; i < n; i++) {
			System.out.printf((i + 1) + "º Participante Média %.1f \n", avg[i]);
		}		
		
		sc.close();

	}

}

package main;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int backCount = 0;
		int frontFemCount = 0;
		int mobileMenCount = 0;
		int fullStackNBiCount = 0;
		int sumAge = 0;
		int total = 0;
		
		while(true) {
			System.out.println("Digite a idade do colaborador: ");
			int age = sc.nextInt();
			
			System.out.println("Digite a identidade de gênero do colaborador: ");
			System.out.println("1 – Mulher Cis");
            System.out.println("2 – Homem Cis");
            System.out.println("3 – Não Binário");
            System.out.println("4 – Mulher Trans");
            System.out.println("5 – Homem Trans");
            System.out.println("6 – Outros");
            int gen = sc.nextInt();
            
            System.out.println("Digite a área de atuação do colaborador: ");
            System.out.println("1 – Backend");
            System.out.println("2 – Frontend");
            System.out.println("3 – Mobile");
            System.out.println("4 – FullStack");
            int setor = sc.nextInt();
            
            if(setor == 1) {
            	backCount++;
            }
            
            if((gen == 1 || gen == 4) && setor == 2) {
            	frontFemCount++;
            }
            
            if((gen == 2 || gen == 5) && setor == 3 && age > 440) {
            	mobileMenCount++;
            }
            
            if(gen == 3 && setor == 4 && age < 30) {
            	fullStackNBiCount++;
            }
            
            total++;
            sumAge += age;
            
            System.out.println("Deseja continuar a leitura de dados?(S/N)");
            char question = sc.next().charAt(0);
            if(question == 'N' || question == 'n') {
            	break;
            }
		}
		
		double avarageAge = (double) sumAge / total;
		
		System.out.println("Número de pessoas desenvolvedoras Backend: " + backCount);
        System.out.println("Número de Mulheres Cis e Trans desenvolvedoras Frontend: " + frontFemCount);
        System.out.println("Número de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + mobileMenCount);
        System.out.println("Número de Não Binários desenvolvedores FullStack menores de 30 anos: " + fullStackNBiCount);
        System.out.println("Número total de pessoas que responderam à pesquisa: " + total);
        System.out.printf("Média de idade das pessoas que responderam à pesquisa: %.2f",  avarageAge);
		
		sc.close();

	}

}

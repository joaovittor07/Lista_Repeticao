package Lista_de_Repetição;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		// Faça um programa que calcule e mostre a média aritmética de N notas.
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de notas: ");
        int n = scanner.nextInt();

        double soma = 0.0;

        for (int i = 1; i <= n; i++) {
           
        	System.out.print("Digite a " + i + "ª nota: ");
            
        	double nota = scanner.nextDouble();
            
        	soma += nota;
        
        }

        double media = soma / n;

        System.out.println("A média das notas é: " + media);

        scanner.close();

		
	}

}

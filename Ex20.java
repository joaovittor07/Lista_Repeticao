package Lista_de_Repeti��o;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		// Fa�a um programa que calcule e mostre a m�dia aritm�tica de N notas.
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de notas: ");
        int n = scanner.nextInt();

        double soma = 0.0;

        for (int i = 1; i <= n; i++) {
           
        	System.out.print("Digite a " + i + "� nota: ");
            
        	double nota = scanner.nextDouble();
            
        	soma += nota;
        
        }

        double media = soma / n;

        System.out.println("A m�dia das notas �: " + media);

        scanner.close();

		
	}

}

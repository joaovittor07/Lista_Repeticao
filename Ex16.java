package Lista_de_Repeti��o;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		/* Fa�a um programa que, dado um conjunto de N n�meros, determine o menor 
		   valor, o maior valor e a soma dos valores. */
		
		Scanner s = new Scanner(System.in);

        System.out.print("Digite a quantidade de n�meros a serem inseridos: ");
        int n = s.nextInt();

        int menorValor = Integer.MAX_VALUE;
        int maiorValor = Integer.MIN_VALUE;
        int soma = 0;

        for (int i = 0; i < n; i++) {
            
        	System.out.print("Digite o " + (i + 1) + "� n�mero: ");
            
        	int numero = s.nextInt();

            if (numero < menorValor) {

            	menorValor = numero;
            
            }
            
            if (numero > maiorValor) {
             
            	maiorValor = numero;

            }

            soma += numero;
        }

        System.out.println("Menor valor: " + menorValor);
        System.out.println("Maior valor: " + maiorValor);
        System.out.println("Soma dos valores: " + soma);

        s.close();
		
	}

}

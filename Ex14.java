package Lista_de_Repeti��o;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		/* Fa�a um programa que mostre os n termos da S�rie a seguir:
		   � S = 1/1 + 2/3 + 3/5 + 4/7 + 5/9 + ... + n/m. */
				   
		Scanner s = new Scanner(System.in);

        System.out.print("Digite o valor de n (n�mero de termos da s�rie): ");
        int n = s.nextInt();

        double soma = 0.0;
        int numerador = 1;
        int denominador = 1;

        System.out.print("S = ");
      
        for (int i = 1; i <= n; i++) {
        
        	System.out.print(numerador + "/" + denominador);
            
        	soma += (double) numerador / denominador;
            
        	numerador++;
            
        	denominador += 2;

            if (i < n) {

            	System.out.print(" + ");
            
            }
        }

        System.out.println();
        System.out.println("A soma dos " + n + " termos da s�rie �: " + soma);

        s.close();
	    
	}

}

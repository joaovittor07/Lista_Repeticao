package Lista_de_Repetição;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		/* A série de Fibonacci é formada pela seqüência 1,1,2,3,5,8,13,21,34,55,... 
		   Faça um programa capaz de gerar a série até o n−ésimo termo. */
		
		Scanner s = new Scanner(System.in);

        System.out.print("Digite o valor de n (número de termos): ");
        int n = s.nextInt();

        System.out.println("Série de Fibonacci até o " + n + "º termo:");

        int primeiroTermo = 1;
        int segundoTermo = 1;

        if (n >= 1) {
        
        	System.out.print(primeiroTermo);

        }

        for (int i = 2; i <= n; i++) {
            
        	System.out.print(", " + segundoTermo);
            
        	int proximoTermo = primeiroTermo + segundoTermo;
            
        	primeiroTermo = segundoTermo;
            
        	segundoTermo = proximoTermo;
        
        }

        System.out.println();

        s.close();
		
	}

}

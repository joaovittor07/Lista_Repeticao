package Lista_de_Repeti��o;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		/* Fa�a um programa que pe�a um n�mero inteiro e determine se ele � ou n�o 
		   um n�mero primo. Um n�mero primo � aquele que � divis�vel somente por ele 
		   mesmo e por 1. */
		
		Scanner s = new Scanner(System.in);

        System.out.print("Digite um n�mero inteiro: ");
        int numero = s.nextInt();

        boolean ehPrimo = verificarPrimo(numero);

        if (ehPrimo) {
            System.out.println(numero + " � um n�mero primo.");
        } else {
            System.out.println(numero + " n�o � um n�mero primo.");
        }

        s.close();
    }

    public static boolean verificarPrimo(int num) {
       
    	if (num <= 1) {
        
    		return false;
        
    	}
        
        if (num <= 3) {
        
        	return true;
        
        }

        if (num % 2 == 0 || num % 3 == 0) {

        	return false;
        
        }

        for (int i = 5; i * i <= num; i += 6) {
            
        	if (num % i == 0 || num % (i + 2) == 0) {
            
        		return false;
            
        	}
        }

        return true;
		
	}

}

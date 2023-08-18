package Lista_de_Repetição;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		/* Faça um programa que peça um número inteiro e determine se ele é ou não 
		   um número primo. Um número primo é aquele que é divisível somente por ele 
		   mesmo e por 1. */
		
		Scanner s = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = s.nextInt();

        boolean ehPrimo = verificarPrimo(numero);

        if (ehPrimo) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
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

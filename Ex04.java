package Lista_de_Repeti��o;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		/* Supondo que a popula��o de um pa�s A seja da ordem de 80000 habitantes com uma 
		   taxa anual de crescimento de 3% e que a popula��o de B seja 200000 habitantes 
		   com uma taxa de crescimento de 1.5%. Fa�a um programa que calcule e escreva o 
		   n�mero de anos necess�rios para que a popula��o do pa�s A ultrapasse ou iguale 
		   a popula��o do pa�s B, mantidas as taxas de crescimento. Altere o programa anterior
		   permitindo ao usu�rio informar as popula��es e as taxas de crescimento iniciais. 
		   Valide a entrada e permita repetir a opera��o. */
		
		Scanner s = new Scanner(System.in);
       
		int populacaoA, populacaoB;
        double taxaCrescimentoA, taxaCrescimentoB;

        do {

        	System.out.print("Informe a popula��o do pa�s A: ");
            
        	populacaoA = s.nextInt();
            
        	if (populacaoA <= 0) {
            
        		System.out.println("A popula��o deve ser maior que zero. Tente novamente.");
            
        	}

        } while (populacaoA <= 0);

        do {

        	System.out.print("Informe a taxa de crescimento do pa�s A (%): ");
            
        	taxaCrescimentoA = s.nextDouble();
            
        	if (taxaCrescimentoA <= 0) {
            
        		System.out.println("A taxa de crescimento deve ser maior que zero. Tente novamente.");
            
        	}

        } while (taxaCrescimentoA <= 0);

        do {

        	System.out.print("Informe a popula��o do pa�s B: ");
            
        	populacaoB = s.nextInt();
            
        	if (populacaoB <= 0) {
            
        		System.out.println("A popula��o deve ser maior que zero. Tente novamente.");
            
        	}
        
        } while (populacaoB <= 0);

        do {

        	System.out.print("Informe a taxa de crescimento do pa�s B (%): ");
            
        	taxaCrescimentoB = s.nextDouble();
            
        	if (taxaCrescimentoB <= 0) {
            
        		System.out.println("A taxa de crescimento deve ser maior que zero. Tente novamente.");
            
        	}
        
        } while (taxaCrescimentoB <= 0);

        int anos = 0;
      
        while (populacaoA <= populacaoB) {

        	populacaoA += populacaoA * (taxaCrescimentoA / 100);
            
        	populacaoB += populacaoB * (taxaCrescimentoB / 100);
            
        	anos++;
        
        }

        System.out.println("Levar� " + anos + " anos para a popula��o do pa�s A ultrapassar ou igualar a popula��o do pa�s B.");

        s.close();

	}
}
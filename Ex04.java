package Lista_de_Repetição;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		/* Supondo que a população de um país A seja da ordem de 80000 habitantes com uma 
		   taxa anual de crescimento de 3% e que a população de B seja 200000 habitantes 
		   com uma taxa de crescimento de 1.5%. Faça um programa que calcule e escreva o 
		   número de anos necessários para que a população do país A ultrapasse ou iguale 
		   a população do país B, mantidas as taxas de crescimento. Altere o programa anterior
		   permitindo ao usuário informar as populações e as taxas de crescimento iniciais. 
		   Valide a entrada e permita repetir a operação. */
		
		Scanner s = new Scanner(System.in);
       
		int populacaoA, populacaoB;
        double taxaCrescimentoA, taxaCrescimentoB;

        do {

        	System.out.print("Informe a população do país A: ");
            
        	populacaoA = s.nextInt();
            
        	if (populacaoA <= 0) {
            
        		System.out.println("A população deve ser maior que zero. Tente novamente.");
            
        	}

        } while (populacaoA <= 0);

        do {

        	System.out.print("Informe a taxa de crescimento do país A (%): ");
            
        	taxaCrescimentoA = s.nextDouble();
            
        	if (taxaCrescimentoA <= 0) {
            
        		System.out.println("A taxa de crescimento deve ser maior que zero. Tente novamente.");
            
        	}

        } while (taxaCrescimentoA <= 0);

        do {

        	System.out.print("Informe a população do país B: ");
            
        	populacaoB = s.nextInt();
            
        	if (populacaoB <= 0) {
            
        		System.out.println("A população deve ser maior que zero. Tente novamente.");
            
        	}
        
        } while (populacaoB <= 0);

        do {

        	System.out.print("Informe a taxa de crescimento do país B (%): ");
            
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

        System.out.println("Levará " + anos + " anos para a população do país A ultrapassar ou igualar a população do país B.");

        s.close();

	}
}
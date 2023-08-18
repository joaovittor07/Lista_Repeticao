package Lista_de_Repetição;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		/* Faça um programa que calcule o fatorial de um número inteiro fornecido 
		   pelo usuário. Ex.: 5!=5.4.3.2.1=120 */
		
		Scanner s = new Scanner(System.in);

        System.out.print("Digite um número inteiro para calcular o fatorial: ");
        int numero = s.nextInt();

        int fatorial = calcularFatorial(numero);

        System.out.println(numero + "! = " + fatorial);

        s.close();
    }

    public static int calcularFatorial(int n) {
        
    	if (n == 0 || n == 1) {
    
    		return 1;
        
    	} else {
        
    		return n * calcularFatorial(n - 1);
        
    	}
		
	}

}

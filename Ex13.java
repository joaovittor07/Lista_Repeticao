package Lista_de_Repeti��o;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		/* Fa�a um programa que calcule o fatorial de um n�mero inteiro fornecido 
		   pelo usu�rio. Ex.: 5!=5.4.3.2.1=120 */
		
		Scanner s = new Scanner(System.in);

        System.out.print("Digite um n�mero inteiro para calcular o fatorial: ");
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

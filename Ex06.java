package Lista_de_Repeti��o;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// Fa�a um programa que imprima na tela apenas os n�meros �mpares entre 1 e 50.
		
		Scanner s = new Scanner (System.in);
		
		for (int i = 1; i <= 50; i++) {
         
			if (i % 2 != 0) {
            
				System.out.println(i);
            
			}
        }
	}
}

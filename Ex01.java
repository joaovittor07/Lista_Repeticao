package Lista_de_Repetição;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		/* Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem 
		   caso o valor seja inválido e continue pedindo até que o usuário informe 
		   um valor válido. */
		
		Scanner s = new Scanner (System.in);
		
		int nota = 0;
		
		for(int i = 0; i < 2;) {
		
			System.out.print("Informe um Número: ");
			nota = s.nextInt();
			
			if((nota >= 0) && (nota <= 10)) {
				
				System.out.print("\nO Número " + nota + " é Valido");
				break; // Encerra o loop se a nota for válida
				
			}else {
				
				System.out.print("\nO Número é Invalido, informe outro Valor");
				break;
				
			}
			
		}
		s.close();
	}

}

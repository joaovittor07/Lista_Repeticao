package Lista_de_Repeti��o;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		/* Fa�a um programa que pe�a uma nota, entre zero e dez. Mostre uma mensagem 
		   caso o valor seja inv�lido e continue pedindo at� que o usu�rio informe 
		   um valor v�lido. */
		
		Scanner s = new Scanner (System.in);
		
		int nota = 0;
		
		for(int i = 0; i < 2;) {
		
			System.out.print("Informe um N�mero: ");
			nota = s.nextInt();
			
			if((nota >= 0) && (nota <= 10)) {
				
				System.out.print("\nO N�mero " + nota + " � Valido");
				break; // Encerra o loop se a nota for v�lida
				
			}else {
				
				System.out.print("\nO N�mero � Invalido, informe outro Valor");
				break;
				
			}
			
		}
		s.close();
	}

}

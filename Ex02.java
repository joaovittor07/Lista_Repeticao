package Lista_de_Repeti��o;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		/* Fa�a um programa que leia um nome de usu�rio e a sua senha 
		   e n�o aceite a senha igual ao nome do usu�rio, mostrando uma 
		   mensagem de erro e voltando a pedir as informa��es. */
		
		Scanner s = new Scanner (System.in);
		
		System.out.print("Informe seu Usu�rio: ");
		String usu = s.next();
		
		System.out.print("\nInforme seu Senha: ");
		String sen = s.next();
		
		while(usu.equals(sen)) {
			
			System.out.println("\nERRO: O Usu�rio n�o pode ser igual a Senha");
			
			System.out.print("\nInforme seu Usu�rio: ");
			usu = s.next();
			
			System.out.print("\nInforme seu Senha: ");
		    sen = s.next();
				
			}
			
			System.out.print("\nBEM VINDO");
			
		s.close();
		}
		
	}


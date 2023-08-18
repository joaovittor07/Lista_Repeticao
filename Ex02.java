package Lista_de_Repetição;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		/* Faça um programa que leia um nome de usuário e a sua senha 
		   e não aceite a senha igual ao nome do usuário, mostrando uma 
		   mensagem de erro e voltando a pedir as informações. */
		
		Scanner s = new Scanner (System.in);
		
		System.out.print("Informe seu Usuário: ");
		String usu = s.next();
		
		System.out.print("\nInforme seu Senha: ");
		String sen = s.next();
		
		while(usu.equals(sen)) {
			
			System.out.println("\nERRO: O Usuário não pode ser igual a Senha");
			
			System.out.print("\nInforme seu Usuário: ");
			usu = s.next();
			
			System.out.print("\nInforme seu Senha: ");
		    sen = s.next();
				
			}
			
			System.out.print("\nBEM VINDO");
			
		s.close();
		}
		
	}


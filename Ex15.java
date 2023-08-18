package Lista_de_Repetição;

public class Ex15 {

	public static void main(String[] args) {
		/* Mostre e calcule a série 
		   S = (37*38)/1 + (36*37)/2 + (35*36)/3 + ... + (1*2)/37. */
		
		double soma = 0.0;

        for (int i = 37; i >= 1; i--) {
            double termo = (i * (i + 1)) / (37 - i + 1);
            soma += termo;
            
            System.out.println("(" + i + "*" + (i + 1) + ")/" + (37 - i + 1) + " = " + termo);
        }

        System.out.println("A soma da série é: " + soma);
		
	}

}

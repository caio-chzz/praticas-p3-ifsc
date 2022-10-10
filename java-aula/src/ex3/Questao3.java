package ex3;

import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		
Scanner leitura = new Scanner(System.in);
        
		
		Integer valor = Integer.valueOf(leitura.nextLine());
		
		if (valor %2 == 0) {
			System.out.println("numero par");
		}
		else {
			System.out.println("numero impar");
		}
		

	}

}

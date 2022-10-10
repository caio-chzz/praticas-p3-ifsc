package exemplo;

import java.util.ArrayList;
import java.util.Scanner;

public class Javabasico {

	public static void main(String[] args) {
	 // leitura de dados	
		
		Scanner leitura = new Scanner(System.in);
        
		//converter valor
		String nome = leitura.nextLine();
		Integer idade = Integer.valueOf(leitura.nextLine());
		
		// exibição de dados
		System.out.println(nome);
		System.out.println(idade);
		
		ArrayList<String> ListaCores = new ArrayList<>();	
		
		ListaCores.add("verde");
		ListaCores.add("vermelho");
		ListaCores.add("azul");
	
		for (int i = 0; i < args.length; i++) {
			System.out.println(ListaCores);
		}
		
		
		
		
		
		
		
		
		
	}


}

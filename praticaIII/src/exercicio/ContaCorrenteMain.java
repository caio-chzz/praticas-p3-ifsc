package exercicio;

import java.util.Scanner;

public class ContaCorrenteMain {

	public static void main(String[] args) {
		
		ContaCorrente x = new ContaCorrente();

		Scanner ler = new Scanner(System.in);
		
		Integer dinhero = ler.nextInt();
		
		Integer f = ler.nextInt();
		
		if(f == 1) {
		x.Depositar(dinhero);
		}
	
		if(f == 2 ) {
		x.Sacar(dinhero);
		}
		
		x.mostrarDados();
	
		x.Nomet = "Caio";
		x.nconta = 32;
		x.cpf = 1234567890;
		x.saldo = 587.0;
	
	
	}
	

	
}

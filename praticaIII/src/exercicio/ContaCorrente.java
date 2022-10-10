package exercicio;

public class ContaCorrente {

	
	public String Nomet;
	
	public Integer cpf;
	
	public Integer nconta;
	
	public double saldo;
	
	
	
	public Double Sacar(Integer valor) {
		if(valor > saldo) {
			System.out.println("saldo insuficiente");
		}else {
		saldo = saldo - valor;
		}
		return saldo;
	}
	
			
	public Double Depositar(Integer vale) {
		saldo = saldo + vale;
		return saldo;
	}
	
			
	public void mostrarDados() {
		System.out.println("saldo=" + saldo);
		System.out.println("titular:" + Nomet);
		System.out.println("conta" + nconta);
		System.out.println("Cpf" + cpf);
	}
	

	}



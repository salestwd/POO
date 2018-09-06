
public class ContasCorrente {


		//Atributos
		
		String conta;
		double saldo;
		String agencia;
		Cliente cliente = new Cliente();
		
		
		
		//Métodos
		
		public int sacar (double valor){
			
			if(valor <= this.saldo) {
				this.saldo -= valor;
				return 1;
			}
			return 0;
		}
		
		public void depositar(double valor) {
			if(valor > 0) {
				this.saldo += valor;
			}
			System.out.println("Valor Inválido");
		}
		
	    public void  imprimir(){
//	        StringBuilder str= new StringBuilder();
//	        str.append("Conta: ").append(conta).append("\n");
//	        str.append("Agência: ").append(agencia).append("\n");
//	        str.append("Nome do Cliente: ").append(nomeCliente).append("\n");
//	        str.append("Saldo: ").append(saldo).append("\n");
//	        return str.toString();
	    	
	        System.out.println("Conta: " + conta);
	        System.out.println("Agencia: " + agencia);
	        System.out.println("Cliente: " + cliente.getNome());
	        System.out.println("CPF Cliente: " + cliente.getCPF());
	        System.out.println("Endereço Cliente: " + cliente.getEndereço());
	        System.out.println("Saldo da Conta: " + saldo);
	    }

}

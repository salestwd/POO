import java.util.Scanner;

public class PrincipalContasCorrente {
	
	public ContasCorrente cc = new ContasCorrente();

  
	public static void main(String[] args) {
		
		Scanner sc4 = new Scanner(System.in);
		
		//Instanciar um objeto dessa mesma classe para utilizar os métodos
		PrincipalContasCorrente principal = new PrincipalContasCorrente();
		
		int opc = 0;
		
		 while (opc != 9)
		 {
	            System.out.println("MENU");
	            System.out.println("1 .. Cadastrar");
	            System.out.println("2 .. Depositar");
	            System.out.println("3 .. Sacar");
	            System.out.println("4 .. Consultar");
	            System.out.println("9 .. SAIR");
	            System.out.println("Escolha a opcao: ");
	            opc = Integer.parseInt(sc4.nextLine());
	     
	            switch (opc) {
                case 1:
                    principal.execCadastrar();
                    break;
                case 2:
                    principal.execDeposito();
                    break;
                case 3:
                    principal.execSaque();
                    break;
                case 4:
                    principal.execConsulta();
                    break;
                case 9:
                    System.out.println("Fim");
                    break;
                default:
                    System.out.println("Opcao inválida");
            } 
		 }		 
	}
	
	public void execSaque() {
		
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do saque: ");
        double valor = Double.parseDouble(sc.nextLine());
        if (this.cc.sacar(valor) == 1) {
            System.out.println("Saque efetuado com sucesso");
        } else {
            System.out.println("Não possui saldo");
        }
		
	}
	
	public void execDeposito() {
		
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Digite o valor do deposito: ");
        double valor = Double.parseDouble(sc2.nextLine());
        this.cc.depositar(valor);
        System.out.println("Deposito efetuado com sucesso");
		
	}
	
	public void execConsulta() {
		
		this.cc.imprimir();
		
	}
	
	public void execCadastrar() {
		
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Agencia: ");
        this.cc.agencia = sc3.nextLine();
        
	    System.out.println("Nome do Cliente: ");
        this.cc.cliente.setNome(sc3.nextLine());
        
        System.out.println("CPF: ");
        this.cc.cliente.setCPF(sc3.nextLine());
        
        System.out.println("Endereço: ");
        this.cc.cliente.setEndereço(sc3.nextLine());
        
        System.out.println("Conta numero: ");
        this.cc.conta = sc3.nextLine();
        
        System.out.println("Conta Corrente cadastrada com sucesso");
	}	
	
	


}

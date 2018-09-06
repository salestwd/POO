import java.util.Scanner;

public class Carrinho {
	
	protected Produto[] compras = new Produto[5];
	int p = 0;
	double total = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Carrinho meuCarrinho = new Carrinho();
		
		int opc=0;
		
		do {
			System.out.println("Menu");
			System.out.println("1.. Cadastrar Produto ");
			System.out.println("3.. Fechar a Conta ");
			System.out.println("9.. SAIR DO PROGRAMA!");
			System.out.println("Sua opção: ");
			opc = Integer.parseInt(sc.nextLine());
			
			switch(opc) {
				case 1: 
					Produto produto = new Produto();
					System.out.println("Digite o id: ");
					produto.setId(Integer.parseInt(sc.nextLine()));
					System.out.println("Digite o nome: ");
					produto.setNome(sc.nextLine());
					System.out.println("Digite o preço R$");
					produto.setPreco(Double.parseDouble(sc.nextLine()));
					meuCarrinho.adicionar(produto);
					break;
				case 2:
					meuCarrinho.fecharConta();
					break;
				case 9:
					System.out.println("FIM");
					break;
				default:
					System.out.println("Opção Inválida! ");
					
			
			
			}
			
		}while(opc!=9);
		

	}
	
	private void fecharConta() {
		
		for (Produto produto : compras) {
			if(produto!=null) {
				produto.imprimir();
			}
		}
		
		System.out.println("Valor total igua a: " + getTotalCompras() );
	}

	public void adicionar(Produto prod) {
		if(p<5) {
			compras[p] = prod;
			p++;
			total += prod.getPreco();
			System.out.println("Produto Adicionado ao Carrinho!");
		}else {
			System.out.println("Carrinho sem Espaço!");
		}
		
	}
	
	public double getTotalCompras() {
		return total;
	}

}

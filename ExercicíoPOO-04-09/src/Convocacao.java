import java.util.Scanner;

public class Convocacao {

	private static Scanner sc;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		int cont = 0;
		int numProcurado;
		String nomeProcurado;
		
		Equipe flamengo = new Equipe();
		
		int opc=0;
		
		
		
		
		do {
			System.out.println("\t CONVOCAÇÃO " + flamengo.getNome());
			System.out.println("1.. Cadastrar Jogador ");
			System.out.println("2.. Pesquisar pelo Nome");
			System.out.println("3.. Pesquisar pelo número da Camisa ");
			System.out.println("4.. Visualizar Time");
			System.out.println("5.. Ativar Trapaça");
			System.out.println("9.. Sair!");
			System.out.println("Sua opção: ");
			opc = Integer.parseInt(sc.nextLine());
			
			
			
			switch(opc) {
			case 1: 
				Jogador j1 = new Jogador();
				flamengo.AdicionaJogador(cont, j1);
				cont++;
				break;
			case 2:
				System.out.println("Digite o nome do jogador procurado: ");
				nomeProcurado = sc.nextLine();
				flamengo.ProcuraJogadorPeloNome(nomeProcurado);
				break;
			case 3:
				System.out.println("Digite o número da camisa do jogador procurado: ");
				numProcurado = Integer.parseInt(sc.nextLine());
				flamengo.ProcuraJogadorPeloNum(numProcurado);
				break;
			case 4:
				flamengo.Imprimir(cont);
				System.out.println("");
				break;
			case 5:
				cont = flamengo.trapaca(flamengo, cont);
				break;
			case 9:
				System.out.println("FIM");
				break;
			default:
				System.out.println("Opção Inválida! ");
				
		
		
		}
		
	}while(opc!=9);
	
		

	}

}

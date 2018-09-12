import java.util.Scanner;


public class Equipe {

	
	//Atributos
	private String nome;

	private int qtdJogadores;
	
	public Jogador team[] = new Jogador[10];


	Scanner sc = new Scanner(System.in);
	
	
	//Contrutores
	
	public Equipe(){
		
		System.out.println("Digite um Nome para o Time:");
		setNome(sc.nextLine());
		
	}
	
	
	
	//Métodos
	

	public int getQtdJogadores() {
		return qtdJogadores;
	}


	public void setQtdJogadores(int qtdJogadores) {
		
		if (qtdJogadores <= 10) {
			
			this.qtdJogadores = qtdJogadores;
	
		}else {
			System.out.println("Quantidade máxima de jogadores atingida!!! ");
		}
	}

	public String getNome() {
		return nome;
	}



	public void setNome(String string) {
		this.nome = string;
	}

	public void ProcuraJogadorPeloNum(int procurado) {
		int aux = 0;
		for (Jogador jogador : team) {
			if(aux < 10) {
				if(jogador.getNumeroCamisa() == procurado) {
					System.out.println("Jogador " + jogador.getNome() + " encontrado. ");
					break;
				}
			}else {
				System.out.println("Jogador não encontrado verifique e tente novamente!");
				System.out.println("");
				break;
			}
			aux++;
		}
	}

	public void ProcuraJogadorPeloNome(String nome) {
		
	
		for (Jogador jogador : team) {
			if(jogador.getNome().equals(nome)) {
				System.out.println("Jogador " + jogador.getNome() + " camisa " + jogador.getNumeroCamisa() + " encontrado.");
				break;
			}else {
				System.out.println("Jogador não encontrado! ");
			}
		}

	}

	public void AdicionaJogador(int pos, Jogador ze) {

		if (pos < 10) { 

			team[pos] = ze;
			System.out.println("Digite o Nome do Jogador: ");
			ze.setNome(sc.nextLine());
			System.out.println("Digite o número da Camisa do Jogador: ");
			ze.setNumeroCamisa(Integer.parseInt(sc.nextLine()));
			System.out.println("Digite a posição do jogador: ");
			ze.setPosicao(sc.nextLine());
			System.out.println("Jogador Cadastrado com Sucesso! ");
			System.out.println("");
			for (int i = 0; i < 5; i++) {
				System.out.println("\n");

			}
		}
		else
		{
			System.out.println("Numero de Jogadores Excedido! ");
		}
	}

	public void CortaJogador() {

	}

	public void TrocaPos() {
		

	}

	public void Imprimir(int pos) {
		
		for (int i = 0; i < pos; i++) {

			System.out.println("Jogador " + team[i].getNome());

		}

	}
	
	//para facilitar os testes
	public int trapaca(Equipe t1, int pos) {
		
		for (int i = 0; i < 10; i++) {
			Jogador j1 = new Jogador();
			j1.setNome("Fabinho0" + i);
			j1.setNumeroCamisa(i);
			j1.setPosicao("AT" + i);
			t1.team[i] = j1;	
			pos++;
		}
		
		return pos;
	
	}
	
}

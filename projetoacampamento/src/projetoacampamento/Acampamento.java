package projetoacampamento;

public class Acampamento {

		
		public static class AcampamentoData {
		private String nome;
		private char equipe;
		private int idade;

		public AcampamentoData() {
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public char getEquipe() {
			return equipe;
		}

		public void setEquipe(char equipe) {
			this.equipe = equipe;
		}

		public int getIdade() {
			return idade;
		}

		public void setIdade(int idade) {
			this.idade = idade;
		}
	}


		AcampamentoData data = new AcampamentoData();



		//Métodos
		@Override
		public String toString() {
			StringBuilder str = new StringBuilder();
			str.append("Nome do membro: ").append(data.nome).append("\n");
			str.append("Idade: ").append(data.idade).append("\n");
			str.append("Equipe: ").append(data.equipe).append("\n");
			return str.toString();
			
		}
		
		
		
		
		
		public void imprimir()
		{
			System.out.println("Nome do aluno: " + data.getNome());
			System.out.println("Equipe do aluno: " + data.getEquipe());
			System.out.println("Idade do aluno: " + data.getIdade());
			System.out.println("");
		}
		
		
		public void separarGrupo()
		{
			//Lógica para responder o cenario vai aqui
			if(data.getIdade() <= 5 )
			{
				data.setEquipe(' ');
				return;
			}
			if(data.getIdade() <= 10 )
			{
				data.setEquipe('A');
				return;
			}
			if(data.getIdade() <= 20 )
			{
				data.setEquipe('B');
				return;
			}
			data.setEquipe('C');
			
		}
		
		
		

}

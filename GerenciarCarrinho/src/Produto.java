
public class Produto {
	private int id;
	private String nome;
	private double preco;
	
	//getters and setters
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public void imprimir() {
		System.out.println("Item: " + id + ", Descrição: " + nome );
		System.out.println("Valor do item R$ " + preco);
		System.out.println("-------------------------------------");
	}
	
}

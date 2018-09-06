
public class Computador {
	
	
	//Atributos
	String marca;
	String cor;
	String modelo;
	int numeroSerie;
	double preco;
	
	
	//Métodos
	
	public void imprimir() 
	{
		System.out.println("Marca: " + marca);
		System.out.println("Cor: " + cor);
		System.out.println("Modelo: " + modelo);
		System.out.println("Número: " + numeroSerie);
		System.out.println("Preço: " + preco);
		System.out.println("");
	}
	
	public void calcularValor()
	{
		if(this.marca.equalsIgnoreCase("HP")) // Utilizar para cadeia de caracteres.
		{
			this.preco *=  1.3;
		}
		if(this.marca.equalsIgnoreCase("IBM")) 
		{
			this.preco *=  1.5;
		}
	}
	
	
	public int alterarValor(int valor)
	{
		if(valor > 0) {
			
			this.preco = valor;
			return 1;
		}
		
		return 0;
		
	}
	
	
	

}

//import java.util.Scanner;

public class PrinicipalComputador {

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		
		Computador pc = new Computador();
		
		pc.marca = "HP";
		pc.cor = "BRANCO";
		pc.modelo = "XPS";
		pc.numeroSerie = 0002;
		pc.preco = 1500.00;
		
		pc.imprimir();
		pc.calcularValor();
		pc.imprimir();
		
		Computador pc1 = new Computador();
		
		pc1.marca = "IBM";
		pc1.cor = "PRETO";
		pc1.modelo = "WATSON";
		pc1.numeroSerie = 0003;
		pc1.preco = 2000.0;
		
		pc1.imprimir();
		pc1.calcularValor();
		pc1.imprimir();
		
		
		if(pc1.alterarValor(1200) == 1) {
			System.out.println("Valor alterado com sucesso ");
		}else {
			System.out.println("Valor não alterado");
		}
		
		pc1.imprimir();

	}

}

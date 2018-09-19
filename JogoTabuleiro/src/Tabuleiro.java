import java.util.Random;

public class Tabuleiro {
	public int matriz[][];
	public int palpite[];
	
	public Tabuleiro() {
		matriz = new int[10][10];
		palpite = new int[2];
		gerarTabuleiro();
	}
	
	private void gerarTabuleiro() {
		Random r = new Random();
		for (int i = 0; i < 10 ; i++) {
			for (int j = 0; j < 10; j++) {

				int g = r.nextInt(10);
				matriz[i][j]= g;
			}
		}
	}
	
	public double verificarPremio() {
		int cont=0;

		//varrer palpite
		for (int c = 0; c < 2; c++) {
			//Varrer a matriz a procura dos palpites
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 10; j++) {
					if(palpite[c] == matriz[i][j]) {
						cont++;
					}

				}

			}		
		}
		mostrarResultado();
		return cont * 1000.0;
	}
	
	public void mostrarResultado() {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.printf("%3D ", matriz[i][j]);
			}
			System.out.println(" ");
		}
	}
}





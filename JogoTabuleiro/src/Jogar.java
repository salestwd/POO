import java.util.Scanner;

public class Jogar {

	private static Scanner sc;

	public static void main(String[] args) {
		
        Tabuleiro t = new Tabuleiro();
        sc = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            System.out.println("Digite o palpite " + i+1);
            t.palpite[i] = Integer.parseInt(sc.nextLine());
        }
        double premio = t.verificarPremio();
        if(premio > 0){
            System.out.println("Você ganhou: " + premio);
        }else{
            System.out.println("Você é azarado");
        }

	}

}

package projetoacampamento;

import java.util.Scanner;

public class PrincipalAcapamento {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		
		Acampamento membro = new Acampamento();
		System.out.println("Digite o nome: ");
		membro.data.setNome(sc.nextLine());
		System.out.println("Digite a idade: ");
		membro.data.setIdade(Integer.parseInt(sc.nextLine()));
		
		membro.toString();
		
		membro.separarGrupo();
		
		membro.toString();
		
		
		
	}

}

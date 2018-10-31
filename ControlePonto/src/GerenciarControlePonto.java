import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class GerenciarControlePonto {

	public static void main(String[] args) throws InterruptedException {
		
		LocalDate data;
		
		Gerente jr = new Gerente();
		jr.setNome("Mateus");
		jr.setIdFunc(1);
		jr.setEmail("mateu@basf.com");
		jr.setDocumento("45145046880");
		jr.setLogin("salesDm");
		jr.setSenha("197346");
		
		Secretaria moca = new Secretaria();
		moca.setNome("Carla");
		moca.setIdFunc(2);
		moca.setEmail("carla@basf.com");
		moca.setDocumento("255.235.777-66");
		moca.setTelefone("1935490693");
		moca.setRamal("3178");
		
		Operador peao = new Operador();
		peao.setNome("Jailson");
		peao.setIdFunc(3);
		peao.setDocumento("324.456.698-00");
		peao.setEmail("jailson@basf.com");
		
		RegistroPonto rg = new RegistroPonto();
		rg.setFunc(jr);
		rg.setIdRegPonto(0);
		rg.setDataRegistro(LocalDate.now());
		rg.setHoraEntrada(LocalDateTime.now());
		
		rg.apresentarRegistroPonto();
		System.out.println("===========================================");
		
		Thread.sleep(1000);
		
		RegistroPonto rg1 = new RegistroPonto();
		rg1.setFunc(peao);
		rg1.setIdRegPonto(1);
		rg1.setDataRegistro(LocalDate.now());
		rg1.setHoraEntrada(LocalDateTime.now());
		
		rg1.apresentarRegistroPonto();
		System.out.println("===========================================");
		
		Thread.sleep(1000);
		
		RegistroPonto rg2 = new RegistroPonto();
		rg2.setFunc(peao);
		rg2.setIdRegPonto(1);
		rg2.setDataRegistro(LocalDate.now());
		rg2.setHoraEntrada(LocalDateTime.now());
		
		rg2.apresentarRegistroPonto();
		System.out.println("===========================================");
		
		Thread.sleep(3000);
		
		rg.setHoraSaida(LocalDateTime.now());
		rg.apresentarRegistroPonto();
		System.out.println("===========================================");
		
		Thread.sleep(1000);
		rg1.setHoraSaida(LocalDateTime.now());
		rg1.apresentarRegistroPonto();
		System.out.println("===========================================");
		
		Thread.sleep(1000);
		rg2.setHoraSaida(LocalDateTime.now());
		rg2.apresentarRegistroPonto();
		System.out.println("===========================================");
		
		

		
	}

}

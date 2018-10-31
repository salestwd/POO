import java.time.LocalDate;
import java.time.LocalDateTime;

public class RegistroPonto {
	
	private long idRegPonto;
	private Funcionario func = new Funcionario();
	private LocalDate dataRegistro;
	private LocalDateTime horaEntrada;
	private LocalDateTime horaSaida;
	
	
	public long getIdRegPonto() {
		return idRegPonto;
	}
	public void setIdRegPonto(long idRegPonto) {
		this.idRegPonto = idRegPonto;
	}
	public Funcionario getFunc() {
		return func;
	}
	public void setFunc(Funcionario func) {
		this.func = func;
	}
	public LocalDate getDataRegistro() {
		return dataRegistro;
	}
	public void setDataRegistro(LocalDate dataRegistro) {
		this.dataRegistro = dataRegistro;
	}
	public LocalDateTime getHoraEntrada() {
		return horaEntrada;
	}
	public void setHoraEntrada(LocalDateTime horaEntrada) {
		this.horaEntrada = horaEntrada;
	}
	public LocalDateTime getHoraSaida() {
		return horaSaida;
	}
	public void setHoraSaida(LocalDateTime horaSaida) {
		this.horaSaida = horaSaida;
	}
	
	public void apresentarRegistroPonto() {
		
		System.out.println("Nome funcion�rio: " + func.getNome() );
		System.out.println("Data Registro: " + dataRegistro);
		System.out.println("Hor�rio entrada: " + horaEntrada);
		System.out.println("Hor�rio entrada: " + horaSaida);
	}
}

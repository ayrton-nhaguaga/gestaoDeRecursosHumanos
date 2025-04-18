
public class DocenteTempoParcial extends Docente{
	private double valorHora;
	private double horasTrabalhadas;
	
	public DocenteTempoParcial (int id, String nome, String bi, String cargo, double salario, String dataAdmissao, String departamento, double valorHora, double horasTrabalhadas) {
		super(id, nome, bi,cargo,salario, dataAdmissao, departamento);
		this.valorHora = valorHora;
		this.horasTrabalhadas = horasTrabalhadas;
		this.salario = calcularSalario();
	}
	@Override
	public double calcularSalario() {
		return valorHora * horasTrabalhadas;
	}
	public double getValorHora() {
		return valorHora;
	}
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	public double getHorasTrabalhadas() {
		return horasTrabalhadas;
	}
	public void setHorasTrabalhadas(double horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}
	
	
}

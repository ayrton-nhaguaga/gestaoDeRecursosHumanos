
public class DocenteTempoIntegral extends Docente {
	private double salarioFixo;
	
	public DocenteTempoIntegral(int id, String nome, String bi, String cargo, double salario, String dataAdmissao, String departamento, double salarioFixo) {
		super(id, nome, bi,cargo,salario, dataAdmissao, departamento);
		this.salarioFixo = salarioFixo;
	}
	
	@Override
	public double calcularSalario() {
		return salarioFixo;
	}

	public double getSalarioFixo() {
		return salarioFixo;
	}

	public void setSalarioFixo(double salarioFixo) {
		this.salarioFixo = salarioFixo;
	}
	
}

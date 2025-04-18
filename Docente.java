
public abstract class Docente extends Funcionario {
	protected String departamento;
	public Docente (int id, String nome, String bi, String cargo, double salario, String dataAdmissao, String departamento) {
		super(id, nome, bi, cargo, salario, dataAdmissao);
		this.departamento = departamento;
	}
	public abstract double calcularSalario();
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
}


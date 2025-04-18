
public class TecnicoAdministrativo extends Funcionario {
	private String setor;
	
	public TecnicoAdministrativo(int id, String nome, String bi, String cargo, double salario, String dataAdmissao, String setor) {
		super(id, nome, bi, cargo, salario, dataAdmissao);
		this.setor = setor;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}
	
}

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
public class RhService {
	private List<Funcionario> funcionarios = new ArrayList<>();
	private int proximoId = 1;
	
	public Funcionario contratar(Funcionario funcionario) {
		funcionario.setId(proximoId++);
		funcionarios.add(funcionario);
		return funcionario;
	}
	
	public boolean demitir (int id) {
		return funcionarios.removeIf(f -> f.getId() == (id));
	}
	
	public Optional<Funcionario> pesquisarPorId(int id){
		return funcionarios.stream().filter(f -> f.getId() == (id)).findFirst();
	}
	
	public Optional<Funcionario> pesquisarPorBi(String bi){
		return funcionarios.stream().filter(f -> f.getBi().equals(bi)).findFirst();
	}
	
	public Optional<Funcionario> pesquisarPorNome(String nome){
		return funcionarios.stream().filter(f -> f.getNome().equals(nome)).findFirst();
	}
	
	public List<Funcionario> mostrarFuncionarios(){
		return funcionarios;
	}
}

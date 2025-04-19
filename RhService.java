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
	
	public boolean registrarFaltaPorId(int id, int quantidade) {
		Optional<Funcionario> funcionario = pesquisarPorId(id);
		if (funcionario.isPresent()) {
			funcionario.get().registrarFalta(quantidade);
			return true;
		}
		return false;
	}
	
	public boolean registrarFaltaPorNome(String nome, int quantidade) {
		Optional<Funcionario> funcionario = pesquisarPorNome(nome);
		if (funcionario.isPresent()) {
			funcionario.get().registrarFalta(quantidade);
			return true;
		}
		return false;
	}
	
	public boolean registrarFaltaPorBi(String bi, int quantidade) {
		Optional<Funcionario> funcionario = pesquisarPorNome(bi);
		if (funcionario.isPresent()) {
			funcionario.get().registrarFalta(quantidade);
			return true;
		}
		return false;
	}
	
	public void mostrarFaltasDeTodos() {
		if (funcionarios.isEmpty()) {
			System.out.println("Nenhum funcionario cadastrado.");
			return;
		}
		System.out.println("Faltas por funcionario: ");
		for (Funcionario f : funcionarios) {
			System.out.println("ID: "+f.getId()+" | Nome: "+f.getNome() + " | Faltas: "+f.getFaltas());
		}
	}
	
	public double calcularMediaFaltas() {
		if (funcionarios.isEmpty()) {
			return 0.0;
		}
		int totalFaltas = 0;
		for (Funcionario f : funcionarios) {
			totalFaltas += f.getFaltas();
		}
		return (double) totalFaltas / funcionarios.size();
		
	}
	
	public Optional<Funcionario> funcionarioComMaisFaltas() {
		return funcionarios.stream().max((f1, f2) -> Integer.compare(f1.getFaltas(), f1.getFaltas()));
	}
}

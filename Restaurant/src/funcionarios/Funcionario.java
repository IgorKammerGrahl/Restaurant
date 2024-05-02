package funcionarios;

public class Funcionario {
	private int id;
	private String nome;
	private String cargo;
	private String periodo;
	private Funcionario Prox;
	
	public Funcionario(int id, String nome, String cargo, String periodo) {
		this.id = id;
		this.nome = nome;
		this.cargo = cargo;
		this.periodo = periodo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public Funcionario getProx() {
		return Prox;
	}

	public void setProx(Funcionario prox) {
		Prox = prox;
	}
	
	
	
}

package cliente;

public class Cliente {
	private String nome;
	private String genero;
	private int id;
	private Cliente prox; 
	
	public Cliente(int id, String nome, String genero) {
		this.id = id;
		this.nome = nome;
		this.genero = genero;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public Cliente getProx() {
		return prox;
	}

	public void setProx(Cliente prox) {
		this.prox = prox;
	}
	
}

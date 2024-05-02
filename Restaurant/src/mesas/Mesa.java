package mesas;

public class Mesa {
	private int numero;
	private boolean disponivel = true;
	private int cadeiras = 0;
	private Mesa Prox;
	
	public Mesa(int numero) {
		this.numero = numero;
	}
	public boolean getDisponivel() {
		return disponivel;
	}
	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
	public Mesa getProx() {
		return Prox;
	}
	public void setProx(Mesa prox) {
		Prox = prox;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getCadeiras() {
		return cadeiras;
	}
	public void setCadeiras(int cadeiras) {
		this.cadeiras = cadeiras;
	}
	
	
}

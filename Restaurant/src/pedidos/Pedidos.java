package pedidos;

public class Pedidos {
	private int Numero;
	private String nomeConsumidor;
	private float valor1;
	private boolean realizado = false;
	private Pedidos Prox;
	
	public Pedidos(int numero, String nomeConsumidor) {
		this.Numero = numero;
		this.nomeConsumidor = nomeConsumidor;
		this.Prox = null;
	}

	public int getNumero() {
		return Numero;
	}

	public void setNumero(int numero) {
		Numero = numero;
	}
	
	public boolean getRealizado() {
		return realizado;
	}

	public void setRealizado(boolean realizado) {
		this.realizado = realizado;
	}

	public float getValor1() {
		return valor1;
	}

	public void setValor1(float valor1) {
		this.valor1 = valor1;
	}

	public String getNomeConsumidor() {
		return nomeConsumidor;
	}

	public void setNomeConsumidor(String nomeConsumidor) {
		this.nomeConsumidor = nomeConsumidor;
	}

	public Pedidos getProx() {
		return Prox;
	}

	public void setProx(Pedidos prox) {
		this.Prox = prox;
	}
	
	

}

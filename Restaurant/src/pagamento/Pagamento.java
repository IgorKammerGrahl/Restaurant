package pagamento;

public class Pagamento {
	private int codigo;
	private float valor;
	private float troco;
	private boolean pago = false;
	private Pagamento Prox;
	
	public Pagamento(int codigo, float valor) {
		this.codigo = codigo;
		this.valor = valor;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public Pagamento getProx() {
		return Prox;
	}
	public boolean getPago() {
		return pago;
	}
	public void setPago(boolean pago) {
		this.pago = pago;
	}
	public float getTroco() {
		return troco;
	}
	public void setTroco(float troco) {
		this.troco = troco;
	}
	public void setProx(Pagamento prox) {
		Prox = prox;
	}
	
	
}

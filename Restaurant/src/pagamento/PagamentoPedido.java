package pagamento;

import cliente.Cliente;

public class PagamentoPedido {
	private Pagamento inicio;
	
	public PagamentoPedido() {
		inicio = null;
	}
	
	public boolean vazia() {
		return inicio ==null;
	}
	
	public Pagamento getInicio() {
		return inicio;
	}
	
	public void inserirContas(int codigo, float valor) {
		Pagamento novoPagamento = new Pagamento(codigo, valor);
		if(!vazia())
			novoPagamento.setProx(inicio); 
		inicio = novoPagamento;
	}
	public void mostrarPedidos() {
		if(vazia()) {
			System.out.println("Lista vazia");
			return;
		}
		Pagamento aux = inicio;
		while(aux!=null) {
		 System.out.println("Pagamento: " + aux.getCodigo() + " | R$: " + aux.getValor());
		 aux = aux.getProx();
		}
		System.out.println();
	}
	
	public int pagarConta(int codigo, float pagamento, int pessoasAtendidas) {
		 if(vazia())return(pessoasAtendidas);
		  if(inicio.getCodigo()==codigo) {
			  float valorTotal = inicio.getValor();
			  inicio.setPago(true);
			  inicio.setTroco(pagamento - valorTotal);
			  System.out.println("Pagamento: " + inicio.getCodigo() + " | Troco: R$: " + inicio.getTroco());
			  pessoasAtendidas++;
			  return pessoasAtendidas++;
		  }
		Pagamento aux = inicio;
		 do {
			 if(aux.getCodigo() == codigo) {
				 float valorTotal = aux.getValor();
				 aux.setTroco(valorTotal - pagamento);
				 if(aux.getTroco() > 0) {
					 aux.setPago(true);
					 pessoasAtendidas++;
					 System.out.println("Pagamento: " + aux.getCodigo() + " | Troco: R$: " + aux.getTroco());
					 return pessoasAtendidas;
				 } else {
					 System.out.println("Vai lavar prato");
				 }
			 	} 
			 aux = aux.getProx();
		 }while (aux!=null);
		 	return(pessoasAtendidas++);
		}
	public void emissaoComprovante() {
		if(vazia())return;
		 Pagamento aux = inicio;
		  do {
			  if(aux.getPago() == true) {
					 System.out.println("Comprovante: " + aux.getCodigo() + " Valor total: R$:" + aux.getValor() + " Troco: R$:" + aux.getTroco());
			  }
			  aux=aux.getProx();
		  }while (aux!=null);
		 }
	public Pagamento getById(int id) {
		 Pagamento aux = inicio;
		 if(aux != null) {
		 do {
			 if(aux.getCodigo() == id) {
			 return aux;
			 }
			 aux=aux.getProx();
		 }while(aux!=null);
		 }
		 return null;
	 }
}


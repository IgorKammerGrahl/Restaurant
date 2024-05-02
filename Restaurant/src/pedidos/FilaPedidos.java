package pedidos;


public class FilaPedidos {
	private Pedidos inicio;
	
	public FilaPedidos() {
		inicio = null;
	}
	
	public boolean vazia() {
		return inicio ==null;
	}
	
	public Pedidos getInicio() {
		return inicio;
	}
	
	public void inserirPedidos(int numero, String nome) {
		Pedidos novoPedido = new Pedidos(numero, nome);
		if(!vazia())
			novoPedido.setProx(inicio); 
		inicio = novoPedido;
	}
	public void mostrarPedidos() {
		if(vazia()) {
			System.out.println("Lista vazia");
			return;
		}
		Pedidos aux = inicio;
		while(aux!=null) {
		 System.out.println("Pedido - " + aux.getNumero() + "| Nome- " + aux.getNomeConsumidor());
		 aux = aux.getProx();
		}
		System.out.println();
	}
	
	 public void deleteComNumero(int num, String nome) {
		  if(vazia())return;
		  if(inicio.getNumero()==num || inicio.getNomeConsumidor() == nome) {
			  inicio=inicio.getProx();
			  return;
		  }
		  Pedidos aux=inicio;
		  do {
			  if(aux.getProx().getNumero()==num || aux.getProx().getNomeConsumidor() == nome) {
				  aux.setProx(aux.getProx().getProx());
				  return;
			  }
			  aux=aux.getProx();
		  } while(aux != null); 		  
	  }
	 
	 public void alterarPedido(int num, String nome, int novo) {
		 if(vazia())return;
		  if(inicio.getNumero()==num || inicio.getNomeConsumidor() == nome) {
			  inicio.setNumero(novo);
			  return;
		  }
		  Pedidos aux=inicio;
		  do {
			  if(aux.getNumero()==num || aux.getNomeConsumidor() == nome) {
				  aux.setNumero(novo);
				  return;
			  }
			  aux=aux.getProx();
		  }while(aux != null);
	 }
	public void pedidoFeito(int num, String nome) {
		if(vazia()) {
			System.out.println("A lista está vazia");
			return;
		}
		if(inicio.getNumero() == num || inicio.getNomeConsumidor() == nome) {
			inicio.setRealizado(true);
			return;
		}
		Pedidos aux=inicio;
		do {
			if(aux.getNumero() == num || aux.getNomeConsumidor() == nome) {
				aux.setRealizado(true);
				System.out.println("Pedido " + aux.getNumero() + " Feito");
				return;
			}
			aux=aux.getProx();
		}while(aux!=null);
	}
	public void verificarPedidos() {
		if(vazia()) {
			System.out.println("Nenhum Pedido");
		}
		Pedidos aux=inicio;
		do {
			System.out.println(aux.getNomeConsumidor() + "Pedido " + aux.getNumero() + "| Status: " + aux.getRealizado());
			aux=aux.getProx();
		}while(aux!=null);
	}

	public void mostrarContaCliente(String nome) {
		if(vazia()) {
			System.out.println("Lista vazia");
			return;
		}
		Pedidos aux = inicio;
		while(aux!=null) {
			if(aux.getNomeConsumidor().contains(nome)) {
		 System.out.println("Pedido - " + aux.getNumero() + "| Nome- " + aux.getNomeConsumidor());
		 aux = aux.getProx();
			}
		}
		System.out.println();
	}
	
}
	
		


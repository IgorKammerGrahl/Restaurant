package cliente;

public class ClientesRestaurante {
	private Cliente inicio;
	
	public ClientesRestaurante() {
		inicio = null;
	}
	
	public boolean vazia() {
		return inicio ==null;
	}
	
	public Cliente getInicio() {
		return inicio;
	}
	
	public int inserirInicio(int id, String nome, String genero, int filaAlmocar) {
		Cliente novoCliente = new Cliente(id, nome, genero);
		if(!vazia())
		novoCliente.setProx(inicio); 
		inicio = novoCliente;
		filaAlmocar++;
		return filaAlmocar;
	}
	
	public void mostrarLista() {
		if(vazia()) {
			System.out.println("Lista vazia");
			return;
		}
		Cliente aux = inicio;
		while(aux!=null) {
		 System.out.println(aux.getId() + "|" + aux.getNome() + "|" + aux.getGenero() + "|");
		 aux = aux.getProx();
		}
		System.out.println();
	}
	 public void deleteComId(int id) {
		  if(vazia())return;
		  if(inicio.getId()==id) {
			  inicio=inicio.getProx();
			  return;
		  }
		  Cliente aux=inicio;
		  do {
			  if(aux.getProx().getId()==id) {
				  aux.setProx(aux.getProx().getProx());
				  return;
			  }
			  aux=aux.getProx();
		  } while(aux != null); 		  
	  }
	 public void alterarComId(int id, String nome, String genero) {
		 if(vazia())return;
		  if(inicio.getId()==id) {
			  inicio.setNome(nome);
			  inicio.setGenero(genero);
			  return;
		  }
		  Cliente aux=inicio;
		  do {
			  if(aux.getProx().getId()==id) {
				  aux.setNome(nome);
				  aux.setGenero(genero);
				  return;
			  }
			  aux=aux.getProx();
		  }while(aux != null);
	 }
	 public int getTamanho() {
		 int contador = 0;
		 Cliente aux=inicio;
		 do {
			 contador++;
			 aux=aux.getProx();
		 }while(aux!=null);
		 return contador;
	 } 
	 public Cliente getById(int id) {
		 Cliente aux = inicio;
		 do {
			 if(aux.getId() == id) {
			 return aux;
			 }
			 aux=aux.getProx();
		 }while(aux!=null);
		 return null;
	 }
}

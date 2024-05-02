package funcionarios;

public class FuncionariosRestaurant {
private Funcionario inicio;
	
	public FuncionariosRestaurant() {
		inicio = null;
	}
	
	public boolean vazia() {
		return inicio ==null;
	}
	
	public Funcionario getInicio() {
		return inicio;
	}
	
	public void cadastrarFuncionario(int id, String nome, String cargo, String periodo) {
		Funcionario novoFuncionario = new Funcionario(id, nome, cargo, periodo);
		if(!vazia())
			novoFuncionario.setProx(inicio); 
		inicio = novoFuncionario;
	}
	
	public void mostrarLista() {
		if(vazia()) {
			System.out.println("Lista vazia");
			return;
		}
		Funcionario aux = inicio;
		while(aux!=null) {
		 System.out.println(aux.getId() + "|" + aux.getNome() + "|" + aux.getCargo() + "|" + aux.getPeriodo());
		 aux = aux.getProx();
		}
		System.out.println();
	}
	 public void deletarComId(int id) {
		  if(vazia())return;
		  if(inicio.getId()==id) {
			  inicio=inicio.getProx();
			  return;
		  }
		  Funcionario aux=inicio;
		  do {
			  if(aux.getProx().getId()==id) {
				  aux.setProx(aux.getProx().getProx());
				  return;
			  }
			  aux=aux.getProx();
		  } while(aux != null); 		  
	  }
	 
	 public void alterarComId(int id, String cargo) {
		 if(vazia())return;
		  if(inicio.getId()==id) {
			  inicio.setCargo(cargo);
			  return;
		  }
		  Funcionario aux=inicio;
		  do {
			  if(aux.getProx().getId()==id) {
				  aux.setCargo(cargo);
				  return;
			  }
			  aux=aux.getProx();
		  }while(aux != null);
	 }
}

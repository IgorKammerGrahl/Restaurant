package mesas;


public class MesasRestaurante {
private Mesa inicio;
	
	public MesasRestaurante() {
		inicio = null;
	}
	
	public boolean vazia() {
		return inicio ==null;
	}
	
	public Mesa getInicio() {
		return inicio;
	}
	
	public void inserirMesas(int numero ) {
		Mesa novaMesa = new Mesa(numero);
		if(!vazia())
			novaMesa.setProx(inicio); 
		inicio = novaMesa;
	}
	public void mostrarMesas() {
		if(vazia()) {
			System.out.println("Lista vazia");
			return;
		}
		Mesa aux = inicio;
		while(aux!=null) {
		 System.out.println("Mesa: |" + aux.getNumero() + "|");
		 aux = aux.getProx();
		}
		System.out.println();
	}
	
	public int ocuparMesa(int escolha, int pessoasAlmocando) {
		  Mesa aux=inicio;
		  do {
			  if(aux.getNumero()==escolha) {
				  if(aux.getCadeiras() <= 4) {
				  aux.setDisponivel(false);
				  pessoasAlmocando++;
				  aux.setCadeiras(aux.getCadeiras()+1);
				  return pessoasAlmocando;
				  } else {
					  System.out.println("Mesa cheia, purfavor escolha outra");
				  }
			  }
			  aux=aux.getProx();
		  } while(aux != null);
		  return pessoasAlmocando;
	  }
	
	public int mesaDesocupar(int escolha, int filaCaixa) {
		Mesa aux=inicio;
		 do {
			  if(aux.getNumero()==escolha) {
				  if(aux.getDisponivel() == false) {
				  aux.setDisponivel(true);
				  filaCaixa++;
				  aux.setCadeiras(0);
				  return filaCaixa;
				  }
			  }
			  aux=aux.getProx();
		  } while(aux != null); 
		 return filaCaixa;
 	}
	
	public void verificacao() {
		int mesaDis = 0;
		int mesaOcu = 0;
		
		Mesa aux=inicio;
		do {
			if(aux.getDisponivel() == false) {
				mesaOcu++;
			}else {
				mesaDis++;
			}
			aux=aux.getProx();
		} while(aux != null);
		System.out.println("Mesas Disponiveis: " + mesaDis + "| Mesas Ocupadas: " + mesaOcu);
	}	

	}





package main;

import cliente.ClientesRestaurante;
import funcionarios.FuncionariosRestaurant;
import mesas.MesasRestaurante;
import pagamento.PagamentoPedido;
import pedidos.FilaPedidos;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		ClientesRestaurante clientes = new ClientesRestaurante();
		FuncionariosRestaurant funcionarios = new FuncionariosRestaurant();
		MesasRestaurante mesas = new MesasRestaurante();
		PagamentoPedido pagamentos = new PagamentoPedido();
		FilaPedidos pedidos = new FilaPedidos();
		
		funcionarios.cadastrarFuncionario(1242424, "Mario", "Cozinheiro", "Matutino");
		funcionarios.cadastrarFuncionario(4535343, "Luigi", "Cozinheiro", "Matutino");
		funcionarios.cadastrarFuncionario(2142425, "Luis", "Cozinheiro", "Vespertino");
		funcionarios.cadastrarFuncionario(2425217, "Marcelo", "Cozinheiro", "Vespertino");
		funcionarios.cadastrarFuncionario(7453421, "Maiara", "Garçon", "Matutino");
		funcionarios.cadastrarFuncionario(8362144, "Linguini", "Garçon", "Matutino");
		funcionarios.cadastrarFuncionario(9726000, "Isadora", "Garçon", "Vespertino");
		funcionarios.cadastrarFuncionario(2397439, "Salami", "Garçon", "Vespertino");
		funcionarios.cadastrarFuncionario(1232555, "Waluigi", "Caixa", "Vespertino");
		funcionarios.cadastrarFuncionario(9467324, "Giorno", "Caixa", "Vespertino");
		funcionarios.cadastrarFuncionario(2324243, "Wario", "Gerente", "Integral");
		mesas.inserirMesas(1);
		mesas.inserirMesas(2);
		mesas.inserirMesas(3);
		mesas.inserirMesas(4);
		mesas.inserirMesas(5);
		
		int restaurante = 1;
		
		int filaAlmocar = 0;
		
		int pessoasAlmocando = 0;
		
		int filaCaixa = 0;
		
		int pessoasAtendidas = 0;
				
		while(restaurante != 0) {
			System.out.println("Bem vindo ao sistema oficial do Restaurant");
			
			do {
				System.out.println("|1| Clientes");
				System.out.println("|2| Pedidos");
				System.out.println("|3| Mesas");
				System.out.println("|4| Funcionarios");
				System.out.println("|5| Gestão");
				System.out.println("|6| Pagamentos");
				System.out.println("|7| Estatistica");
				System.out.println("|0| Sair do sistema");
				restaurante = entrada.nextInt();
					if(restaurante < 0 || restaurante > 7)
						System.out.println("Entrada inválida");
				
			}while(restaurante < 0 || restaurante > 7);
			
			System.out.println();
			
			if(restaurante == 1) {
				
				int opcao = 1;
				
				while(opcao != 0) {
					System.out.println("Você está na sessão Cliente");
					
					do {
						System.out.println("|1| Cadastrar novo Cliente");
						System.out.println("|2| Remover Cliente");
						System.out.println("|3| Atualizar Cliente");
						System.out.println("|4| Consultar Clientes registrados");
						System.out.println("|0| Voltar");
						opcao = entrada.nextInt();
						if(opcao < 0 || opcao > 4)
							System.out.println("Entrada inválida");
					}while(opcao < 0 || opcao > 4);
					
					System.out.println();
					
					if(opcao == 1) {
						
						System.out.println("Por favor, insira o id");
						int id = entrada.nextInt();
						entrada.nextLine();
						System.out.println("Por favor, insira seu nome");
						String nome = entrada.nextLine();
						
						System.out.println("Por faovr, insira seu genero");
						String genero = entrada.nextLine();
						
						clientes.inserirInicio(id, nome, genero, filaAlmocar);
						filaAlmocar++;
					}
					System.out.println();
					
					if(opcao == 2) {
						
						System.out.println("Insira o id para deletar o cliente ");
						int id = entrada.nextInt();
							if(clientes.getById(id) != null) {
								clientes.deleteComId(id);
								filaAlmocar--;
								
							}else {
								System.out.println("Não existe esse id");
							}
					}
					System.out.println();
					
					if(opcao == 3) {
						
						System.out.println("Insira seu id para atualizar");
						int id = entrada.nextInt();
							if (clientes.getById(id) != null) {
								entrada.nextLine();
								System.out.println("Escreva o novo nome");
								String novoNome = entrada.nextLine();
								
								System.out.println("Escreva seu novo genero");
								String novoGenero = entrada.nextLine();
								
								clientes.alterarComId(id, novoNome, novoGenero);
							}else {
								System.out.println("Não existe esse id");

							}
					}
					System.out.println();
					
					if(opcao == 4) {
						
						System.out.println("Lista de Cadastrados");
						
						clientes.mostrarLista();
					}
				}
				
			}
			else if (restaurante == 2) {
				int opcao = -1;
				
				while (opcao != 0) {
					System.out.println("Você está na sessão de pedidos");
					
					do {
						System.out.println("|1| Fazer um pedido");
						System.out.println("|2| Alterar um pedido");
						System.out.println("|3| Cancelar um pedido");
						System.out.println("|4| Consultar pedidos realizados");
						System.out.println("|0| Voltar");
						opcao = entrada.nextInt();
						if(opcao < 0 || opcao > 4)
							System.out.println("Entrada inválida");
					}while(opcao <0 || opcao >4);
					
					System.out.println();
					
					if(opcao == 1) {
						System.out.println("------------------------------");
						System.out.println("|                            |");
						System.out.println("| 1.Strognoff  R$:15.00      |");
						System.out.println("| 2.Macarrao   R$:20.00      |");
						System.out.println("| 3.Feijoada   R$:25.00      |");
						System.out.println("| 4.Salada caeser R$:10.00   |");
						System.out.println("| 5.Suco de Hortela r$:7.00  |");
						System.out.println("|                            |");
						System.out.println("| Restaurant                 |");
						System.out.println("------------------------------");
						System.out.println();
						System.out.println("O que você gostaria de pedir?");
						int pedido = entrada.nextInt();
						entrada.nextLine();
						System.out.println("Qual o seu nome?");
						String nome = entrada.nextLine();
								pedidos.inserirPedidos(pedido, nome);

					}
					System.out.println();
					 if(opcao == 2) {
						 System.out.println("Qual o seu nome?");
						 String nome = entrada.nextLine();
						 entrada.nextLine();
						 System.out.println("Qual pedido você gostaria de alterar?");
						 int pedido = entrada.nextInt();
						 System.out.println("Por qual outro prato?");
						 int novoPedido = entrada.nextInt();
						
						pedidos.alterarPedido(pedido, nome, novoPedido);
					}
					System.out.println();
					 if(opcao == 3) {
						System.out.println("Qual pedido você gostaria de remover?");
						int pedido = entrada.nextInt();
						entrada.nextLine();
						System.out.println("Qual o nome do cliente?");
						String nome = entrada.nextLine();
						pedidos.deleteComNumero(pedido, nome);
					}
					System.out.println();
					if(opcao == 4) {
						System.out.println("Lista de pedidos");
						pedidos.mostrarPedidos();
					}
				}
			}
			else if(restaurante == 3) {
				int opcao = -1;
				
				while (opcao != 0) {
					System.out.println("Você está na sessão de mesas");
					
					do {
						System.out.println("|1| Pegar uma mesa");
						System.out.println("|2| Liberar uma mesa");
						System.out.println("|3| Ver mesas disponiveis");
						System.out.println("|0| Voltar");
						opcao = entrada.nextInt();
						if(opcao < 0 || opcao > 3)
							System.out.println("Entrada inválida");
					}while(opcao <0 || opcao >3);
					
					System.out.println();
					
					if(opcao == 1) {
						System.out.println("Em qual mesa gostaria de sentar?");
						int escolha = entrada.nextInt();
						mesas.ocuparMesa(escolha, pessoasAlmocando);
						pessoasAlmocando++;
						filaAlmocar--;
						System.out.println();
					}
					if(opcao == 2) {
						System.out.println("Qual mesa livrar?");
						int escolha = entrada.nextInt();
						mesas.mesaDesocupar(escolha, filaCaixa);
						filaCaixa++;
						pessoasAlmocando--;
					}
					if(opcao == 3) {
						mesas.verificacao();
					}
					System.out.println();
			}
		}
			else if(restaurante == 4) {
				int opcao = -1;
				
				while (opcao != 0) {
					System.out.println("Você está na sessão de funcionarios");
					
					do {
						System.out.println("|1| Cadastrar novo funcionario");
						System.out.println("|2| Remover funcionario");
						System.out.println("|3| Escala do funcionario");
						System.out.println("|4| Consultar funcionarios");
						System.out.println("|0| Voltar");
						opcao = entrada.nextInt();
						if(opcao < 0 || opcao > 4)
							System.out.println("Entrada inválida");
					}while(opcao <0 || opcao >4);
					
					System.out.println();
			
				if(opcao == 1) {
					System.out.println("Vamos te cadastrar como um de nossos funcionarios");
					System.out.println("Insira seu id");
					int id = entrada.nextInt();
					entrada.nextLine();
					System.out.println("Agora insira seu nome");
					String nome = entrada.nextLine();
					System.out.println("Agora escolha se você quer o turno matutino ou vespertino");
					String turno = entrada.nextLine();
					
					funcionarios.cadastrarFuncionario(id, nome, nome, turno);
				}
				System.out.println();
				if(opcao == 2) {
					System.out.println("Remover o funcionarios pelo seu id");
					int id = entrada.nextInt();
					funcionarios.deletarComId(id);
				}
				if(opcao == 3) {
					System.out.println("Insira o id para poder alterar o cargo do funciuonario");
					int id = entrada.nextInt();
					entrada.nextLine();
					System.out.println("Insira o novo cargo desse funcionario: ");
					String novoCargo = entrada.nextLine();
					funcionarios.alterarComId(id, novoCargo);
				}
				System.out.println();
				if(opcao == 4) {
						System.out.println("Lista de Funcionarios");
						funcionarios.mostrarLista();
				}
				}
				System.out.println();
			}
			else if(restaurante == 5) {
				int opcao = -1;
				
				while (opcao != 0) {
					System.out.println("Você está na sessão de Gestão");
					
					do {
						System.out.println("|1| Preparacao e entrega de pedidos");
						System.out.println("|2| Verificar pedidos");
						System.out.println("|3| Fechamento de conta");
						System.out.println("|0| Voltar");
						opcao = entrada.nextInt();
						if(opcao < 0 || opcao > 3)
							System.out.println("Entrada inválida");
					}while(opcao <0 || opcao >3);
					
					System.out.println();
			
					if(opcao == 1) {
						System.out.println("Escolha um pedido para os cozinheiros prepararem e entregarem");
						int pedido = entrada.nextInt();
						entrada.nextLine();
						System.out.println("Para quem é? ");
						String nome = entrada.nextLine();
						pedidos.pedidoFeito(pedido, nome);
					}
					System.out.println();
					if(opcao == 2) {
						System.out.println("Lista dos pedidos");
						pedidos.verificarPedidos();
					}
					System.out.println();
					if(opcao == 3) {
						System.out.println("Você esta fazendo a conta do cliente, insira o codigo da conta");
						int codigo = entrada.nextInt();
						System.out.println("------------------------------");
						System.out.println("|                            |");
						System.out.println("| 1.Strognoff  R$:15.00      |");
						System.out.println("| 2.Macarrao   R$:20.00      |");
						System.out.println("| 3.Feijoada   R$:25.00      |");
						System.out.println("| 4.Salada caeser R$:10.00   |");
						System.out.println("| 5.Suco de Hortela r$:7.00  |");
						System.out.println("|                            |");
						System.out.println("| Restaurant                 |");
						System.out.println("------------------------------");
						System.out.println();
						System.out.println("Qual o nome do cliente?");
						String nome = entrada.nextLine();
						pedidos.mostrarContaCliente(nome);
						entrada.nextLine();
						System.out.println("Agora insira o valor total");
						float valor = entrada.nextFloat();
						pagamentos.inserirContas(codigo, valor);	
					}
				}
			}
			else if(restaurante == 6) {
				int opcao = -1;
				
				while (opcao != 0) {
					System.out.println("Pagamento");
					
					do {
						System.out.println("|1| Pagar uma conta");
						System.out.println("|2| Historicos de comprovantes");
						System.out.println("|0| Voltar");
						opcao = entrada.nextInt();
						if(opcao < 0 || opcao > 3)
							System.out.println("Entrada inválida");
					}while(opcao <0 || opcao >3);
					
					System.out.println();
					
					if(opcao == 1) {
						System.out.println("Para pagar sua conta, purfavor fale o codigo do pedido");
						int codigoPedido = entrada.nextInt();
						if(pagamentos.getById(codigoPedido) != null) {
							System.out.println("Aceitamos apenas dinheiro ainda, quanto você irá pagar?");
							float pagamento = entrada.nextFloat();
							pagamentos.pagarConta(codigoPedido, pagamento, pessoasAtendidas);
							pessoasAtendidas++;
							filaCaixa--;
						} else {
							System.out.println("Essa conta não existe");
						}
					}
					System.out.println();
					
					if(opcao == 2) {
						System.out.println("Todos os comprovantes até agora");
						pagamentos.emissaoComprovante();
					}
				}
			}	
			else if(restaurante == 7) {
				int opcao = -1;
				
				while (opcao != 0) {
					System.out.println("Você está na sessão de Estatisticas");
					
					do {
						System.out.println("|1| Estatistica de pessoas na fila para almoçar");
						System.out.println("|2| Numero de pessoas na fila do caixa");
						System.out.println("|3| Numero de pessoas na fila almoçando");
						System.out.println("|4| Numero de pessoas atendidas no restaurante");
						System.out.println("|0| Voltar");
						opcao = entrada.nextInt();
						if(opcao < 0 || opcao > 4)
							System.out.println("Entrada inválida");
					}while(opcao <0 || opcao >4);
					
					System.out.println();
			
					if(opcao == 1) {
						if(filaAlmocar < 0) {
							filaAlmocar = 0;
						}else {	
						}
						System.out.println("Numero de pessoas para almoçar são: " + filaAlmocar);
						}
						
					System.out.println();
					
					if(opcao == 2) {
						if(filaCaixa < 0) {
							filaCaixa = 0;
							}else {
						System.out.println("Numero de pessoas no caixa são: " + filaCaixa);
							}
					}
					System.out.println();
					
					if(opcao == 3) {
						if(pessoasAlmocando < 0) {
							pessoasAlmocando = 0;
						}else {
						System.out.println("Numero de pessoas almoçando são: " + pessoasAlmocando);
						}
					}
					System.out.println();
					
					if(opcao == 4) {
						if(pessoasAtendidas < 0) {
							pessoasAtendidas = 0;
						}else {
							
						System.out.println("Numero de pessoas atendidas em nosso estabelecimento: " + pessoasAtendidas);
						}
					
					}
				}
		}
				
			
		
		
		
		}


	}
}


	
		
	



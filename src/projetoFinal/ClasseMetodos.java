package projetoFinal;

import javax.swing.JOptionPane;

public class ClasseMetodos {

	public Cliente[] CadastrarCliente(Cliente[] cadasCliente) {
// o nome e endereço do cliente para inserir na nota final
		String parar = "";
		int i = 0;
		while (!parar.equalsIgnoreCase("sim")) {
			cadasCliente[i].nome = JOptionPane.showInputDialog(null, "Digite o nome  do cliente: ", "Entrada de dados",
					JOptionPane.INFORMATION_MESSAGE);
			cadasCliente[i].endereco = JOptionPane.showInputDialog(null, "Digite o endereço do cliente: ",
					"Entrada de dados", JOptionPane.INFORMATION_MESSAGE);
			parar = JOptionPane.showInputDialog(null, "Finalizar (sim/nao); ", "Entrada de dados",
					JOptionPane.INFORMATION_MESSAGE);
			i++;
		}

		return cadasCliente;
	}

	public CarrinhoCompras[] RealizarVenda(CarrinhoCompras[] lista) {

		int opc = 0;
		while (opc != 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog(null, " 1 - Iniciar Carrinho ; \n 2 - Consultar produtos do catálogo"
					+ " \n 3 - Cadastrar produto no catálogo. \n 9 - Finalizar"));
			switch (opc) {
			case 1:
				IniciarVenda(lista);
				break;
			case 2:
				ConsultaCat();// acho que não precis na opção acima já fz isso
				break;
			case 3:
				DefinirCatalogo(); // não sei o que você quer fazer aqui
				break;

			case 9:
				JOptionPane.showMessageDialog(null, "Obrigado por utilizar");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida");
			}
		}
		return lista;
	}

	private CarrinhoCompras[] IniciarVenda(CarrinhoCompras[] lista) {

		int opc = 0;
		while (opc != 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog(null, "CATALAGO DE PRODUTOS \n 1 - Frutas \n 2 - Legumes e Verduras \n 9 - Finalizar"));

			switch (opc) {
			case 1:
				lista = catalogoFrutasPronto(lista);
				break;
			case 2:
				lista = CatalogoLeguVerPronto(lista);
				break;
			case 9:
				JOptionPane.showMessageDialog(null, "Finalizando Carrinho");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção Invalida");
				
			}
		}
		return lista;

		// continuar chamando outro switch case com as opções frutas e verduras depois
		// mostrar todas opções e ir chamando as funções para calculo.

	}

	private CarrinhoCompras[] catalogoFrutasPronto(CarrinhoCompras[] lista) {
		ClasseCarrinho carrinho = new ClasseCarrinho();
		int opc = -1; //coloquei -1, pq o 9 e o 0 estão sendo usado
		int i = 0;
		while(opc != 0) {
			opc = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a fruta e a sua quantidade ou 0 para terminar"
					+ "\n 1 - Banana: valor = R$ 3.99 Kg"
					+ "\n 2 - Maça: valor: R$ 0.50 a unidade"
					+ "\n 3 - Laranja: valor = R$ 4.00 Kg "
					+ "\n 4 - Abacaxi: valor = R$ 5.00 Kg"
					+ "\n 5 - Mamão: valor = R$ 2.00 Unidade"
					+ "\n 6 - Morango: valor = R$ 5.00 Caixa"
					+ "\n 7 - Melão: valor = R$ 6.00 unidade"
					+ "\n 8 - Melância: valor = R$ 10.00 unidade"
					+ "\n 9 - Manga: valor = R$ 2.00 unidade"
					+ "\n 10 - Limão: valor = R$ 3.49 Kg"));
				switch (opc) {
				case 1:case 2:case 3:case 4:case 5:case 6:case 7:case 8:case 9:case 10:
					lista = carrinho.SomarValoresFrutas(lista, opc, i);
					break;
				case 0:
					JOptionPane.showMessageDialog(null, "Finalizando carrinho");
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opção invalida");
				}
				i ++;
		}
		return lista;
		
//		catalogoFrutas[0].nome = "Banana";
//		catalogoFrutas[0].preco = 3.99; // por kg
//		catalogoFrutas[1].nome = "Maçã";
//		catalogoFrutas[1].preco = 0.50; // por unidade
//		catalogoFrutas[2].nome = "Laranja";
//		catalogoFrutas[2].preco = 4.00; //duzia
//		catalogoFrutas[3].nome = "Abacaxi";
//		catalogoFrutas[3].preco = 5;
//		catalogoFrutas[4].nome = "Mamão";
//		catalogoFrutas[4].preco = 2; //unidade
//		catalogoFrutas[5].nome = "Morango";
//		catalogoFrutas[5].preco = 5;
//		catalogoFrutas[6].nome = "Melão";
//		catalogoFrutas[6].preco = 6;
//		catalogoFrutas[7].nome = "Melância";
//		catalogoFrutas[7].preco = 9.99;
//		catalogoFrutas[8].nome = "Manga";
//		catalogoFrutas[8].preco = 2;
//		catalogoFrutas[9].nome = "Limão";
//		catalogoFrutas[9].preco = 0.39;
//
	

	}

	private CarrinhoCompras[] CatalogoLeguVerPronto(CarrinhoCompras[] lista) {
//Fazer parecido com as opções das frutas instancia mais uma Classe carrinhos
		
		ClasseCarrinho carrinho = new ClasseCarrinho();
		int opc = -1; //coloquei -1, pq o 9 e o 0 estão sendo usado
		int i = 0;
		while(opc != 0) {
			opc = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a fruta e a sua quantidade ou 0 para terminar"
					+ "\n 1 - Banana: valor = R$ 3.99 Kg"
					+ "\n 2 - Maça: valor: R$ 0.50 a unidade"
					+ "\n 3 - Laranja: valor = R$ 4.00 Kg "
					+ "\n 4 - Abacaxi: valor = R$ 5.00 Kg"
					+ "\n 5 - Mamão: valor = R$ 2.00 Unidade"
					+ "\n 6 - Morango: valor = R$ 5.00 Caixa"
					+ "\n 7 - Melão: valor = R$ 6.00 unidade"
					+ "\n 8 - Melância: valor = R$ 10.00 unidade"
					+ "\n 9 - Manga: valor = R$ 2.00 unidade"
					+ "\n 10 - Limão: valor = R$ 3.49 Kg"));
				switch (opc) {
				case 1:case 2:case 3:case 4:case 5:case 6:case 7:case 8:case 9:case 10:
					lista = carrinho.SomarValoresverLeg(lista, opc, i);
					break;
				case 0:
					JOptionPane.showMessageDialog(null, "Finalizando carrinho");
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opção invalida");
				}
				i ++;
		}
		
//		compra[0].nome = "Alface Crespa";
//		compra[0].preco = 4.99;
//		compra[1].nome = "Alface Americana";
//		compra[1].preco = 5.99;
//		compra[2].nome = "Brócolis";
//		compra[2].preco = 6;
//		compra[3].nome = "Beterraba"; // em rama
//		compra[3].preco = 6;
//		compra[4].nome = "Batata Doce"; // 200g
//		compra[4].preco = 2;
//		compra[5].nome = "Cebola"; // 500g
//		compra[5].preco = 5;
//		compra[6].nome = "Cenoura"; // 500g
//		compra[6].preco = 5;
//		compra[7].nome = "Couve";
//		compra[7].preco = 5.50;
//		compra[8].nome = "Mandioquinha";
//		compra[8].preco = 6; // 500g;
//		compra[9].nome = "Repolho";
//		compra[9].preco = 4.50;

		return lista;
	}

	private void ConsultaCat() {
		// TODO Auto-generated method stub

	}

	private void DefinirCatalogo() {
		// TODO Auto-generated method stub

	}

}

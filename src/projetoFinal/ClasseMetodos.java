package projetoFinal;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class ClasseMetodos {
	static boolean pagou = false;

	public Cliente[] CadastrarCliente(Cliente[] cadasCliente) {
		// o nome e endereço do cliente para inserir na nota final
		String parar = "";
		int i = 0;
		while (!parar.equalsIgnoreCase("sim")) { // só irá parar de chamar o preenchimento do BD se colocarmos "sim"
			cadasCliente[i].nome = JOptionPane.showInputDialog(null, "Digite o nome  do cliente: ", "Entrada de dados",
					JOptionPane.INFORMATION_MESSAGE);
			cadasCliente[i].endereco = JOptionPane.showInputDialog(null, "Digite o endereço do cliente: ",
					"Entrada de dados", JOptionPane.INFORMATION_MESSAGE);
			parar = JOptionPane.showInputDialog(null, "Finalizar (Sim/Não); ", "Entrada de dados",
					JOptionPane.INFORMATION_MESSAGE);
			i++;
			if (i == 10) {
				JOptionPane.showMessageDialog(null,
						"Banco de dados completo, caso continue irá sobreescrever os dados anteriores.");
				parar = JOptionPane.showInputDialog(null, "Finalizar (Sim/Não); ", "Entrada de dados",
						JOptionPane.INFORMATION_MESSAGE);
			}
		}

		return cadasCliente;
	}

	public CarrinhoCompras[] RealizarVenda(CarrinhoCompras[] lista, Cliente[] cadasCliente)
			throws IOException, InterruptedException { // Menu para realizar a venda.
		double total = 0;

		int opc = -1;
		while (opc != 0) {
			opc = Integer.parseInt(
					JOptionPane.showInputDialog(null, " 1 - Iniciar Carrinho ; \n 2 - Consultar total da compra"
							+ " \n 3 - Escolher Forma de pagamento \n 4 - Gerar Nota fiscal. \n\n 0 - Voltar \n 9 - Finalizar Programa"));
			switch (opc) {
			case 1: // Inicia o carrinho de compras
				lista = IniciarVenda(lista);
				total = somaParcial(lista);
				break;
			case 2: // Mostra o total da compra no console
				DecimalFormat fmt = new DecimalFormat();
				fmt.applyPattern("R$ #,##0.00");
				total = somaParcial(lista);// atualizei para a soma parcial
				JOptionPane.showMessageDialog(null, "O Total da compra é R$ " + fmt.format(total));
				break;
			case 3: // Abre o menu de pagamento
				
				if (pagou == false) {
					total = escolhaPagamento(total);
					pagou = true;
				} else {
					JOptionPane.showMessageDialog(null, "Pagamento já foi realizado");
				}
				break;
			case 4: // Gera o arquivo físico com os dados da compra
				if (pagou == true) {
					GerarNotaFiscal(lista, total, cadasCliente); // Inseri todos os dados de vendas em um arquivo.txt
																	// para poder imprimir e entregar para o cliente
				} else {
					JOptionPane.showMessageDialog(null, "Pagamento não foi realizado");
				}
				break;

			case 0:
				; // Volta para o menu anterior
				break;

			case 9:
				JOptionPane.showMessageDialog(null, "Obrigado por utilizar a aplicação"); // Finaliza a aplicação
				System.exit(0);
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida");
			}
		}
		return lista;
	}

	private CarrinhoCompras[] IniciarVenda(CarrinhoCompras[] lista) { // Inicia o menu de escolhas

		int opc = 0;
		while (opc != 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog(null,
					"CATALAGO DE PRODUTOS \n 1 - Frutas \n 2 - Legumes e Verduras \n 9 - Finalizar"));

			switch (opc) {
			case 1:
				lista = catalogoFrutasPronto(lista); // Abre o catalogo de frutas
				break;
			case 2:
				lista = CatalogoLeguVerPronto(lista); // Abre o catalogo de legumes e verduras
				break;
			case 9:
				JOptionPane.showMessageDialog(null, "Finalizando Carrinho"); // "finaliza" o carrinho
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção Invalida");

			}
		}
		return lista;
	}

	private CarrinhoCompras[] catalogoFrutasPronto(CarrinhoCompras[] lista) { // Menu de frutas
		ClasseCarrinho carrinho = new ClasseCarrinho();
		int opc = -1;
		int i = 0;
		while (opc != 0) {
			opc = Integer.parseInt(JOptionPane.showInputDialog(null,
					"Digite a fruta e na próxima janela sua quantidade ou digite 0 para terminar."
							+ "\n 1 - Banana: valor = R$ 3.99 Kg" + "\n 2 - Maça: valor: R$ 0.50 a unidade"
							+ "\n 3 - Laranja: valor = R$ 4.00 Kg " + "\n 4 - Abacaxi: valor = R$ 5.00 Kg"
							+ "\n 5 - Mamão: valor = R$ 2.00 Unidade" + "\n 6 - Morango: valor = R$ 5.00 Caixa"
							+ "\n 7 - Melão: valor = R$ 6.00 unidade" + "\n 8 - Melância: valor = R$ 10.00 unidade"
							+ "\n 9 - Manga: valor = R$ 2.00 unidade" + "\n 10 - Limão: valor = R$ 3.49 Kg"
							+ "\n\n 0 - Voltar"));
			switch (opc) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
			case 10: // Em todas as escolhas é chamado a classe de registro do pedido.
				lista = carrinho.SomarValoresFrutas(lista, opc, i);
				break;
			case 0:
				somaParcial(lista); // vai mostrando parcialmente o total após o término de seleção.
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção invalida");
			}

			// System.out.println(i);
		}
		return lista;
	}

	private CarrinhoCompras[] CatalogoLeguVerPronto(CarrinhoCompras[] lista) { // Menu de legumes e verduras

		ClasseCarrinho carrinho = new ClasseCarrinho();
		int opc = -1;
		int i = 10;
		while (opc != 0) {
			opc = Integer.parseInt(JOptionPane.showInputDialog(null,
					"Digite o legume ou verdura e a sua quantidade ou 0 para terminar"
							+ "\n 1 - Alface Crespa: valor = R$ 4.99 a unidade"
							+ "\n 2 - Alface Americana: valor: R$ 5.99 a unidade"
							+ "\n 3 - Brócolis: valor = R$ 6.00 a unidade " + "\n 4 - Beterraba: valor = R$ 6.00 a rama"
							+ "\n 5 - Batata Doce: valor = R$ 3.00 Kg" + "\n 6 - Cebola: valor = R$ 5.00 Kg"
							+ "\n 7 - Cenoura: valor = R$ 6.00 Kg" + "\n 8 - Couve: valor = R$ 5.50 maço"
							+ "\n 9 - Mandioquinha: valor = R$ 6.00 Kg" + "\n 10 - Repolho: valor = R$ 4.50 Kg"
							+ "\n\n 0 - Voltar."));
			switch (opc) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
			case 10: // Em todas as escolhas é chamado a classe de registro do pedido.
				lista = carrinho.SomarValoresverLeg(lista, opc, i);
				break;
			case 0:
				somaParcial(lista); // vai mostrando parcialmente o total após o término de seleção.
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção invalida");
			}
			i++;
			// System.out.println(i);
		}
		return lista;
	}

	private double somaParcial(CarrinhoCompras[] lista) { // soma parcial, mostra o total da compra da para melhorar.

		double contador = 0;
		DecimalFormat fmt = new DecimalFormat();
		fmt.applyPattern("R$ #,##0.00");

		for (int i = 0; i < 20; i++) {
			contador = contador + lista[i].total;
		}
		System.out.println("Total: " + fmt.format(contador));

		return contador;

	}

	private double escolhaPagamento(double total) throws InterruptedException // Escolhe a forma de pagamento
	{
		int opc = 0;
		int pag = 0;
		double dinheiro = 0;
		DecimalFormat fmt = new DecimalFormat();
		fmt.applyPattern("R$ #,##0.00");
		double frete = 10;
		double totfrete;
		System.out.println("Para compras acima de R$100 o frete é grátis, aproveite!!");
		if (total >= 100) // se a compra for maior que R$100 o frete é grátis
		{
			frete = 0;
		}
		totfrete = total + frete;

		while (opc != 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção desejada: \n 1- Cartão de débito \n "
					+ "2 - Cartão de crédito \n 3 - Dinheiro (5% de desconto) \n 9 - Para finalizar.")); // opções de
																											// pagamento
			switch (opc) {

			case 1:
				pag = Integer.parseInt(JOptionPane.showInputDialog("Opção débito.\n - Total: " + fmt.format(total)
						+ "\n - Frete: " + fmt.format(frete) + "\n - Total + Frete: " + fmt.format(totfrete)
						+ " \n Confirmar? \n 1- Sim \n 2 - Não"));
				if (pag == 1) // Se confirmar realiza o pagamento, senão volta pro menu anterior
				{
					opc = 9;
					RealizandoPagamento();
					JOptionPane.showMessageDialog(null, "Pagamento realizado com sucesso");
				} else {
					opc = 0;
				}
				break;

			case 2:
				pag = Integer.parseInt(JOptionPane.showInputDialog("Opção Crédito. - Total: " + fmt.format(total)
						+ "\n - Frete: " + fmt.format(frete) + "\n - Total + Frete: " + fmt.format(totfrete)
						+ " \n Confirmar? \n 1- Sim \n 2 - Não"));
				if (pag == 1) {
					opc = 9;
					RealizandoPagamento();
					JOptionPane.showMessageDialog(null, "Pagamento realizado com sucesso");
				} else {
					opc = 0;
				}
				break;

			case 3:
				while (dinheiro < ((total + frete) * 0.95)) // Desconto, se o valor inserido no pagamento for menor ele
															// repetirá o processo.
				{
					dinheiro = Double.parseDouble(JOptionPane.showInputDialog("Opção Dinheiro: \nTotal: "
							+ fmt.format(total) + " \n Frete: " + fmt.format(frete) + "\n Total + Frete: "
							+ fmt.format(totfrete) + "\n Com Desconto: " + fmt.format(totfrete * 0.95)
							+ " \nDigite o valor entregue para o calculo do troco: "));
					if (dinheiro < (totfrete * 0.95)) {
						JOptionPane.showMessageDialog(null,
								"Valor inserido menor que o valor da compra, favor adicionar mais dinheiro.");
					}
				}
				pag = Integer.parseInt(JOptionPane.showInputDialog("Opção Dinheiro. - \nTotal: " + fmt.format(totfrete)
						+ " \nCom Desconto: :" + fmt.format(0.95 * totfrete) + "\nValor pago: " + fmt.format(dinheiro)
						+ "\nTroco: " + fmt.format(dinheiro - (0.95 * totfrete)) + "\nConfirmar? \n1- Sim \n 2- Não"));
				if (pag == 1) {
					opc = 9;
					RealizandoPagamento();
					JOptionPane.showMessageDialog(null, "Pagamento realizado com sucesso");
					total = totfrete * 0.95;
				} else {
					opc = 0;
				}
				break;
			case 9:
				RealizandoPagamento();
				break;

			default:
				JOptionPane.showMessageDialog(null, "Opção inválida.");
			}
		}

		return total;
	}

	private void GerarNotaFiscal(CarrinhoCompras[] lista, double total, Cliente[] cadasCliente) throws IOException {
		// Cria nota fiscal em um arquivo que abre no bloco de notas no diretorio
		// C:\\TEMP\\NotaFiscal se não ouver uma pasta dessas ele vai criar
		// automaticamente
		File dir = new File("C:\\TEMP\\NotaFiscal");
		File arq = new File(dir, "NotaFiscal.txt");
		int i = -1;
		do { // escolhe um cliente do BD.
			i = Integer.parseInt(JOptionPane.showInputDialog("Digite o número correspondente ao Cliente cadastrado: \n"
					+ "\n 1 - " + cadasCliente[0].nome + " // Endereço: " + cadasCliente[0].endereco + "\n 2 - "
					+ cadasCliente[1].nome + " // Endereço: " + cadasCliente[1].endereco + "\n 3 - "
					+ cadasCliente[2].nome + " // Endereço: " + cadasCliente[2].endereco + "\n 4 - "
					+ cadasCliente[3].nome + " // Endereço: " + cadasCliente[3].endereco + "\n 5 - "
					+ cadasCliente[4].nome + " // Endereço: " + cadasCliente[4].endereco + "\n 6 - "
					+ cadasCliente[5].nome + " // Endereço: " + cadasCliente[5].endereco + "\n 7 - "
					+ cadasCliente[6].nome + " // Endereço: " + cadasCliente[6].endereco + "\n 8 - "
					+ cadasCliente[7].nome + " // Endereço: " + cadasCliente[7].endereco + "\n 9 - "
					+ cadasCliente[8].nome + " // Endereço: " + cadasCliente[8].endereco + "\n 10 - "
					+ cadasCliente[9].nome + " // Endereço: " + cadasCliente[9].endereco));
			if (i <= 0 || i > 10) {
				JOptionPane.showMessageDialog(null, "Número inválido");
			}
		} while (i <= 0 || i > 10);

		if (dir.exists() && dir.isDirectory()) {
			System.out.println("Nota fiscal Pronta");
		} else {
			dir.mkdirs(); // cria uma pastase não existir, alterei mkdir para mkdirs
			System.out.println("Nota Fiscal Pronta");
		}

		String conteudo = preencheNota(lista, total, cadasCliente, i);
		FileWriter fileWriter = new FileWriter(arq);
		PrintWriter print = new PrintWriter(fileWriter);
		print.write(conteudo);
		print.flush();
		print.close();
		fileWriter.close();

	}

	private String preencheNota(CarrinhoCompras[] lista, double total, Cliente[] cadasCliente, int j)
			throws IOException {

		StringBuffer buffer = new StringBuffer();
		String fileName = "NotaFiscal.txt";
		BufferedWriter gravar = new BufferedWriter(new FileWriter(fileName)); // para gravar em um arquivo que aparece a
																				// direita da tela
		String linha = "";
		linha = ("Foi um Prazer Ter você como nosso Cliente");
		buffer.append(linha + "\n\r"); // vai adicionar as informações no arquivo.txt
		gravar.write(linha);
		gravar.newLine();
		linha = ("Cliente: " + cadasCliente[j - 1].nome + "    Endereço: " + cadasCliente[j - 1].endereco);
		buffer.append(linha + "\n\r");
		gravar.write(linha);
		gravar.newLine();

		double auxTotal = 0;
		DecimalFormat fmt = new DecimalFormat();
		fmt.applyPattern("R$ #,##0.00");

		for (int i = 0; i < lista.length; i++) {
			if (lista[i].fruta != null) { // Para remover as posiçoes que não foram cadastrado frutas
				linha = (lista[i].fruta + " - Quantidade:" + lista[i].quantidade + " - Valor unitario:  "
						+ fmt.format(lista[i].preco) + " - Total: " + fmt.format(lista[i].total));
				buffer.append(linha + "\n\r");
				gravar.write(linha);
				gravar.newLine();
			}
			auxTotal = lista[i].total + auxTotal;
		}
		if (auxTotal < 100) // Se for menor que R$100 adiciono o frete e imprimo na nota fiscal o frete.
		{
			auxTotal = auxTotal + 10;
			if (auxTotal == total) {
				linha = ("\n\n\nTotal da compra + Frete (R$10): " + fmt.format(total));
			} else {
				linha = ("\n\nTotal da compra + Frete (R$10): " + fmt.format(auxTotal) + " // Desconto: "
						+ fmt.format(auxTotal - total) + " // Valor Pago: " + fmt.format(total));
			}
		} else // Se for maior que R$100 a impressão será sem o frete
		{
			if (auxTotal == total) {
				linha = ("\n\nTotal da compra: " + fmt.format(total));
			} else {
				linha = ("\n\nTotal da compra: " + fmt.format(auxTotal) + " // Desconto: " + fmt.format(auxTotal - total)
						+ " // Valor Pago: " + fmt.format(total));
			}
		}
		buffer.append(linha + "\n\r");
		gravar.write(linha);
		gravar.newLine();
		gravar.close();

		return buffer.toString();
	}

	public void RealizandoPagamento() throws InterruptedException // Apenas uma interação na hora de realizar o
																	// pagamento.
	{
		Thread thrpag;
		thrpag = Thread.currentThread();

		System.out.println("Realizando Pagamento");
		for (int i = 0; i < 10; i++) {
			System.out.print(".");
			thrpag.sleep(300);
		}
		System.out.println("\nPagamento realizado com sucesso!");

	}

}

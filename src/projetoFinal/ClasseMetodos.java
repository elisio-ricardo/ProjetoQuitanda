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

	public CarrinhoCompras[] RealizarVenda(CarrinhoCompras[] lista, Cliente[] cadasCliente) throws IOException {
		double total = 0;
		int opc = 0;
		while (opc != 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog(null, " 1 - Iniciar Carrinho ; \n 2 - Consultar total da compra"
					+ " \n 3 - Gerar Nota fiscal. \n 9 - Finalizar"));
			switch (opc) {
			case 1:
				lista = IniciarVenda(lista);
				break;
			case 2:
				total = somaParcial(lista);//atualizei para a soma parcial
				JOptionPane.showMessageDialog(null, "O Total da compra é R$ " + total);
				break;
			case 3:
				total = somaParcial(lista);
				GerarNotaFiscal(lista, total, cadasCliente); // Inseri todos os dados de vendas em um arquivo.txt para poder imprimir e entregar para o cliente
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
			opc = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a fruta e na próxima janela sua quantidade ou digite 0 para terminar."
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
				case 0:	JOptionPane.showMessageDialog(null, "Seleção de frutas finalizada.");
                                        somaParcial(lista); //vai mostrando parcialmente o total após o término de seleção.
                                        
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opção invalida");
				}
				
                                //System.out.println(i);
		}
		return lista;
	}

	private CarrinhoCompras[] CatalogoLeguVerPronto(CarrinhoCompras[] lista) {
//Fazer parecido com as opções das frutas instancia mais uma Classe carrinhos
		
		ClasseCarrinho carrinho = new ClasseCarrinho();
		int opc = -1; //coloquei -1, pq o 9 e o 0 estão sendo usado
		int i = 10;
		while(opc != 0) {
			opc = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a fruta e a sua quantidade ou 0 para terminar"
					+ "\n 1 - Alface Crespa: valor = R$ 4.99 a unidade"
					+ "\n 2 - Alface Americana: valor: R$ 5.99 a unidade"
					+ "\n 3 - Brócolis: valor = R$ 6.00 a unidade "
					+ "\n 4 - Beterraba: valor = R$ 6.00 a rama"
					+ "\n 5 - Batata Doce: valor = R$ 3.00 Kg"
					+ "\n 6 - Cebola: valor = R$ 5.00 Kg"
					+ "\n 7 - Cenoura: valor = R$ 6.00 Kg"
					+ "\n 8 - Couve: valor = R$ 5.50 maço"
					+ "\n 9 - Mandioquinha: valor = R$ 6.00 Kg"
					+ "\n 10 - Repolho: valor = R$ 4.50 Kg"));
				switch (opc) {
				case 1:case 2:case 3:case 4:case 5:case 6:case 7:case 8:case 9:case 10:
					lista = carrinho.SomarValoresverLeg(lista, opc, i);
					break;
				case 0:
					JOptionPane.showMessageDialog(null, "Finalizando carrinho");
                                        somaParcial(lista);
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opção invalida");
				}
				i ++;
                                //System.out.println(i);
		}
		return lista;
	}

	private double somaParcial(CarrinhoCompras[] lista) {
		
	    double contador = 0;
        DecimalFormat fmt = new DecimalFormat();
        fmt.applyPattern("R$ #,##0.00");
        
        for (int i = 0; i<20; i++)
        {
            contador = contador + lista[i].total;
        }
        System.out.println("Total: " +fmt.format(contador));
        
		return contador;

	}

	private void GerarNotaFiscal(CarrinhoCompras[] lista, double total, Cliente[] cadasCliente) throws IOException {
//Cria nota fiscal em um arquivo que abre no bloco de notas no diretorio C:\\TEMP\\NotaFiscal se não ouver uma pasta dessas ele vai criar autmaticamente
		File dir = new File("C:\\TEMP\\NotaFiscal");
		File arq = new File(dir, "NotaFiscal.txt");
		if(dir.exists() && dir.isDirectory()) {
			System.out.println("Nota fiscal Pronta");
		}else {
			dir.mkdir(); //cria uma pastase não existir
			System.out.println("Nota Fiscal Pronta");
		}
		
		String conteudo = preencheNota(lista, total,cadasCliente);
		FileWriter fileWriter = new FileWriter(arq);
		PrintWriter print = new PrintWriter(fileWriter);
		print.write(conteudo);
		print.flush();
		print.close();
		fileWriter.close();
		
	}
        
        private String preencheNota(CarrinhoCompras[] lista, double total, Cliente[] cadasCliente) throws IOException {
        StringBuffer buffer = new StringBuffer();
        String fileName = "NotaFiscal.txt";
        BufferedWriter gravar = new BufferedWriter(new FileWriter(fileName)); //para gravar em um arquivo que aparece a direita da tela
        String linha = "";
        linha = ("Foi um Prazer Ter você como nosso Cliente");
        buffer.append(linha + "\n\r"); //vai adicionar as informações  no arquivo.txt
        gravar.write(linha );
		gravar.newLine();
        linha = ("Cliente: " + cadasCliente[0].nome +"    Endereço: " + cadasCliente[0].endereco);
        buffer.append(linha + "\n\r");
        gravar.write(linha );
		gravar.newLine();
        for (int i = 0; i < lista.length; i++) {
        	if(lista[i].fruta != null) { //Para remover as posiçoes que não foram cadastrado frutas
        		linha =  (lista[i].fruta+ " - Quantidade:" + lista[i].quantidade + " - Valor unitario: R$ " + lista[i].preco+" - Total: R$" + lista[i].total);
        		buffer.append(linha + "\n\r");
        		 gravar.write(linha );
        		 gravar.newLine();
        	}
			
		}
        DecimalFormat fmt = new DecimalFormat();
        fmt.applyPattern("R$ #,##0.00");
        
        linha = ("Total da compra: " +fmt.format(total));
		buffer.append(linha + "\n\r");
		 gravar.write(linha );
		 gravar.newLine();
         gravar.close();
        	
		return buffer.toString();
	}
        

}

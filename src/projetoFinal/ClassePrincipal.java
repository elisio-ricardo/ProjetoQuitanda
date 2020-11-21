
package projetoFinal;

import java.io.IOException;

import javax.swing.JOptionPane;

public class ClassePrincipal {

	public static void main(String args[]) throws IOException, InterruptedException {

		ClasseMetodos cm = new ClasseMetodos();
		Cliente[] cadasCliente = new Cliente[10]; //BD com no máximo 10 clientes.
		CarrinhoCompras[] lista = new CarrinhoCompras[20]; //O maximo do pedido é 20? 
		

		for (int i = 0; i < cadasCliente.length; i++) {
                    cadasCliente[i] = new Cliente();
                    cadasCliente[i].nome = "Não Preenchido";
                    cadasCliente[i].endereco = "Não Preenchido";
		}
                for (int i = 0; i<lista.length; i++)
                {
                    lista[i] = new CarrinhoCompras();
                }

		int opc = 0;
		while (opc != 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog(null,
					"Bem vindo ao sistema da quitanda \n\nSelecione uma das seguintes opções:\n"
							+ " \n 1 - Para cadastrar cliente; \n 2 - Para realizar Compra \n 9 - Finalizar aplicação",
					"Entrada de dados", JOptionPane.INFORMATION_MESSAGE));

			switch (opc) {
			case 1:
				cadasCliente = cm.CadastrarCliente(cadasCliente);
				break;
			case 2:
				 lista = cm.RealizarVenda(lista, cadasCliente);
				break;
			case 9:
				JOptionPane.showMessageDialog(null, "Obrigado por utilizar a aplicação", "Entrada de dados",
						JOptionPane.INFORMATION_MESSAGE);
				break;

			default:
				JOptionPane.showMessageDialog(null, "Opção inválida", "Entrada de dados",
						JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}
}

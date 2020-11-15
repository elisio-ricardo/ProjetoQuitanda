package projetoFinal;

import javax.swing.JOptionPane;

public class ClassePrincipal {

	public static void main(String args[]) {

		ClasseMetodos cm = new ClasseMetodos();
		Cliente[] cadasCliente = new Cliente[10];
		CarrinhoCompras[] lista = new CarrinhoCompras[20];
		

		for (int i = 0; i < cadasCliente.length; i++) {
			cadasCliente[i] = new Cliente();
			lista[i] = new CarrinhoCompras();
		}

		int opc = 0;
		while (opc != 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog(null,
					"Bem vindo ao sistema da quitanda \n Selecione uma das seguintes opções:"
							+ " \n 1 - Para cadastrar cliente; \n 2 - Para realizar Compra \n 9 - Finalizar aplicação",
					"Entrada de dados", JOptionPane.INFORMATION_MESSAGE));

			switch (opc) {
			case 1:
				cadasCliente = cm.CadastrarCliente(cadasCliente);
				break;
			case 2:
				 lista = cm.RealizarVenda(lista);
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

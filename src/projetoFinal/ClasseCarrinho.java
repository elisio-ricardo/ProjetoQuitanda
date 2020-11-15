package projetoFinal;

import javax.swing.JOptionPane;

public class ClasseCarrinho {

	public CarrinhoCompras[] SomarValores(CarrinhoCompras[] lista, int i, int opc) {
		
			switch (opc) {
			case 1:
				lista[i].fruta = "Banana";
				lista[i].preco = 3.99;
				lista[i].quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade: "));
				lista[i].total = lista[i].preco * lista[i].quantidade;
				break;
			case 2:
				lista[i].fruta = "Maça";
				lista[i].preco = 0.50;
				lista[i].quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade: "));
				lista[i].total = lista[i].preco * lista[i].quantidade;
				break;
			case 3:
				lista[i].fruta = "Laranja";
				lista[i].preco = 4.00;
				lista[i].quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade: "));
				lista[i].total = lista[i].preco * lista[i].quantidade;
				break;
			case 4:
				lista[i].fruta = "Abacaxi";
				lista[i].preco = 5.00;
				lista[i].quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade: "));
				lista[i].total = lista[i].preco * lista[i].quantidade;
				break;
			case 5:
				lista[i].fruta = "Mamão";
				lista[i].preco = 2.00;
				lista[i].quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade: "));
				lista[i].total = lista[i].preco * lista[i].quantidade;
				break;
			case 6:
				lista[i].fruta = "Morango";
				lista[i].preco = 5.00;
				lista[i].quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade: "));
				lista[i].total = lista[i].preco * lista[i].quantidade;
				break;
			case 7:
				lista[i].fruta = "Melão";
				lista[i].preco = 6.00;
				lista[i].quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade: "));
				lista[i].total = lista[i].preco * lista[i].quantidade;
				break;
			case 8:
				lista[i].fruta = "Melancia";
				lista[i].preco = 10;
				lista[i].quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade: "));
				lista[i].total = lista[i].preco * lista[i].quantidade;
				break;
			case 9:
				lista[i].fruta = "Manga";
				lista[i].preco = 2.00;
				lista[i].quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade: "));
				lista[i].total = lista[i].preco * lista[i].quantidade;
				break;
			case 10:
				lista[i].fruta = "Limão";
				lista[i].preco = 3.49;
				lista[i].quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade: "));
				lista[i].total = lista[i].preco * lista[i].quantidade;
				break;

			default:
				JOptionPane.showMessageDialog(null, "Opção invalida");
			}
		
		
		return lista;
	}
}
package projetoFinal;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class ClasseCarrinho {

	public CarrinhoCompras[] SomarValoresFrutas(CarrinhoCompras[] lista, int opc, int i) {
		// Criei essa classe para a classe metodos não ficar com tanta informação

		DecimalFormat fmt = new DecimalFormat(); // Formata a saída com 2 casas após a vírgula
		fmt.applyPattern("R$ #,##0.00");

		// ao invés de incrementar o "i", apropriei uma posição do vetor para cada
		// produto, que será preenchido apenas se o comprador selecionar.
		// inclui a opção de adicionar ou subtrair novamente mais do mesmo produto.
		switch (opc) {
		case 1:
			i = 0;
			do {
				double quantidade = 0;
				if (lista[i].quantidade == 0) {
					quantidade = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a quantidade: "));
					if (quantidade < 0) {
						JOptionPane.showMessageDialog(null, "Digite um valor maior que a zero");
					} else {
						lista[i].quantidade = quantidade;
					}
				} else {
					quantidade = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a quantidade: "));
					if (quantidade + lista[i].quantidade >= 0) {
						lista[i].quantidade = quantidade + lista[i].quantidade;
					} else {
						JOptionPane.showMessageDialog(null, "Digite um valor maior que a quantidade atual");
					}
				}
			} while (lista[i].quantidade < 0);

			lista[i].fruta = "Banana";
			lista[i].preco = 3.99;

			lista[i].total = lista[i].preco * lista[i].quantidade;
			System.out.println(
					"Descrição: " + lista[i].fruta + " Quantidade : " + lista[i].quantidade + " // Valor unitário: "
							+ fmt.format(lista[i].preco) + " // Valor total: " + fmt.format(lista[i].total));
			break;
		case 2:
			i = 1;
			i = 0;
			do {
				double quantidade = 0;
				if (lista[i].quantidade == 0) {
					quantidade = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a quantidade: "));
					if (quantidade < 0) {
						JOptionPane.showMessageDialog(null, "Digite um valor maior que zero");
					} else {
						lista[i].quantidade = quantidade;
					}
				} else {
					quantidade = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a quantidade: "));
					if (quantidade + lista[i].quantidade >= 0) {
						lista[i].quantidade = quantidade + lista[i].quantidade;
					} else {
						JOptionPane.showMessageDialog(null, "Digite um valor maior que a quantidade atual");
					}
				}
			} while (lista[i].quantidade < 0);
			lista[i].fruta = "Maça";
			lista[i].preco = 0.50;
			lista[i].total = lista[i].preco * lista[i].quantidade;
			System.out.println(
					"Descrição: " + lista[i].fruta + " Quantidade : " + lista[i].quantidade + " // Valor unitário: "
							+ fmt.format(lista[i].preco) + " // Valor total: " + fmt.format(lista[i].total));
			break;
		case 3:
			i = 2;
			i = 0;
			do {
				double quantidade = 0;
				if (lista[i].quantidade == 0) {
					quantidade = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a quantidade: "));
					if (quantidade < 0) {
						JOptionPane.showMessageDialog(null, "Digite um valor maior que zero");
					} else {
						lista[i].quantidade = quantidade;
					}
				} else {
					quantidade = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a quantidade: "));
					if (quantidade + lista[i].quantidade >= 0) {
						lista[i].quantidade = quantidade + lista[i].quantidade;
					} else {
						JOptionPane.showMessageDialog(null, "Digite um valor maior que a quantidade atual");
					}
				}
			} while (lista[i].quantidade < 0);
			lista[i].fruta = "Laranja";
			lista[i].preco = 4.00;

			lista[i].total = lista[i].preco * lista[i].quantidade;
			System.out.println(
					"Descrição: " + lista[i].fruta + " Quantidade : " + lista[i].quantidade + " // Valor unitário: "
							+ fmt.format(lista[i].preco) + " // Valor total: " + fmt.format(lista[i].total));
			break;
		case 4:
			i = 3;
			i = 0;
			do {
				double quantidade = 0;
				if (lista[i].quantidade == 0) {
					quantidade = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a quantidade: "));
					if (quantidade < 0) {
						JOptionPane.showMessageDialog(null, "Digite um valor maior que zero");
					} else {
						lista[i].quantidade = quantidade;
					}
				} else {
					quantidade = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a quantidade: "));
					if (quantidade + lista[i].quantidade >= 0) {
						lista[i].quantidade = quantidade + lista[i].quantidade;
					} else {
						JOptionPane.showMessageDialog(null, "Digite um valor maior que a quantidade atual");
					}
				}
			} while (lista[i].quantidade < 0);
			lista[i].fruta = "Abacaxi";
			lista[i].preco = 5.00;
			lista[i].total = lista[i].preco * lista[i].quantidade;
			System.out.println(
					"Descrição: " + lista[i].fruta + " Quantidade : " + lista[i].quantidade + " // Valor unitário: "
							+ fmt.format(lista[i].preco) + " // Valor total: " + fmt.format(lista[i].total));
			break;
		case 5:
			i = 4;
			i = 0;
			do {
				double quantidade = 0;
				if (lista[i].quantidade == 0) {
					quantidade = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a quantidade: "));
					if (quantidade < 0) {
						JOptionPane.showMessageDialog(null, "Digite um valor maior que zero");
					} else {
						lista[i].quantidade = quantidade;
					}
				} else {
					quantidade = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a quantidade: "));
					if (quantidade + lista[i].quantidade >= 0) {
						lista[i].quantidade = quantidade + lista[i].quantidade;
					} else {
						JOptionPane.showMessageDialog(null, "Digite um valor maior que a quantidade atual");
					}
				}
			} while (lista[i].quantidade < 0);
			lista[i].fruta = "Mamão";
			lista[i].preco = 2.00;
			System.out.println(
					"Descrição: " + lista[i].fruta + " Quantidade : " + lista[i].quantidade + " // Valor unitário: "
							+ fmt.format(lista[i].preco) + " // Valor total: " + fmt.format(lista[i].total));
			break;
		case 6:
			i = 5;
			i = 0;
			do {
				double quantidade = 0;
				if (lista[i].quantidade == 0) {
					quantidade = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a quantidade: "));
					if (quantidade < 0) {
						JOptionPane.showMessageDialog(null, "Digite um valor maior que zero");
					} else {
						lista[i].quantidade = quantidade;
					}
				} else {
					quantidade = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a quantidade: "));
					if (quantidade + lista[i].quantidade >= 0) {
						lista[i].quantidade = quantidade + lista[i].quantidade;
					} else {
						JOptionPane.showMessageDialog(null, "Digite um valor maior que a quantidade atual");
					}
				}
			} while (lista[i].quantidade < 0);
			lista[i].fruta = "Morango";
			lista[i].preco = 5.00;
			lista[i].total = lista[i].preco * lista[i].quantidade;
			System.out.println(
					"Descrição: " + lista[i].fruta + " Quantidade : " + lista[i].quantidade + " // Valor unitário: "
							+ fmt.format(lista[i].preco) + " // Valor total: " + fmt.format(lista[i].total));
			break;
		case 7:
			i = 6;
			i = 0;
			do {
				double quantidade = 0;
				if (lista[i].quantidade == 0) {
					quantidade = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a quantidade: "));
					if (quantidade < 0) {
						JOptionPane.showMessageDialog(null, "Digite um valor maior que zero");
					} else {
						lista[i].quantidade = quantidade;
					}
				} else {
					quantidade = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a quantidade: "));
					if (quantidade + lista[i].quantidade >= 0) {
						lista[i].quantidade = quantidade + lista[i].quantidade;
					} else {
						JOptionPane.showMessageDialog(null, "Digite um valor maior que a quantidade atual");
					}
				}
			} while (lista[i].quantidade < 0);
			lista[i].fruta = "Melão";
			lista[i].preco = 6.00;
			lista[i].total = lista[i].preco * lista[i].quantidade;
			System.out.println(
					"Descrição: " + lista[i].fruta + " Quantidade : " + lista[i].quantidade + " // Valor unitário: "
							+ fmt.format(lista[i].preco) + " // Valor total: " + fmt.format(lista[i].total));
			break;
		case 8:
			i = 7;
			i = 0;
			do {
				double quantidade = 0;
				if (lista[i].quantidade == 0) {
					quantidade = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a quantidade: "));
					if (quantidade < 0) {
						JOptionPane.showMessageDialog(null, "Digite um valor maior que zero");
					} else {
						lista[i].quantidade = quantidade;
					}
				} else {
					quantidade = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a quantidade: "));
					if (quantidade + lista[i].quantidade >= 0) {
						lista[i].quantidade = quantidade + lista[i].quantidade;
					} else {
						JOptionPane.showMessageDialog(null, "Digite um valor maior que a quantidade atual");
					}
				}
			} while (lista[i].quantidade < 0);
			lista[i].fruta = "Melancia";
			lista[i].preco = 10;
			lista[i].total = lista[i].preco * lista[i].quantidade;
			System.out.println(
					"Descrição: " + lista[i].fruta + " Quantidade : " + lista[i].quantidade + " // Valor unitário: "
							+ fmt.format(lista[i].preco) + " // Valor total: " + fmt.format(lista[i].total));
			break;
		case 9:
			i = 8;
			i = 0;
			do {
				double quantidade = 0;
				if (lista[i].quantidade == 0) {
					quantidade = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a quantidade: "));
					if (quantidade < 0) {
						JOptionPane.showMessageDialog(null, "Digite um valor maior que zero");
					} else {
						lista[i].quantidade = quantidade;
					}
				} else {
					quantidade = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a quantidade: "));
					if (quantidade + lista[i].quantidade >= 0) {
						lista[i].quantidade = quantidade + lista[i].quantidade;
					} else {
						JOptionPane.showMessageDialog(null, "Digite um valor maior que a quantidade atual");
					}
				}
			} while (lista[i].quantidade < 0);
			lista[i].fruta = "Manga";
			lista[i].preco = 2.00;
			lista[i].total = lista[i].preco * lista[i].quantidade;
			System.out.println(
					"Descrição: " + lista[i].fruta + " Quantidade : " + lista[i].quantidade + " // Valor unitário: "
							+ fmt.format(lista[i].preco) + " // Valor total: " + fmt.format(lista[i].total));
			break;
		case 10:
			i = 9;
			i = 0;
			do {
				double quantidade = 0;
				if (lista[i].quantidade == 0) {
					quantidade = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a quantidade: "));
					if (quantidade < 0) {
						JOptionPane.showMessageDialog(null, "Digite um valor maior que zero");
					} else {
						lista[i].quantidade = quantidade;
					}
				} else {
					quantidade = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a quantidade: "));
					if (quantidade + lista[i].quantidade >= 0) {
						lista[i].quantidade = quantidade + lista[i].quantidade;
					} else {
						JOptionPane.showMessageDialog(null, "Digite um valor maior que a quantidade atual");
					}
				}
			} while (lista[i].quantidade < 0);
			lista[i].fruta = "Limão";
			lista[i].preco = 3.49;
			lista[i].total = lista[i].preco * lista[i].quantidade;
			System.out.println(
					"Descrição: " + lista[i].fruta + " Quantidade : " + lista[i].quantidade + " // Valor unitário: "
							+ fmt.format(lista[i].preco) + " // Valor total: " + fmt.format(lista[i].total));
			break;

		default:
			JOptionPane.showMessageDialog(null, "Opção invalida");
		}

		return lista;
	}

	private Object While(boolean b) {
		// TODO Auto-generated method stub
		return null;
	}

	public CarrinhoCompras[] SomarValoresverLeg(CarrinhoCompras[] lista, int opc, int i) {
		// Criei essa classe para a classe metodos não ficar com tanta informação

		DecimalFormat fmt = new DecimalFormat();
		fmt.applyPattern("R$ #,##0.00");
		switch (opc) {
		case 1:
			i = 10;
			i = 0;
			do {
				double quantidade = 0;
				if (lista[i].quantidade == 0) {
					quantidade = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a quantidade: "));
					if (quantidade < 0) {
						JOptionPane.showMessageDialog(null, "Digite um valor maior que zero");
					} else {
						lista[i].quantidade = quantidade;
					}
				} else {
					quantidade = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a quantidade: "));
					if (quantidade + lista[i].quantidade >= 0) {
						lista[i].quantidade = quantidade + lista[i].quantidade;
					} else {
						JOptionPane.showMessageDialog(null, "Digite um valor maior que a quantidade atual");
					}
				}
			} while (lista[i].quantidade < 0);
			lista[i].fruta = "Alface Crespa";
			lista[i].preco = 4.99;
			lista[i].total = lista[i].preco * lista[i].quantidade;
			System.out.println(
					"Descrição: " + lista[i].fruta + " Quantidade : " + lista[i].quantidade + " // Valor unitário: "
							+ fmt.format(lista[i].preco) + " // Valor total: " + fmt.format(lista[i].total));
			break;
		case 2:
			i = 11;
			i = 0;
			do {
				double quantidade = 0;
				if (lista[i].quantidade == 0) {
					quantidade = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a quantidade: "));
					if (quantidade < 0) {
						JOptionPane.showMessageDialog(null, "Digite um valor maior que zero");
					} else {
						lista[i].quantidade = quantidade;
					}
				} else {
					quantidade = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a quantidade: "));
					if (quantidade + lista[i].quantidade >= 0) {
						lista[i].quantidade = quantidade + lista[i].quantidade;
					} else {
						JOptionPane.showMessageDialog(null, "Digite um valor maior que a quantidade atual");
					}
				}
			} while (lista[i].quantidade < 0);
			lista[i].fruta = "Alface Americana";
			lista[i].preco = 5.99;
			lista[i].total = lista[i].preco * lista[i].quantidade;
			System.out.println(
					"Descrição: " + lista[i].fruta + " Quantidade : " + lista[i].quantidade + " // Valor unitário: "
							+ fmt.format(lista[i].preco) + " // Valor total: " + fmt.format(lista[i].total));
			break;
		case 3:
			i = 12;
			i = 0;
			do {
				double quantidade = 0;
				if (lista[i].quantidade == 0) {
					quantidade = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a quantidade: "));
					if (quantidade < 0) {
						JOptionPane.showMessageDialog(null, "Digite um valor maior que zero");
					} else {
						lista[i].quantidade = quantidade;
					}
				} else {
					quantidade = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a quantidade: "));
					if (quantidade + lista[i].quantidade >= 0) {
						lista[i].quantidade = quantidade + lista[i].quantidade;
					} else {
						JOptionPane.showMessageDialog(null, "Digite um valor maior que a quantidade atual");
					}
				}
			} while (lista[i].quantidade < 0);
			lista[i].fruta = "Brócolis";
			lista[i].preco = 6.00;
			lista[i].total = lista[i].preco * lista[i].quantidade;
			System.out.println(
					"Descrição: " + lista[i].fruta + " Quantidade : " + lista[i].quantidade + " // Valor unitário: "
							+ fmt.format(lista[i].preco) + " // Valor total: " + fmt.format(lista[i].total));
			break;
		case 4:
			i = 13;
			i = 0;
			do {
				double quantidade = 0;
				if (lista[i].quantidade == 0) {
					quantidade = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a quantidade: "));
					if (quantidade < 0) {
						JOptionPane.showMessageDialog(null, "Digite um valor maior que zero");
					} else {
						lista[i].quantidade = quantidade;
					}
				} else {
					quantidade = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a quantidade: "));
					if (quantidade + lista[i].quantidade >= 0) {
						lista[i].quantidade = quantidade + lista[i].quantidade;
					} else {
						JOptionPane.showMessageDialog(null, "Digite um valor maior que a quantidade atual");
					}
				}
			} while (lista[i].quantidade < 0);
			lista[i].fruta = "Beterraba";
			lista[i].preco = 6.00;
			lista[i].total = lista[i].preco * lista[i].quantidade;
			System.out.println(
					"Descrição: " + lista[i].fruta + " Quantidade : " + lista[i].quantidade + " // Valor unitário: "
							+ fmt.format(lista[i].preco) + " // Valor total: " + fmt.format(lista[i].total));
			break;
		case 5:
			i = 14;
			i = 0;
			do {
				double quantidade = 0;
				if (lista[i].quantidade == 0) {
					quantidade = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a quantidade: "));
					if (quantidade < 0) {
						JOptionPane.showMessageDialog(null, "Digite um valor maior que zero");
					} else {
						lista[i].quantidade = quantidade;
					}
				} else {
					quantidade = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a quantidade: "));
					if (quantidade + lista[i].quantidade >= 0) {
						lista[i].quantidade = quantidade + lista[i].quantidade;
					} else {
						JOptionPane.showMessageDialog(null, "Digite um valor maior que a quantidade atual");
					}
				}
			} while (lista[i].quantidade < 0);
			lista[i].fruta = "Batata Doce";
			lista[i].preco = 3.00;
			lista[i].total = lista[i].preco * lista[i].quantidade;
			System.out.println(
					"Descrição: " + lista[i].fruta + " Quantidade : " + lista[i].quantidade + " // Valor unitário: "
							+ fmt.format(lista[i].preco) + " // Valor total: " + fmt.format(lista[i].total));
			break;
		case 6:
			i = 15;
			i = 0;
			do {
				double quantidade = 0;
				if (lista[i].quantidade == 0) {
					quantidade = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a quantidade: "));
					if (quantidade < 0) {
						JOptionPane.showMessageDialog(null, "Digite um valor maior que zero");
					} else {
						lista[i].quantidade = quantidade;
					}
				} else {
					quantidade = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a quantidade: "));
					if (quantidade + lista[i].quantidade >= 0) {
						lista[i].quantidade = quantidade + lista[i].quantidade;
					} else {
						JOptionPane.showMessageDialog(null, "Digite um valor maior que a quantidade atual");
					}
				}
			} while (lista[i].quantidade < 0);
			lista[i].fruta = "Cebola";
			lista[i].preco = 5.00;
			lista[i].total = lista[i].preco * lista[i].quantidade;
			System.out.println(
					"Descrição: " + lista[i].fruta + " Quantidade : " + lista[i].quantidade + " // Valor unitário: "
							+ fmt.format(lista[i].preco) + " // Valor total: " + fmt.format(lista[i].total));
			break;
		case 7:
			i = 16;
			i = 0;
			do {
				double quantidade = 0;
				if (lista[i].quantidade == 0) {
					quantidade = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a quantidade: "));
					if (quantidade < 0) {
						JOptionPane.showMessageDialog(null, "Digite um valor maior que zero");
					} else {
						lista[i].quantidade = quantidade;
					}
				} else {
					quantidade = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a quantidade: "));
					if (quantidade + lista[i].quantidade >= 0) {
						lista[i].quantidade = quantidade + lista[i].quantidade;
					} else {
						JOptionPane.showMessageDialog(null, "Digite um valor maior que a quantidade atual");
					}
				}
			} while (lista[i].quantidade < 0);
			lista[i].fruta = "Cenoura";
			lista[i].preco = 6.00;
			lista[i].total = lista[i].preco * lista[i].quantidade;
			System.out.println(
					"Descrição: " + lista[i].fruta + " Quantidade : " + lista[i].quantidade + " // Valor unitário: "
							+ fmt.format(lista[i].preco) + " // Valor total: " + fmt.format(lista[i].total));
			break;
		case 8:
			i = 17;
			i = 0;
			do {
				double quantidade = 0;
				if (lista[i].quantidade == 0) {
					quantidade = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a quantidade: "));
					if (quantidade < 0) {
						JOptionPane.showMessageDialog(null, "Digite um valor maior que zero");
					} else {
						lista[i].quantidade = quantidade;
					}
				} else {
					quantidade = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a quantidade: "));
					if (quantidade + lista[i].quantidade >= 0) {
						lista[i].quantidade = quantidade + lista[i].quantidade;
					} else {
						JOptionPane.showMessageDialog(null, "Digite um valor maior que a quantidade atual");
					}
				}
			} while (lista[i].quantidade < 0);
			lista[i].fruta = "Couve";
			lista[i].preco = 5.50;
			lista[i].total = lista[i].preco * lista[i].quantidade;
			System.out.println(
					"Descrição: " + lista[i].fruta + " Quantidade : " + lista[i].quantidade + " // Valor unitário: "
							+ fmt.format(lista[i].preco) + " // Valor total: " + fmt.format(lista[i].total));
			break;
		case 9:
			i = 18;
			i = 0;
			do {
				double quantidade = 0;
				if (lista[i].quantidade == 0) {
					quantidade = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a quantidade: "));
					if (quantidade < 0) {
						JOptionPane.showMessageDialog(null, "Digite um valor maior que zero");
					} else {
						lista[i].quantidade = quantidade;
					}
				} else {
					quantidade = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a quantidade: "));
					if (quantidade + lista[i].quantidade >= 0) {
						lista[i].quantidade = quantidade + lista[i].quantidade;
					} else {
						JOptionPane.showMessageDialog(null, "Digite um valor maior que a quantidade atual");
					}
				}
			} while (lista[i].quantidade < 0);
			lista[i].fruta = "Mandioquinha";
			lista[i].preco = 6.00;
			lista[i].total = lista[i].preco * lista[i].quantidade;
			System.out.println(
					"Descrição: " + lista[i].fruta + " Quantidade : " + lista[i].quantidade + " // Valor unitário: "
							+ fmt.format(lista[i].preco) + " // Valor total: " + fmt.format(lista[i].total));
			break;
		case 10:
			i = 19;
			i = 0;
			do {
				double quantidade = 0;
				if (lista[i].quantidade == 0) {
					quantidade = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a quantidade: "));
					if (quantidade < 0) {
						JOptionPane.showMessageDialog(null, "Digite um valor maior que zero");
					} else {
						lista[i].quantidade = quantidade;
					}
				} else {
					quantidade = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a quantidade: "));
					if (quantidade + lista[i].quantidade >= 0) {
						lista[i].quantidade = quantidade + lista[i].quantidade;
					} else {
						JOptionPane.showMessageDialog(null, "Digite um valor maior que a quantidade atual");
					}
				}
			} while (lista[i].quantidade < 0);
			lista[i].fruta = "Repolho";
			lista[i].preco = 4.50;
			lista[i].total = lista[i].preco * lista[i].quantidade;
			System.out.println(
					"Descrição: " + lista[i].fruta + " Quantidade : " + lista[i].quantidade + " // Valor unitário: "
							+ fmt.format(lista[i].preco) + " // Valor total: " + fmt.format(lista[i].total));
			break;

		default:
			JOptionPane.showMessageDialog(null, "Opção invalida");
		}
		return lista;
	}
}
package projetoFinal;

//class Produtos {
//	String nome;
//	double preco;
//
//	Produtos() {
//		this(" ", 0);
//	}
//
//	Produtos(String nomeFruta, double precoFruta) {
//		nome = nomeFruta;
//		preco = precoFruta;
//	}
//}
//
//class LeguVer // Legumes e verduras
//{
//	String nome;
//	double preco;
//
//	LeguVer() {
//		this(" ", 0);
//	}
//
//	LeguVer(String nomeLegume, double precoLegume) {
//		nome = nomeLegume;
//		preco = precoLegume;
//	}
//}
class Cliente {
	String nome;
	String endereco;

	Cliente() {
		this(" ", " ");
	}

	Cliente(String nome, String endereco) {
		nome = nome;
		endereco = endereco;
	}
}

class CarrinhoCompras{
	String fruta;
	int quantidade;
	double preco;
	double total;
	int totalItens;

	CarrinhoCompras() {
		this(" ", 0, 0, 0, 0);
	}

	CarrinhoCompras(String fruta, int quantidade, double preco, double total, int itens) {
		fruta = fruta;
		quantidade = quantidade;
		preco = preco;
		total = total;
		totalItens = totalItens;
	
	}
}


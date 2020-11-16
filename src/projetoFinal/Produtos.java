package projetoFinal;


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
	
	}
}


package br.com.guacom.modelo.loja;

public class Livro extends Produto {
	private String autor;

	public Livro(String nome, double preco, String autor, int codigoDeBarra) {
		super(nome, preco, codigoDeBarra);
		this.autor = autor;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
}

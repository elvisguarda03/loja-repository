package br.com.guacom.modelo.loja;

public class Dvd extends Produto{
	private double duracao;
	
	public Dvd(String nome, double preco, double duracao, int codigoDeBarra) {
		super(nome, preco, codigoDeBarra);
		this.duracao = duracao;
	}

	public double getDuracao() {
		return duracao;
	}

	public void setDuracao(double duracao) {
		this.duracao = duracao;
	}
}

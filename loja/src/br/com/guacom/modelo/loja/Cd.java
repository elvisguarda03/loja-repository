package br.com.guacom.modelo.loja;

public class Cd extends Produto {
	private int numeroFaixas;

	public Cd(String nome, double preco, int numeroFaixas, int codigoDeBarra) {
		super(nome, preco, codigoDeBarra);
		this.numeroFaixas = numeroFaixas;
	}

	public int getNumeroFaixas() {
		return numeroFaixas;
	}

	public void setNumeroFaixas(int numeroFaixas) {
		this.numeroFaixas = numeroFaixas;
	}	
}

package br.com.guacom.modelo.loja;

public abstract class Produto implements Comparable<Produto> {
	protected String nome;
	protected double preco;
	protected int codigoDeBarra;

	public Produto(String nome, double preco, int codigoDeBarra) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.codigoDeBarra = codigoDeBarra;
	}
	
	public Produto(int codigoDeBarra) {
		this.codigoDeBarra = codigoDeBarra;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getCodigoDeBarra() {
		return codigoDeBarra;
	}

	public void setCodigoDeBarra(int codigoDeBarra) {
		this.codigoDeBarra = codigoDeBarra;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null)
			return false;
		//Deve-se retornar false também no caso do objeto passado não ser de tipo compatível com a sua classe.
		
		if(!(obj instanceof Produto)) {
			return false;
		}
		Produto product = (Produto) obj;
		return (this.codigoDeBarra == product.codigoDeBarra);
	}
	
	@Override
	public int compareTo(Produto p) {
		return this.nome.compareTo(p.nome);
	}
}

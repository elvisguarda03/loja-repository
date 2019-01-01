package br.com.guacom.modelo.loja;

import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.guacom.util.InternationalizationUtil;

public class Cadastro {
	private List<Produto> produtos;

	public Cadastro(List<Produto> produtos) {
		super();
		this.produtos = produtos;
	}

	public List<Produto> getProdutos() {
		return Collections.unmodifiableList(produtos);
	}
	
	public void cadastrar(int choose) throws NullPointerException {
		
		String nome = JOptionPane.showInputDialog(InternationalizationUtil.getString("type") + ": ");
		double preco = Double.parseDouble(JOptionPane.showInputDialog(InternationalizationUtil.getString("type_value") + ": "));
		int codigoDeBarra = Integer.parseInt(JOptionPane.showInputDialog(InternationalizationUtil.getString("barcode") + ": "));
		
		switch (choose) {
			case 1:
				String autor = JOptionPane.showInputDialog(InternationalizationUtil.getString("name_auth") + ": ");
				produtos.add(new Livro(nome, preco, autor, codigoDeBarra));
				break;
			case 2:
				int numeroFaixas = Integer.parseInt(JOptionPane.showInputDialog(InternationalizationUtil.getString("number_track") + ": "));
				produtos.add(new Cd(nome, preco, numeroFaixas, codigoDeBarra));
				break;
			case 3:
				double duracao = Double.parseDouble(JOptionPane.showInputDialog(InternationalizationUtil.getString("film_duration") + ":"));
				produtos.add(new Dvd(nome, preco, duracao, codigoDeBarra));
				break;
			default:
				break;
		}
	}
}

package br.com.guacom.teste;

import java.util.ArrayList;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import br.com.guacom.modelo.loja.Cadastro;
import br.com.guacom.modelo.loja.Cd;
import br.com.guacom.modelo.loja.Dvd;
import br.com.guacom.modelo.loja.Livro;
import br.com.guacom.modelo.loja.Produto;
import br.com.guacom.util.InternationalizationUtil;

public class Loja {
	
	public static void main(String[] args) {
		ArrayList<Produto> produtos = new ArrayList<Produto>();
		Cadastro cad = new Cadastro(produtos);
		
		int choose = 0;
		
		while(choose == 0) {
		
			choose = Integer.parseInt(JOptionPane.showInputDialog(InternationalizationUtil.getString("choose") + ":"
					+ "\n1 - " + InternationalizationUtil.getString("cd")
					+ "\n2 - " + InternationalizationUtil.getString("book")
					+ "\n3 - " + InternationalizationUtil.getString("dvd")));
			cad.cadastrar(choose);
			
			choose = JOptionPane.showConfirmDialog(null, InternationalizationUtil.getString("register"));
		}
		choose = 0;
		while(choose == 0) {
			choose = Integer.parseInt(JOptionPane.showInputDialog(InternationalizationUtil.getString("choose") + ":"
					+ "\n1 - " + InternationalizationUtil.getString("product")
					+ "\n2 - " + InternationalizationUtil.getString("search")));
			
			
			switch (choose) {
				case 1:
					produtos.forEach( (produto) -> {
						
						if(produto instanceof Livro) {
							Livro livro = (Livro)produto;
							JOptionPane.showMessageDialog(null, InternationalizationUtil.getString("name_book") + ": " + produto.getNome()
									+ "\n" + InternationalizationUtil.getString("aut") + ": " + livro.getAutor()
									+ "\n" + InternationalizationUtil.getString("value") + livro.getPreco());
						}
						else if(produto instanceof Cd) {
							Cd cd = (Cd)produto;
							JOptionPane.showMessageDialog(null, InternationalizationUtil.getString("name_cd") + ": " + produto.getNome()
									+ "\n" + InternationalizationUtil.getString("track") + ": " + cd.getNumeroFaixas()
									+ "\n" + InternationalizationUtil.getString("value") + cd.getPreco());
						}
						else {
							Dvd dvd = (Dvd)produto;
							JOptionPane.showMessageDialog(null, InternationalizationUtil.getString("name_dvd") + ": " + produto.getNome()
									+ "\n" + InternationalizationUtil.getString("duration") + ": " + dvd.getDuracao()
									+ "\n" + InternationalizationUtil.getString("value") + dvd.getPreco());
						}
					});
				if(produtos.size() > 1) 
					JOptionPane.showMessageDialog(null, ""+ produtos.get(0).compareTo(produtos.get(1)));
					
					break;
				
				case 2:
					boolean encontrou = false;
					
					int barCode = Integer.parseInt(JOptionPane.showInputDialog(InternationalizationUtil.getString("barcode") + ": "));
					
					for(Produto product : produtos) {
						
						if( ((produtos.size() > 1)&&(encontrou = product.equals(produtos.get( (produtos.indexOf(product)) + 1)))))
							break;
					}
					
					if(!encontrou) {
						JOptionPane.showMessageDialog(null, "Produto não foi encontrado!!");
					}
					
					break;
				default:
					JOptionPane.showMessageDialog(null, "Comando inválido!!");
			}
			choose = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
		}
		
		if(produtos.get(0).compareTo(produtos.get(1)) == 1) {
			JOptionPane.showMessageDialog(null, "Nome produto: " + produtos.get(0).getNome()
					+ " é maior do que " + produtos.get(1).getNome());
		}
	}
}

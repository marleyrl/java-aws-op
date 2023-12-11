package CarrinhoCompras;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	
	private List<Item> carrinhocompras; 
	
	public CarrinhoDeCompras(){
		this.carrinhocompras = new ArrayList<>();
	}
	
	public void adicionarItem(String nome, double preco, int quantidade) {
		carrinhocompras.add(new Item(nome,preco,quantidade));
		
	}
	
	public void removerItem(String nome) {
		
		List<Item> removeItem= new ArrayList<>();
		for(Item i: carrinhocompras) {
			if(i.getNome().equalsIgnoreCase(nome)==true) {
				removeItem.add(i);
			}
		}
		carrinhocompras.removeAll(removeItem);
	}
	public String calcularValorTotal() {
		
		double somafinal=0;
		DecimalFormat decimalFormat = new DecimalFormat("0.00");
		
		for(Item item:carrinhocompras) {
	
			somafinal+= item.getPreco()*item.getQuantidade();
	
		}
		return decimalFormat.format(somafinal);	
		
	}
	public void exibirItens() {
		
		for (Item s: carrinhocompras ) {
			System.out.println("Item:"+s.getNome()+"\n Valor:"+s.getPreco()+"\n Quantidade:"+s.getQuantidade()+"\n");
		}
	}
	
	public static void main (String [] args) {	
	
		CarrinhoDeCompras compras= new CarrinhoDeCompras();
		
		compras.adicionarItem("Queijo", 14.50, 5);
		compras.adicionarItem("Pao", 12.8, 2);
		compras.adicionarItem("Bolo", 12.8, 4);
		compras.adicionarItem("Sal", 12.8, 1);
		compras.adicionarItem("Água", 3.5, 20);
		
		compras.exibirItens();
		System.out.println("Itens Adicionados, valor do Carrinho Atualizado: "+ compras.calcularValorTotal()+"\n");
		compras.removerItem("Queijo");
		
		System.out.println("Item Removido, valor do Carrinho Atualizado: "+ compras.calcularValorTotal()+"\n");
		compras.exibirItens();
	
	
	}

}

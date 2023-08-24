package javaop;

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
		
	}
	public Item calcularValorTotal() {
		
		
		for(Item valores:carrinhocompras) {
			
			int    qnt;
			double valorTotal;
			valorTotal = valores.getPreco();
			qnt= valores.getQuantidade();
			
		}
		
		return carrinhocompras.get(1);
		
		
		
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
		compras.adicionarItem("Agua", 3.5, 20);
		
		compras.exibirItens();
		
		compras.calcularValorTotal();
		

	
	}

}

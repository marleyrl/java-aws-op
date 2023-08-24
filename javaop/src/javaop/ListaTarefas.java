package javaop;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
//Atributos

	private List<Tarefa> tarefaList;
		
	public ListaTarefas() {
		this.tarefaList = new ArrayList<>();
	
	}
	
	public void adicionarTarefa(String descricao) {
		tarefaList.add(new Tarefa(descricao));
	}
	
	public void removerTarefa(String descricao) {
		List<Tarefa> tarefaParaRemover = new ArrayList<>();
		for(Tarefa t: tarefaList) {
			if(t.getDescricao().equalsIgnoreCase(descricao)){
				tarefaParaRemover.add(t);
			}
		}
		tarefaList.removeAll(tarefaParaRemover);
	}
	
	public int obterNumeroTotalTarefas() {
		return tarefaList.size();
	}
	
	public void obterDescricoesTarefas() {
		System.out.println(tarefaList);
	}
	
	public static void main (String [] args){
		ListaTarefas listaTarefas = new ListaTarefas();
		/*
		listaTarefas.adicionarTarefa("Fazer Cafe");
		listaTarefas.adicionarTarefa("Lavar Carro");
		
		
		System.out.println(listaTarefas.obterNumeroTotalTarefas());
		
		listaTarefas.removerTarefa("Lavar Carro");
		
		System.out.println(listaTarefas.obterNumeroTotalTarefas());
		
		listaTarefas.obterDescricoesTarefas();
		
		System.out.println("Tarefa Acima");*/
	}
}	

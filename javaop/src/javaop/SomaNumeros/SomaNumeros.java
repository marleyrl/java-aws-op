package javaop.SomaNumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros{
	
	public List<Numeros> somanumeros;
	
	public SomaNumeros(){
		this.somanumeros = new ArrayList<>();
	}
	
	public void adicionarNumero( int numero) {
		somanumeros.add(new Numeros(numero));
	}
	
	public void calcularSoma(){
		int soma = 0;
		
		for (Numeros num:somanumeros) {
			soma+= num.getNumero();
			
		}
		System.out.println("Soma dos Valores: "+soma);
	
	}
	public int encontrarMaiorNumero() {
		return encontrarMaiorNumero();
	}
	public int encontrarMenorNumero() { 
		return encontrarMaiorNumero();
	}
	public void exibirNumeros() {
		
		
		for(Numeros numeros:somanumeros) {
			System.out.println("Numeros da Lista " +numeros.getNumero());
		}
	}
	
	public static void main (String [] args) {	
		
		SomaNumeros objnumero= new SomaNumeros();
	

		objnumero.adicionarNumero(3);
		objnumero.adicionarNumero(35);
		objnumero.adicionarNumero(53);
		objnumero.exibirNumeros();
		objnumero.calcularSoma();

	}
}	


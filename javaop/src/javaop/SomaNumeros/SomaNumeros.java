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
		
	int valormenor = somanumeros.get(0).getNumero();
		
		for(Numeros numeros:somanumeros) {
			int numero = numeros.getNumero();
		if(numero > valormenor) {
			valormenor = numero;
		 }
	}
		
		return valormenor;
	}

	public int encontrarMenorNumero() { 
		int valormenor = somanumeros.get(0).getNumero();
		
		for(Numeros numeros:somanumeros) {
			int numero = numeros.getNumero();
		if(numero <valormenor) {
			valormenor = numero;
		 }
	}
		
		return valormenor;
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
		objnumero.adicionarNumero(476);
		objnumero.adicionarNumero(59);
		objnumero.adicionarNumero(41);
		objnumero.adicionarNumero(583);
		
		objnumero.exibirNumeros();
		objnumero.calcularSoma();
		
		System.out.println("Menor Numero " + objnumero.encontrarMenorNumero());
		System.out.println("Maior Numero " + objnumero.encontrarMaiorNumero());

	}
}	


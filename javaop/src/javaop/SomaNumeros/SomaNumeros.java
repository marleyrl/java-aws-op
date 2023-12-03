package javaop.SomaNumeros;

import java.security.spec.EncodedKeySpec;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class SomaNumeros{
	
	private List<Numeros> somanumeros;
	
	public SomaNumeros(){
		this.somanumeros = new ArrayList<Numeros>();
	}
	
	public void adicionarNumero( int numero) {
		somanumeros.add(new Numeros(numero));
	
	}
	
	public int calcularSoma(){
		return calcularSoma();
	}
	public int encontrarMaiorNumero() {
		return encontrarMaiorNumero();
	}
	public int encontrarMenorNumero() { 
		return encontrarMaiorNumero();
	}
	public int exibirNumeros() {
		return exibirNumeros();
	}
	
}	


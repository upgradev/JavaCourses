package com.upgrade.estruturadados.vetor.teste;

import com.upgrade.estruturadados.vetor.Vetor;

public class Aula06 {
	
	public static void main(String[] args) {
		Vetor vetor = new Vetor(10);

		vetor.adiciona("Elemento 1");
		vetor.adiciona("Elemento 2");
		vetor.adiciona("Elemento 3");
		
		System.out.println(vetor.busca("Elemento 1"));
		System.out.println(vetor.busca("Elemento 4"));
		System.out.println(vetor.busca(0));

	}
}

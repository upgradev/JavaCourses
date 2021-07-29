package com.upgrade.estruturadados.vetor.teste;

import com.upgrade.estruturadados.vetor.Vetor;

public class Aula09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vetor vetor = new Vetor(3);

		vetor.adiciona("B");
		vetor.adiciona("G");
		vetor.adiciona("D");
		vetor.adiciona("E");
		vetor.adiciona("F");

		System.out.println(vetor);
		
		vetor.remove(1);
		
		System.out.println(vetor);
		
		System.out.println("Remover elemento A");
		
		int pos = vetor.busca("A");
		
		if(pos > 0) {
			vetor.remove(pos);
		}
		else {
			System.out.println("Elemento não existe no vetor");
		}
		
		System.out.println(vetor);
		
	}

}

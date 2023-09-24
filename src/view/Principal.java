package view;

import model.Fila;

public class Principal {

	public static void main(String[] args) {
		Fila<Integer> filaInt = new Fila<>();
		try {
		filaInt.insert(1);
		filaInt.insert(2);
		filaInt.insert(10);
		int tamanho = filaInt.size();
		System.out.println("Tamanho = " + tamanho);
		filaInt.list();
		filaInt.remove();
		filaInt.remove();
		tamanho = filaInt.size();
		System.out.println("Tamanho = " + tamanho);
		int dado = filaInt.remove();
		System.out.println("Dado = " + dado);
		filaInt.remove();
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	}

}

package model;

public class Fila<T> {
		No<T> inicio;
		No<T> fim;
		
		public Fila() {
			inicio = null;
			fim = inicio;
		}
		public boolean isEmpty() {
			if (inicio == fim && inicio == null) {
				return true;
			} else {
				return false; 
			}
		}
		
		public void insert(T dado) {
			No<T> elemento = new No<>();
			elemento.dado = dado;
			elemento.proximo = null;
			if (isEmpty()) {
				inicio = elemento;
				fim = inicio;
			} else {
				fim.proximo = elemento;
				fim = elemento;
			}
		}
		public T remove() throws Exception {
			if (isEmpty()) {
				throw new Exception("Fila vazia");
			}
			T dado = inicio.dado;
			if (inicio == fim && inicio != null) {//fila de 1 elemento
				inicio = null;
				fim = inicio; // fila vazia
			} else {
				inicio = inicio.proximo;
			}
			return dado;
		}
		
		public void list() throws Exception{
			if (isEmpty()) {
				throw new Exception("Fila vazia");
			}
			No<T> auxiliar = inicio;
			while(auxiliar != null) {
				System.out.print(auxiliar.dado + " ");
				auxiliar = auxiliar.proximo;
			}
			System.out.println("");
		}
		
		public int size() {
			int cont = 0;
			if (!isEmpty()) {
				No<T> auxiliar = inicio;
				while (auxiliar !=null) {
					cont++;
					auxiliar= auxiliar.proximo;
				}
			}
			return cont;
		}
	}



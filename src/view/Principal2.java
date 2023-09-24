package view;
import model.Pessoa;
import model.Fila;

public class Principal2 {

	public static void main(String[] args) {
		Fila<Pessoa> fila = new Fila<>();
		Pessoa p1 = new Pessoa(1, "Fulano", 5500.00f);
		Pessoa p2 = new Pessoa();
		p2.id = 2;
		p2.nome = "Cicrano";
		p2.salario = 8320.52f;
		
		try {
			fila.insert(p1);
			fila.insert(p2);
			fila.list();
			Pessoa p = fila.remove();
			System.out.println(p.nome);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

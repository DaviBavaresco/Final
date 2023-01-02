package Dominio;
import java.util.ArrayList;
import java.util.List;

public class Lanche {

	String nome;

	private ArrayList<Ingrediente> ingredientes = new ArrayList<Ingrediente>();

	public Lanche(String nome) {
		setNome(nome);

	};

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Ingrediente> getIngredientes() {
		return ingredientes;
	};

	public void adicionaIngrediente(Ingrediente i) {
		this.ingredientes.add(i);
	};

	public List<Ingrediente> getCopiaIngredientes(){
	    List<Ingrediente> copia = new ArrayList<Ingrediente>();
	    for (Ingrediente i: ingredientes) {
	      copia.add(i);
	    }
	    return copia;
	  }


	public int getTotalProteina() {
		int val = 0;
		for (Ingrediente aux : ingredientes) {
			val = val + aux.getTotalProteina();
		}

		return val;
	}

	public int getTotalCarbo() {
		int val = 0;
		for (Ingrediente aux : ingredientes) {
			val = val + aux.getTotalCarboidrato();
		}

		return val;
	}

	public int getTotalGordura() {
		int val = 0;
		for (Ingrediente aux : ingredientes) {
			val = val + aux.getTotalGordura();
		}

		return val;
	}

	public int getTotalSodio() {
		int val = 0;
		for (Ingrediente aux : ingredientes) {
			val = val + aux.getTotalSodio();
		}

		return val;
	}

	
	
	@Override
	public String toString() {
		return "\nLanche nome: " + nome + 
				"\nIngredientes: " + getIngredientes()+
				"\nTotal Proteina do lanche: "+getTotalProteina()+
				"\nTotal Carboidrato do lanche: "+getTotalCarbo()+
				"\nTotal Gordura do lanche: "+getTotalGordura()+
				"\nTotal Sodio do lanche: "+getTotalSodio();
	}

	public String soLanche() {
		return "\nNome: "+nome+
				"\nIngredientes: "+getIngredientes()+
				"\nTotal Proteina do lanche: "+getTotalProteina()+
				"\nTotal Carboidrato do lanche: "+getTotalCarbo()+
				"\nTotal Gordura do lanche: "+getTotalGordura()+
				"\nTotal Sodio do lanche: "+getTotalSodio();
	};

	
}

package Dominio;
import java.util.ArrayList;
import java.util.List;

public class Cardapio {

	private String nome;
	private List<Lanche> lanches = new ArrayList<Lanche>();

	public Cardapio(String nome) {
		this.nome=nome;
	};

	public String getNome() {
		return nome;
	};
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Lanche> getLanches() {
		return lanches;
	};

	public void adicionaLanche(Lanche l) {
		this.lanches.add(l);
	};

	public int getTotalProteina() {
		int val = 0;
		for (Lanche aux : lanches) {
			val = val + aux.getTotalProteina();
		}

		return val;
	}

	public	int getTotalCarboidrato() {
		int val = 0;
		for (Lanche aux : lanches) {
			val = val + aux.getTotalCarbo();
		}

		return val;
	};

	public int getTotalGordura() {
		int val = 0;
		for (Lanche aux : lanches) {
			val = val + aux.getTotalGordura();
		}

		return val;

	};

	public int getTotalSodio() {
		int val = 0;
		for (Lanche aux : lanches) {
			val = val + aux.getTotalSodio();
		}

		return val;

	}

	@Override
	public String toString() {
		return "\nCardapio de Nome=" +  nome+
				"\nLanches: "+getLanches()+
				"\nTotal de Proteina do cardapio: "+getTotalProteina()+
				"\nTotal de Carboidrato do cardapio: "+getTotalCarboidrato()+
				"\nTotal de Gordura do cardapio: "+getTotalGordura()+
				"\nTotal de Sodio do cardapio: "+getTotalSodio();
				
	}

}

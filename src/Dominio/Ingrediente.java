package Dominio;


public class Ingrediente {

	private int quantidade;
	

	private Condimento condimento;

	public Ingrediente(Condimento condimento, int quantidade) {
		this.quantidade = quantidade;
		this.condimento = condimento;
	};

	public int getTotalProteina() {
		return condimento.getQuantProteina() * quantidade;
	};

	public int getTotalCarboidrato() {
		return condimento.getQuantCarboidrato() * quantidade;
	};

	public int getTotalGordura() {
		return condimento.getQuantGordura() * quantidade;
	};

	public int getTotalSodio() {
		return condimento.getQuantSodio() * quantidade;
	};

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	// Lanche getLanche();
	public Condimento getCondimento() {
		return condimento;
	}

	@Override
	public String toString() {
		return "\nQuantidade: " + quantidade + 
				"\nCondimentos: " + condimento.getNome()+
				"\nTotal de Proteina do ingrediente: " + getTotalProteina() + 
				"\nTotal de Carboidrato do ingrediente: " + getTotalCarboidrato()+
				"\nTotal de Gordura do ingrediente: " + getTotalGordura() + 
				"\nTotal de Sodio do ingrediente:  " + getTotalSodio();
	}
	public String ingredienteFull() {
		return"\nQuantidade: " + quantidade + 
				"\nCondimentos: " + condimento+
				"\nTotal de Proteina do ingrediente: " + getTotalProteina() + 
				"\nTotal de Carboidrato do ingrediente: " + getTotalCarboidrato()+
				"\nTotal de Gordura do ingrediente: " + getTotalGordura() + 
				"\nTotal de Sodio do ingrediente: " + getTotalSodio();
	};

}

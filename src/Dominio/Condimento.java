package Dominio;

public class Condimento {
	private String nome;
	private int quantProteina;
	private int quantCarboidrato;
	private int quantGordura;
	private int quantSodio;

	public Condimento(String nome, int quantProteina, int quantCarboidrato, int quantGordura, int quantSodio) {
		this.setNome(nome);
		this.setQuantProteina(quantProteina);
		this.setQuantCarboidrato(quantCarboidrato);
		this.setQuantGordura(quantSodio);
		this.setQuantSodio(quantSodio);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantProteina() {
		return quantProteina;
	}

	public void setQuantProteina(int quantProteina) {
		this.quantProteina = quantProteina;
	}

	public int getQuantCarboidrato() {
		return quantCarboidrato;
	}

	public void setQuantCarboidrato(int quantCarboidrato) {
		this.quantCarboidrato = quantCarboidrato;
	}

	public int getQuantGordura() {
		return quantGordura;
	}

	public void setQuantGordura(int quantGordura) {
		this.quantGordura = quantGordura;
	}

	public int getQuantSodio() {
		return quantSodio;
	}

	public void setQuantSodio(int quantSodio) {
		this.quantSodio = quantSodio;
	}

	@Override
	public String toString() {
		return "\nNome: " + nome + 
				"\nQuantidade de Proteina: " + quantProteina + 
				"\nQuantidade de Carboidrato: " + quantCarboidrato+
				"\nQuantidade de Gordura: " + quantGordura + 
				"\nQuantidade de Sodio: " + quantSodio;
	}

}

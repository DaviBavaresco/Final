package Dominio;

public class Restricao {

	private int minProteina;
	private int minCarboidrato;
	private int minGordura;
	private int minSodio;
	private int maxProteina;
	private int maxCarboidrato;
	private int maxGordura;
	private int maxSodio;
	private String dataIni;
	private String dataFim;

	public Restricao(int maxProteina, int minProteina, int maxCarboidrato, int minCarboidrato, int maxGordura,
			int minGordura, int maxSodio, int minSodio, String dataIni, String dataFim) {
		this.setMaxProteina(maxProteina);
		this.setMinProteina(minProteina);
		this.setMaxCarboidrato(maxCarboidrato);
		this.setMinCarboidrato(minCarboidrato);
		this.setMaxGordura(maxGordura);
		this.setMinGordura(minGordura);
		this.setMaxSodio(maxSodio);
		this.setMinSodio(minSodio);
		this.setDataIni(dataIni);
		this.setDataFim(dataFim);

	};

//	public RestricaoDiaria(int minProteina, int minCarboidrato, int minGordura, int minSodio, int maxProteina,int maxCarboidrato, int maxGordura, int maxSodio) 
//	{	
//		this.setMaxProteina(maxProteina);
//		this.setMinProteina(minProteina);
//		this.setMaxCarboidrato(maxCarboidrato);
//		this.setMinCarboidrato(minCarboidrato);
//		this.setMaxGordura(maxGordura);
//		this.setMinGordura(minGordura);
//		this.setMaxSodio(maxSodio);
//		this.setMinSodio(minSodio);
//		this.setDataIni(dataIni);
//		this.setDataFim(dataFim);
//		
//	};

	public String getDataIni() {
		return dataIni;
	}

	public void setDataIni(String dataIni) {
		this.dataIni = dataIni;
	}

	public String getDataFim() {
		return dataFim;
	}

	public void setDataFim(String dataFim) {
		this.dataFim = dataFim;
	}

	public int getMinProteina() {
		return minProteina;
	}

	public void setMinProteina(int minProteina) {
		this.minProteina = minProteina;
	}

	public int getMinCarboidrato() {
		return minCarboidrato;
	}

	public void setMinCarboidrato(int minCarboidrato) {
		this.minCarboidrato = minCarboidrato;
	}

	public int getMinGordura() {
		return minGordura;
	}

	public void setMinGordura(int minGordura) {
		this.minGordura = minGordura;
	}

	public int getMinSodio() {
		return minSodio;
	}

	public void setMinSodio(int minSodio) {
		this.minSodio = minSodio;
	}

	public int getMaxProteina() {
		return maxProteina;
	}

	public void setMaxProteina(int maxProteina) {
		this.maxProteina = maxProteina;
	}

	public int getMaxCarboidrato() {
		return maxCarboidrato;
	}

	public void setMaxCarboidrato(int maxCarboidrato) {
		this.maxCarboidrato = maxCarboidrato;
	}

	public int getMaxGordura() {
		return maxGordura;
	}

	public void setMaxGordura(int maxGordura) {
		this.maxGordura = maxGordura;
	}

	public int getMaxSodio() {
		return maxSodio;
	}

	public void setMaxSodio(int maxSodio) {
		this.maxSodio = maxSodio;
	}

	@Override
	public String toString() {
		return "\nMaximo de proteina: "+maxProteina+
				"\nMinimo de Proteina: "+minProteina+
				"\nMaximo de Carboidrato: "+maxCarboidrato+
				"\nMinimo de Carboidrato: "+minCarboidrato+
				"\nMaximo de Gordura: "+maxGordura+
				"\nMinimo de Gordura: "+minGordura+
				"\nMaximo de Sodio: "+maxSodio+
				"\nMinimo de Sodio: "+minSodio+
				"\nData de Inicio: "+dataIni+
				"\nData de fim: "+dataFim;
			    
	}
	
	public String RestridFull() {
		return "\nMaximo de proteina: "+maxProteina+
				"\nMinimo de Proteina: "+minProteina+
				"\nMaximo de Carboidrato: "+maxCarboidrato+
				"\nMinimo de Carboidrato: "+minCarboidrato+
				"\nMaximo de Gordura: "+maxGordura+
				"\nMinimo de Gordura: "+minGordura+
				"\nMaximo de Sodio: "+maxSodio+
				"\nMinimo de Sodio: "+minSodio;
	};

}

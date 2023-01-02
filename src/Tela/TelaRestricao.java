package Tela;

import Dominio.Restricao;


public class TelaRestricao extends Tela {
	
	private Restricao restrid;
	
	public TelaRestricao(Restricao r) {
	    restrid = r;	
	  }
	public void imprimeRestricao() {
	    System.out.printf("%s     %s            %s             %s             %s             %s              %s             %s              %s             %s             \n", restrid.getMaxProteina(),restrid.getMinProteina(),restrid.getMaxCarboidrato(),restrid.getMaxCarboidrato(),restrid.getMaxGordura(),restrid.getMaxGordura(),restrid.getMaxSodio(),restrid.getMinSodio(),restrid.getDataIni(),restrid.getDataFim());
	  }

}

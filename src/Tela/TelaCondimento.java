package Tela;

import Dominio.Condimento;

public class TelaCondimento extends Tela {

	private Condimento condimento;
	public TelaCondimento(Condimento c) { 
	    condimento = c;	
	  }
	public void imprimeCondimento() {
	    System.out.printf("%s     %d            %d             %d              %d              \n", condimento.getNome(),condimento.getQuantProteina(),condimento.getQuantCarboidrato(),condimento.getQuantGordura(),condimento.getQuantSodio());
	  }
	public void imprimeCondimentos() {
	    System.out.printf("%s            \n", condimento.getNome());
	  }
}

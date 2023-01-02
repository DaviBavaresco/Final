package Tela;

import java.util.List;

import Dominio.Condimento;




public class TelaCondimentos extends Tela {
	
	private List<Condimento> condimentos;
	
	public TelaCondimentos(List<Condimento> condimentos) {
	    this.condimentos = condimentos;	
	  }
	
	public void imprimeCondimentos() {
	    System.out.println("------------------ Condimentos medidos em gramas ------------------");
	    System.out.printf("%2s %12s %16s %16s %12s  \n", "Nome", "Proteina", "Carboidrato", "Gordura","Sodio");
	    for (Condimento c: condimentos){
	      TelaCondimento telaCondimento = new TelaCondimento(c);
	      telaCondimento.imprimeCondimento();
	    }
	  }
	

}

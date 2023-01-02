package Tela;
import Dominio.Lanche;


public class TelaLanche extends Tela {
	private Lanche lanche;
	
	public TelaLanche(Lanche lanche) {
	    this.lanche = lanche;
	  }
	public void imprimeLanche() {
		System.out.println("---------- Lanche  "+lanche.getNome()+"----------");
	    System.out.println("Ingredientes: ");
	    TelaIngredientes tela_ingredientes = new TelaIngredientes(lanche.getCopiaIngredientes());
	    tela_ingredientes.imprimeIngredientes();
	    System.out.printf("Total de Proteinas do lanche     = %16s\n", lanche.getTotalProteina());
	    System.out.printf("Total de Carboidrato do lanche   = %16s\n", lanche.getTotalCarbo());
	    System.out.printf("Total de Gorduras do lanche     = %16s\n", lanche.getTotalGordura());
	    System.out.printf("Total de Sodio do lanche       = %16s\n", lanche.getTotalSodio());
	    System.out.println("--------------------");
	}

}

package Tela;

import Dominio.Ingrediente;



public class TelaIngrediente extends Tela{
private Ingrediente ingrediente;

public TelaIngrediente(Ingrediente ingrediente) {
    	this.ingrediente=ingrediente;
    			
  }
public void imprimeIngrediente() {
	System.out.println("---------- Ingrediente  ----------");
    System.out.println("Quantidade: "+ingrediente.getQuantidade());
    System.out.println("Nome: ");
    TelaCondimento tela_condimentos = new TelaCondimento(ingrediente.getCondimento());
    tela_condimentos.imprimeCondimentos();
    System.out.printf("Total de Proteinas do ingrediente     = %16s\n", ingrediente.getTotalProteina());
    System.out.printf("Total de Carboidrato do ingrediente   = %16s\n", ingrediente.getTotalCarboidrato());
    System.out.printf("Total de Gorduras do ingrediente     = %16s\n", ingrediente.getTotalGordura());
    System.out.printf("Total de Sodio do ingrediente       = %16s\n", ingrediente.getTotalSodio());
    System.out.println("--------------------");
};
}

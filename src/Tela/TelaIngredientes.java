package Tela;

import java.util.List;

import Dominio.Ingrediente;



public class TelaIngredientes extends Tela{
	private List<Ingrediente> ingredientes;
	
	public TelaIngredientes(List<Ingrediente> ingredientes) {
	    this.ingredientes = ingredientes;
	  }

	public void imprimeIngredientes() {
	    TelaIngrediente tela;
	    for (Ingrediente ingre: ingredientes){
	      tela = new TelaIngrediente(ingre);
	      tela.imprimeIngrediente();
	    }//for
	  }
}

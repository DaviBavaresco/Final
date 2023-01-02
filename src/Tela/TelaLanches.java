package Tela;

import java.util.List;

import Dominio.Lanche;




public class TelaLanches extends Tela {
	private List<Lanche>lanches;
	
	public TelaLanches(List<Lanche> lanches) {
	    this.lanches=lanches;
	  }
	public void imprimeLanches() {
	    TelaLanche tela;
	    for (Lanche lanche: lanches){
	      tela = new TelaLanche(lanche);
	      tela.imprimeLanche();
	    }//for
	  }

}

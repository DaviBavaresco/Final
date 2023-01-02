package Tela;

import java.util.List;


import Dominio.Cardapio;


public class TelaCardapios {
	
private List<Cardapio> cardapios;

	public TelaCardapios(List<Cardapio>cardapios) {
		this.cardapios=cardapios;	
		};
	

		public void imprimeCardapios() {
		    TelaCardapio tela;
		    for (Cardapio cardapio: cardapios){
		      tela = new TelaCardapio(cardapio);
		      tela.imprimeCardapio();
		    }//for
		  }
}

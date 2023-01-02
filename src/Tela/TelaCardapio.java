package Tela;




import Dominio.Cardapio;


public class TelaCardapio extends Tela{
	
	private Cardapio cardapio;
	
	public TelaCardapio(Cardapio cardapio) {
		this.cardapio=cardapio;
	};
	
	public void imprimeCardapio() {
		System.out.println("---------- Cardapio  "+cardapio.getNome() +"----------");
	    TelaLanches tela_lanches = new TelaLanches(cardapio.getLanches());
	    tela_lanches.imprimeLanches();
	    System.out.printf("Total de Proteinas do cardapio     = %16s\n", cardapio.getTotalProteina());
	    System.out.printf("Total de Carboidrato do cardapio   = %16s\n", cardapio.getTotalCarboidrato());
	    System.out.printf("Total de Gorduras do cardapio     = %16s\n", cardapio.getTotalGordura());
	    System.out.printf("Total de Sodio do cardapio       = %16s\n", cardapio.getTotalSodio());
	    System.out.println("--------------------");
	};

}

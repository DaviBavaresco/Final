package Tela;


import Dominio.Pessoa;

public class TelaPessoa extends Tela{
	
	private Pessoa pessoa;
	
	public TelaPessoa(Pessoa pessoa) {
		this.pessoa=pessoa;
	};
	
	public void imprimePessoa() {
		System.out.println("---------- Pessoa de nome: "+pessoa.getNome()+"----------");
		System.out.println("\nInformações sobre a pessoa:");
		System.out.println("\nAltura: "+pessoa.getAltura()+"\nIdade: "+pessoa.getIdade()+"\nPeso: "+pessoa.getPeso());
		System.out.println("\nCardapios");
	    TelaCardapios tela_cardapios = new TelaCardapios(pessoa.getCardapios());
	    tela_cardapios.imprimeCardapios();
	    System.out.println("\nRestrições:");
	    TelaRestricaos telaRestricaos= new TelaRestricaos(pessoa.getCopiaRestricao());
	    telaRestricaos.imprimeRestricaos();
	    System.out.println("\nLanches favoritos:");
	    TelaLanches telaLanches = new TelaLanches(pessoa.getFavoritos());
	    telaLanches.imprimeLanches();
	  
	};
	}



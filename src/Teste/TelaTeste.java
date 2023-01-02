package Teste;
import BD.Dados;

import Tela.TelaCardapios;
import Tela.TelaCondimentos;
import Tela.TelaIngredientes;
import Tela.TelaLanches;



public class TelaTeste {

	public static void main(String[] args) {
		Dados.criaCondimento();
		Dados.criaIngrediente();
		Dados.criaLanche();
		Dados.criaCardapio();
		
		
		TelaCondimentos telaCondimentos= new TelaCondimentos(Dados.condimentos);
		telaCondimentos.imprimeCondimentos();
		
		TelaIngredientes telaIngredientes= new TelaIngredientes(Dados.ingredientes);
		telaIngredientes.imprimeIngredientes();
		
		TelaLanches telaLanches= new TelaLanches(Dados.lanches);
		telaLanches.imprimeLanches();
		
		TelaCardapios telaCardapios= new TelaCardapios(Dados.cardapios);
		telaCardapios.imprimeCardapios();
		

	}

}

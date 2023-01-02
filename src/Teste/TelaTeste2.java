package Teste;
import BD.Dados;

import Tela.Tela;
import Tela.TelaPessoas;

public class TelaTeste2 extends Tela{
public static void main(String[] args) {
	Dados.criaCondimento();
	Dados.criaIngrediente();
	Dados.criaLanche();
	Dados.criaCardapio();
	Dados.criaRestricao();
	Dados.criaPessoa();
	
	
	
	
	
	//TelaCondimentos telaCondimentos= new TelaCondimentos(Dados.condimentos);
	//telaCondimentos.imprimeCondimentos();
	
	TelaPessoas telaPessoas= new TelaPessoas(Dados.pessoas);
	telaPessoas.imprimePessoas();
	
	//TelaRestricaos telaRestricaos= new TelaRestricaos(Dados.restrisoes);
	//telaRestricaos.imprimeRestricaos();
	
	
	
}




}

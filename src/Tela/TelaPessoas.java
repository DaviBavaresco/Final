package Tela;
import java.util.List;

import Dominio.Pessoa;

public class TelaPessoas extends Tela {
	private List<Pessoa> pessoas;
	public TelaPessoas(List<Pessoa>pessoas) {
		this.pessoas=pessoas;
	};
	
	public void imprimePessoas() {
		TelaPessoa tela;
		for (Pessoa pessoa: pessoas){
		      tela = new TelaPessoa(pessoa);
		      tela.imprimePessoa();
		    }
	};

}

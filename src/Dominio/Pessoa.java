package Dominio;
import java.util.ArrayList;
import java.util.List;





public class Pessoa {
	String nome;
	double altura;
	double peso;
	int idade;
	private List<Lanche> lanches = new ArrayList<Lanche>();
	private List<Cardapio> cardapios = new ArrayList<Cardapio>();
	private List<Restricao> restrisoes = new ArrayList<Restricao>();
	private List<Lanche> lanchesFavoritos= new ArrayList<Lanche>();

	public Pessoa(String nome, double altura, double peso, int idade) {
		this.setNome(nome);
		this.setAltura(altura);
		this.setPeso(peso);
		this.setIdade(idade);
	};

//	public Pessoa(String nome, double altura, double peso, int idade, Restricao r) {
//		this.setNome(nome);
//		this.setAltura(altura);
//		this.setPeso(peso);
//		this.setIdade(idade);
//		this.adicionaRestrisao(r);
//
//	};

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public List<Restricao> getRestrisoes() {
		return restrisoes;
	}

	public void adicionaRestrisao(Restricao restrisao) {
		this.restrisoes.add(restrisao);
	}
	public void removeRestrisao(Restricao restrisao) {
		this.restrisoes.remove(restrisao);
	}
	
	public List<Restricao> getCopiaRestricao(){
	    List<Restricao> copia = new ArrayList<Restricao>();
	    for (Restricao r: restrisoes) {
	      copia.add(r);
	    }
	    return copia;
	  }
	
	

	public List<Lanche> getLanches() {
		return lanches;
	}

	public void adicionaLanche(Lanche l) {
		this.lanches.add(l);
	};
	public List<Lanche> getCopiaLanches(){
	    List<Lanche> copia = new ArrayList<Lanche>();
	    for (Lanche l: lanches) {
	      copia.add(l);
	    }
	    return copia;
	  }
	
	

	public List<Cardapio> getCardapios() {
		return cardapios;
	};

	public void adicionaCardapio(Cardapio c) {
		this.cardapios.add(c);
	}
	
	public List<Cardapio> getCopiaCardapios(){
	    List<Cardapio> copia = new ArrayList<Cardapio>();
	    for (Cardapio c: cardapios) {
	      copia.add(c);
	    }
	    return copia;
	  }
	
	
	
	public List<Lanche> getFavoritos(){
		return lanchesFavoritos;
	}
	public void addLanchesFavoritos(Lanche lanchesFavoritos) {
		this.lanchesFavoritos.add(lanchesFavoritos);
	};

	
	public String toString1() {
		return "Pessoa [nome=" + nome + ", altura=" + altura + ", peso=" + peso + ", idade=" + idade + ", lanches="
				+ lanches + ", cardapios=" + cardapios + ", restrisoes=" + restrisoes + ", getRestrisoes()="
				+ getRestrisoes() + ", getLanches()=" + getLanches() + ", getCardapios()=" + getCardapios() + "]";
	};
	
	public String soInfoBasica() {
		return "Nome: "+nome+
				"\nAltura: "+altura+
				"\nPeso: "+peso+
				"\nIdade: "+idade;
	};
	
	public String infoCompleta() {
		return "Nome: "+nome+
				"\nAltura: "+altura+
				"\nPeso: "+peso+
				"\nIdade: "+idade+
				"\nRestrições: "+getRestrisoes();
	};
	public String pessoLanche() {
		return "Nome: "+nome+
			   "\nLanches: "+getLanches();
	};
	public String pessoaCardapio() {
		return "\nNome: "+nome+
				"\nCardapio: "+getCardapios();
	};
	public String pessoaFav() {
		return "\nNome: "+nome+
				"\nLanches Favoritos: "+getFavoritos();
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", altura=" + altura + ", peso=" + peso + ", idade=" + idade + ", lanches="
				+ lanches + ", cardapios=" + cardapios + ", restrisoes=" + restrisoes + ", lanchesFavoritos="
				+ lanchesFavoritos + ", getFavoritos()=" + getFavoritos() + "]";
	};
	

}

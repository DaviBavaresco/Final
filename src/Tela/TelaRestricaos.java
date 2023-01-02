package Tela;

import java.util.List;

import Dominio.Restricao;



public class TelaRestricaos extends Tela {
	
	private List<Restricao> restrid;
	
	public TelaRestricaos(List<Restricao> restrid) {
	    this.restrid = restrid;	
	  }
	
	public void imprimeRestricaos() {
	    System.out.println("------------------ Restrição ------------------");
	    System.out.printf("%2s %7s %12s %15s %14s %14s %14s %10s %14s %10s  \n", "PROT", "prot", "CARBO", "carb", "GORDURA","gord","SODIO", "sodio","Data Inicio","Data Fim");
	    for (Restricao r: restrid){
	      TelaRestricao telaRestriçao = new TelaRestricao(r);
	      telaRestriçao.imprimeRestricao();
	    }
	  }

}

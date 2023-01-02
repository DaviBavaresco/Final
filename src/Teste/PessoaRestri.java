package Teste;

import Dominio.Pessoa;
import Dominio.Restricao;

public class PessoaRestri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa p1,p2;
		Restricao r1,r2;
		//crio a primeira pessoa
		p1=new Pessoa("Davi",1.74,74.55,19);
		System.out.println(p1.soInfoBasica());
		System.out.println("-------- Nova Pessoa -------------");
		p2=new Pessoa("Joao",1.80,100,20);
		System.out.println(p2.soInfoBasica());
		System.out.println("Adiciono as restrições");
		r1= new Restricao(40,20,10,1,200,100,50,5,"20/11/2022","10/01/2023");
		p2.adicionaRestrisao(r1);
		System.out.println(p2.infoCompleta());
		System.out.println("---------------------------------");
		System.out.println("Removo elas");
		p2.removeRestrisao(r1);
		System.out.println(p2.infoCompleta());
		System.out.println("---------------------------------");
		r2= new Restricao(20,10,5,1,100,50,25,2,"11/01/2023","01/03/2003");
		System.out.println("Crio uma nova restrição");
		p2.adicionaRestrisao(r2);
		System.out.println(p2.infoCompleta());
		
	}

}

package Teste;

import Dominio.Cardapio;
import Dominio.Condimento;
import Dominio.Ingrediente;
import Dominio.Lanche;
import Dominio.Pessoa;
import Dominio.Restricao;

public class pessoaCardapio {

	public static void main(String[] args) {
		Pessoa p1;
		Restricao r1;
		Condimento c1,c2,c3;
		Ingrediente i1,i2,i3;
		Lanche l1,l2;
		Cardapio cc1;
		//crio a pessoa
		p1= new Pessoa("Davi",1.75,75,19);
		r1= new Restricao(100,50,10,1,400,200,15,5,"20/11/2003","24/11/2023");
		p1.adicionaRestrisao(r1);
		//insiro a restrição nela
		
		c1=new Condimento("Carne",7,3,2,1);
		c2= new Condimento("Arroz",2,7,2,1);
		c3= new Condimento("Feijão",3,3,1,1);
		
		i1= new Ingrediente(c1,100);
		i2= new Ingrediente(c2,50);
		i3= new Ingrediente(c3,40);
		
		l1=new Lanche("Carne,Arroz e feijão");
		l1.adicionaIngrediente(i1);
		l1.adicionaIngrediente(i2);
		l1.adicionaIngrediente(i3);
		
		l2= new Lanche("Carne e Feijão");
		l2.adicionaIngrediente(i1);
		l2.adicionaIngrediente(i3);
		
		cc1= new Cardapio("Janta");
		cc1.adicionaLanche(l2);
		System.out.println(cc1);
		
		
		
		

	}

}

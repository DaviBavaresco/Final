package Teste;

import Dominio.Cardapio;
import Dominio.Condimento;
import Dominio.Ingrediente;
import Dominio.Lanche;
import Dominio.Pessoa;
import Dominio.Restricao;

public class testes {

	public static void main(String[] args) {
		Pessoa p1, p2;
		Restricao r1;
		Condimento c1, c2;
		Ingrediente in1, in2;
		Lanche l1;
		Cardapio car1;

		// primeiro teste sem os metodos para mostrar de forma legivel
		p1 = new Pessoa("davi", 10, 10, 10);
		System.out.println(p1);
		System.out.println("-------------------------------------");
		System.out.println(p1.soInfoBasica());
		System.out.println("-------------------------------------");
		System.out.println();
			
		

	// segundo teste
		p2 = new Pessoa("Alex", 20, 20, 20);
		r1 = new Restricao(1, 1, 1, 1, 1, 1, 1, 1, "20/11/2000", "30/11/2010");
		p2.adicionaRestrisao(r1);
		System.out.println(p2);
		System.out.println("-------------------------------------");
		System.out.println(p2.infoCompleta());

		System.out.println("-------------------------------------");
    	c1 = new Condimento("Arroz", 10, 8, 6, 4);
		c2 = new Condimento("Carne", 10, 6, 8, 10);
        System.out.println(c1);
        System.out.println("-------------------------------------");
        System.out.println(c2);
        System.out.println("-------------------------------------");
        
        
		in1 = new Ingrediente(c1, 5);
		in2 = new Ingrediente(c2, 10);
		System.out.println(in1);
		System.out.println("-------------------------------------");
		System.out.println(in2);
		System.out.println("-------------------------------------");
		System.out.println(in2.ingredienteFull());

		System.out.println("--------------------------");
		l1 = new Lanche("Marmita");
		l1.adicionaIngrediente(in1);
		l1.adicionaIngrediente(in2);
		System.out.println(l1);
		System.out.println("-------------------------------------");
		System.out.println(l1.soLanche());
		System.out.println(l1.getTotalProteina());
		
		System.out.println("-------------------------");
		p1.adicionaLanche(l1);
		p1.getLanches();
		System.out.println(p1);
		System.out.println("----------------------");
		car1 = new Cardapio("Janta");
		car1.adicionaLanche(l1);
		p1.addLanchesFavoritos(l1);
		System.out.println(car1);
		System.out.println("--------------------------");
		System.out.println(p1.pessoaFav());

	}

}

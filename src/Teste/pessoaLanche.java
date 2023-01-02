package Teste;


import Dominio.Condimento;
import Dominio.Ingrediente;
import Dominio.Lanche;
import Dominio.Pessoa;

public class pessoaLanche {

	public static void main(String[] args) {
		Pessoa p1;
		Condimento c1,c2,c3,c4;
		Ingrediente i1,i2,i3,i4,i5,i6,i7,i8;
		Lanche l1,l2,l3;
		p1= new Pessoa("Davi",1.74,75,19);
		//crio a pessoa 
		c1= new Condimento("Frango",7,1,1,1);
		c2= new Condimento("Arroz",1,12,2,1);
		c3= new Condimento("Feijão",5,7,2,1);
		c4= new Condimento("Batata-Doce",5,10,1,1);
		// criei os condimentos para criar os ingredientes
		
		i1= new Ingrediente(c1,100);
		i2= new Ingrediente(c2,50);
		i3= new Ingrediente(c3,25);
		i4= new Ingrediente(c4,50);
		// pego o condimento e adiciono o quantidade
		
		l1= new Lanche("Almoço");
		l1.adicionaIngrediente(i1);
		l1.adicionaIngrediente(i2);
		l1.adicionaIngrediente(i3);
		l1.adicionaIngrediente(i4);
		// adicionei os ingredientes
		
		System.out.println(l1.soLanche());
		
		
		i5= new Ingrediente(c1,50);
		i6 = new Ingrediente(c2,50);
		
		
		
		l2=new Lanche("Janta");
		l2.adicionaIngrediente(i5);
		l2.adicionaIngrediente(i6);
		
		
		i7= new Ingrediente(c1,50);
		i8= new Ingrediente(c4,50);
		
		l3= new Lanche("Café da manha");
		l3.adicionaIngrediente(i7);
		l3.adicionaIngrediente(i8);
		System.out.println(l3.soLanche());
		System.out.println("-----------Favoritos--------------");
		p1.getFavoritos();
		p1.addLanchesFavoritos(l3);
		p1.addLanchesFavoritos(l2);
		
		
		System.out.println(p1.getFavoritos());
		
		

	}

}

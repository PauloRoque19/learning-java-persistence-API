package com.algaworks.algaworks_ecommerce.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.algaworks.algaworks_ecommerce.model.Produto;

public class IniciarUnidadeDePersistence {

	 public static void main(String[] agrs) {
		 EntityManagerFactory emf  = Persistence.createEntityManagerFactory("Ecommerce-PU");
		 EntityManager em = emf.createEntityManager();	

		 Produto p = em.find(Produto.class, 1);
		 System.out.println(p.getNome());
		 
		 em.close();
		 emf.close();
	 }
}

package com.algaworks.algaworks_ecommerce.iniciandocomjpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.algaworks.algaworks_ecommerce.model.Produto;

public class ConsultandoRegistroTest {

	private static EntityManagerFactory emf;
	
	private EntityManager em;
	
	@BeforeClass
	public static void setUpBeforeClass() {
		emf = Persistence.createEntityManagerFactory("Ecommerce-PU");
	}
	
	@AfterClass
	public static void tearDownAfterClass() {
		emf.close();
	}
	
	@Before
	public void setUp() {
		em = emf.createEntityManager();
	}
	
	@After
	public void tearDown() {
		em.close();
	}
	
	@Test
	public void buscarPorIdentificador() {
		Produto p = em.find(Produto.class, 1);
		Assert.assertNotNull(p);
	}
	
}

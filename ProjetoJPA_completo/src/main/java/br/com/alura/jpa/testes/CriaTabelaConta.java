package br.com.alura.jpa.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.alura.jpa.modelo.Conta;

public class CriaTabelaConta {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("maria");
		EntityManager createEntityManager = emf.createEntityManager();
		
		Conta conta = new Conta();
		conta.setTitular("Lucas");
		conta.setNumero(123);
		conta.setAgencia(123);
		
		createEntityManager.getTransaction().begin();
		
		createEntityManager.persist(conta);
		
		createEntityManager.getTransaction().commit();
		
		emf.close();

	}
}

package br.com.tarefas.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConnectionFactory {
private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("pu");
public static EntityManager getEntityManager() {
	return factory.createEntityManager();
}
}

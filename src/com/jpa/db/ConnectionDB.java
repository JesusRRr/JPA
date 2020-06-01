package com.jpa.db;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConnectionDB {
	private static EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("JPA");
	private static EntityManager entityManager;

	public static EntityManager getEntityManager(){
		
		if(entityManager==null) {
			entityManager=entityManagerFactory.createEntityManager();
		}
		
		return entityManager;
	}
	
}

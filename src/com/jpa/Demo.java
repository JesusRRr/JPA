package com.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.jpa.crud.CrudImpl;
import com.jpa.db.ConnectionDB;
import com.jpa.model.Person;

public class Demo {

	public static void main(String[] args) {
		EntityManager em = ConnectionDB.getEntityManager();
		
		
		Person person = new Person();
		
		/*
		person.setId(2);
		person.setName("Jesus");
		person.setLastName("R");
		person.setAge(23);
		em.getTransaction().begin();
		em.persist(person);
		em.getTransaction().commit();
		em.close();
		*/
		
	}
	

}

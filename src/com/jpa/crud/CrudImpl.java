package com.jpa.crud;

import java.util.function.Predicate;

import javax.persistence.EntityManager;

import com.jpa.db.ConnectionDB;

public abstract class CrudImpl<T> implements ICrud<T>{
	private EntityManager entityManager;
	
	public CrudImpl() {
		entityManager=ConnectionDB.getEntityManager();
	}
	
	@Override
	public void create(T entity) {
		entityManager.getTransaction().begin();
		entityManager.persist(entity);
		entityManager.getTransaction().commit();
	}

	@Override
	public void update(T entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void find(Predicate<T> predicate) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}

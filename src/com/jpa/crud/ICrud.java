package com.jpa.crud;

import java.util.function.Predicate;

public interface ICrud<T>{
	
	public void create();
	
	public void update(T entity);
	
	public void find(Predicate<T> predicate);
	
	public void delete(int id);
}

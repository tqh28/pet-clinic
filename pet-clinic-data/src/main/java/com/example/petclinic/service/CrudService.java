package com.example.petclinic.service;

import java.util.Set;

public interface CrudService<T, ID> {

	public T findById(ID id);

	public T save(T Vet);

	public Set<T> findAll();

	public void deleteById(ID id);
	
	public void delete(T object);
}
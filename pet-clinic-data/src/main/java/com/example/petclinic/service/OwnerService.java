package com.example.petclinic.service;

import java.util.Set;

import com.example.petclinic.model.Owner;

public interface OwnerService {

	public Owner findById(Long id);
	
	public Owner findByLastName(String lastName);
	
	public Owner save (Owner owner);
	
	public Set<Owner> findAll();
}

package com.example.petclinic.service;

import java.util.Set;

import com.example.petclinic.model.Pet;

public interface PetService {

	public Pet findById(Long id);
	
	public Pet save (Pet Pet);
	
	public Set<Pet> findAll();
}

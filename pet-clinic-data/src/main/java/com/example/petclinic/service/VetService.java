package com.example.petclinic.service;

import java.util.Set;

import com.example.petclinic.model.Vet;

public interface VetService {

	public Vet findById(Long id);
	
	public Vet save (Vet Vet);
	
	public Set<Vet> findAll();
}

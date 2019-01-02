package com.example.petclinic.service.map;

import com.example.petclinic.model.Vet;
import com.example.petclinic.service.CrudService;

public class VetMapBaseService extends AbstractMapBaseService<Vet, Long> implements CrudService<Vet, Long> {

	@Override
	public Vet save(Vet object) {
		return super.save(object.getId(), object);
	}

}

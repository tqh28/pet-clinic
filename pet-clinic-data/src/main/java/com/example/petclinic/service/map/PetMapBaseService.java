package com.example.petclinic.service.map;

import com.example.petclinic.model.Pet;
import com.example.petclinic.service.CrudService;

public class PetMapBaseService extends AbstractMapBaseService<Pet, Long> implements CrudService<Pet, Long> {

	@Override
	public Pet save(Pet object) {
		return super.save(object.getId(), object);
	}

}

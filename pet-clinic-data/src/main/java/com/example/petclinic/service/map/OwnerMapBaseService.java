package com.example.petclinic.service.map;

import com.example.petclinic.model.Owner;
import com.example.petclinic.service.CrudService;

public class OwnerMapBaseService extends AbstractMapBaseService<Owner, Long> implements CrudService<Owner, Long> {

	@Override
	public Owner save(Owner object) {
		return super.save(object.getId(), object);
	}

}

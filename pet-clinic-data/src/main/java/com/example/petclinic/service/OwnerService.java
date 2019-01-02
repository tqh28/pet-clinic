package com.example.petclinic.service;

import com.example.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>  {

	public Owner findByLastName(String lastName);
}

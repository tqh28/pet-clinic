package com.example.petclinic.service.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public abstract class AbstractMapBaseService<T, ID> {
	
	private Map<ID, T> data = new HashMap<>();
	
	public T findById(ID id) {
		return data.get(id);
	}

	public T save(ID id, T object) {
		return data.put(id, object);
	}

	public Set<T> findAll() {
		return (Set<T>) data.values();
	}

	public void deleteById(ID id) {
		data.remove(id);
	}
	
	public void delete(T object) {
		data.entrySet().removeIf(ele -> {
			return ele.equals(object);
		});
	}

}

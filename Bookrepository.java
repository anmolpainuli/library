package com.example.Spring3;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Bookrepository extends  CrudRepository<Entities,Integer>{

	List<Entities> findAll();
	public Entities findById(int id);

}

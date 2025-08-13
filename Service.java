package com.example.Spring3;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Service {
	
	@Autowired
	private Bookrepository brepository ;
	
	public List<Entities> getallbook(){
		List <Entities> list  = (List<Entities>) this.brepository.findAll();
		return list;
	}
	
	public Entities getbookbyid(int id) {
		
		Entities entity = null;
	try {
		entity = this.brepository.findById(id);
		
	}
	catch(Exception e) {
		e.printStackTrace();
	}
		return entity;
	}
	
	public Entities addbook(Entities b) {
		Entities result = this.brepository.save(b);
		return result;
		
	}
	
	public void deletebook(int bid ) {
		brepository.deleteById(bid);
	}

	
}

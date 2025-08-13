package com.example.Spring3;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@Autowired
	private Service sev;
	
	@GetMapping("/book")
	public List<Entities> getbook(){
		return this.sev.getallbook();
	}
	
	@GetMapping("/book/{id}")
	public Entities bookbyid(@PathVariable("id") int id ) {
		return this.sev.getbookbyid(id);
	}
	
	@PostMapping("/booking")
	public Entities addbooks(@RequestBody Entities keep) {
		Entities b = this.sev.addbook(keep);
				return b;
		
	}
	
	@DeleteMapping("/book/{id}")
	public void deletebooks(@PathVariable("id") int id) {
		this.sev.deletebook(id);
		
	}

}

package com.example.Spring3;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Books")
public class Entities {

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private int id ;
	private String author;
	private String title;
	
	public Entities () {
		
	}
	
	public Entities(int id, String author, String title) {
		super();
		this.id = id;
		this.author = author;
		this.title = title;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Entities [id=" + id + ", author=" + author + ", title=" + title + "]";
	}
	
	
	
}

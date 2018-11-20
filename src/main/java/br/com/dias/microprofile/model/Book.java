package br.com.dias.microprofile.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Book {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID", unique=true)
	private Integer id;

	@Column(name="NAME", nullable=false)
	private String name;
	
	@Column(name="AUTHOR", nullable=false)
	private String author;
	
	@Column(name="PAGES", nullable=false)
	private Integer pages;
	
	@Column(name="ISBN", nullable=false)
	private String isbn;

	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(Integer id, String name, String author, Integer pages, String isbn) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.pages = pages;
		this.isbn = isbn;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Integer getPages() {
		return pages;
	}

	public void setPages(Integer pages) {
		this.pages = pages;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}


	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", pages=" + pages + ", isbn=" + isbn + "]";
	}
	
	
}

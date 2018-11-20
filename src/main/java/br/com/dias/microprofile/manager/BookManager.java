package br.com.dias.microprofile.manager;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;

import javax.enterprise.context.ApplicationScoped;

import br.com.dias.microprofile.model.Book;

@ApplicationScoped
public class BookManager {
	
	private ConcurrentMap<String, Book> inMemoryStore = new ConcurrentHashMap<>();
	private int bookSequence = 0;
	
	
	public String add(Book book) {
		book.setId(Integer.toString(bookSequence++));
		inMemoryStore.put(book.getId(), book);
		return book.getId();
	}
	
	public Book getBookById(String id) {
		return inMemoryStore.get(id);
	}
	
	public List<Book> findAll(){
		return (List<Book>) inMemoryStore.values().stream().collect(Collectors.toList());
	}
	
	
	

}

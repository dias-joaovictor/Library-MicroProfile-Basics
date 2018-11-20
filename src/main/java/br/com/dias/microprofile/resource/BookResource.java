package br.com.dias.microprofile.resource;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import br.com.dias.microprofile.manager.BookManager;
import br.com.dias.microprofile.model.Book;

@Path("/books")
@RequestScoped
public class BookResource {

	@Inject
	private BookManager bookManager;
	
	
	@GET
	@Path("id")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getBook(@PathParam("id") String id) {
		return Response.ok(bookManager.getBookById(id)).build();
	}
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAllBooks() {
		return Response.ok(bookManager.findAll()).build();
	}
	
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response add(Book book) {
		String id = bookManager.add(book);
		return Response.created(UriBuilder.fromResource(this.getClass()).path(id).build()).build();
	}
	
}

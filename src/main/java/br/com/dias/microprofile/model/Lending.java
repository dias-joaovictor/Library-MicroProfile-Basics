package br.com.dias.microprofile.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class Lending implements Serializable{
	
	private static final long serialVersionUID = -683181155614461253L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID", unique=true)
	private Integer id;
	
	@OneToOne(optional=false)
	@JoinColumn(name="CLIENTID", referencedColumnName="ID", nullable=false )
	private Client client;
	
	@OneToMany
	@JoinColumn(name="BOOKID", referencedColumnName="ID", nullable=false )
	private List<Book> books;
	
	@Column(name="LENDINGDATE", nullable=false)
	@Temporal(TemporalType.DATE)
	private Date lendingDate;
	
	@Column(name="EXPIRATIONLENDINGDATE", nullable=false)
	@Temporal(TemporalType.DATE)
	private Date expirationLendingDate;
	
	@Column(name="RETURNDATE", nullable=true)
	@Temporal(TemporalType.DATE)
	private Date returnDate;
	
	@Column(name="PRICE", nullable=false)
	private double price;
	
	@Column(name="PENALTYVALUE", nullable=false)
	private double penaltyValue;
	
	
	public Lending() {
		// TODO Auto-generated constructor stub
	}

	public Lending(Integer id, Client client, List<Book> books, Date lendingDate, Date expirationLendingDate,
			double price, double penaltyValue) {
		super();
		this.id = id;
		this.client = client;
		this.books = books;
		this.lendingDate = lendingDate;
		this.expirationLendingDate = expirationLendingDate;
		this.price = price;
		this.penaltyValue = penaltyValue;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public Date getLendingDate() {
		return lendingDate;
	}

	public void setLendingDate(Date lendingDate) {
		this.lendingDate = lendingDate;
	}

	public Date getExpirationLendingDate() {
		return expirationLendingDate;
	}

	public void setExpirationLendingDate(Date expirationLendingDate) {
		this.expirationLendingDate = expirationLendingDate;
	}

	public Date getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPenaltyValue() {
		return penaltyValue;
	}

	public void setPenaltyValue(double penaltyValue) {
		this.penaltyValue = penaltyValue;
	}

	@Override
	public String toString() {
		return "Lending [id=" + id + ", client=" + client + ", books=" + books + ", lendingDate=" + lendingDate
				+ ", expirationLendingDate=" + expirationLendingDate + ", returnDate=" + returnDate + ", price=" + price
				+ ", penaltyValue=" + penaltyValue + "]";
	}
	
	
	
	

}

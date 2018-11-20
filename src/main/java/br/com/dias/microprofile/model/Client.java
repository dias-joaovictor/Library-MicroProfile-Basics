package br.com.dias.microprofile.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class Client implements Serializable {

	private static final long serialVersionUID = -3202962252367308873L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID", unique=true)
	private Integer id;

	@Column(name="NAME", nullable=false)
	private String name;

	@Column(name="LASTNAME", nullable=false)
	private String lastName;
	
	@Column(name="CPF", length=11)
	private String cpf;
	
	@OneToOne(optional=false)
	@JoinColumn(name="USERID", referencedColumnName="ID", nullable=false )
	private User user;

	
	public Client() {
		// TODO Auto-generated constructor stub
	}

	public Client(Integer id, String name, String lastName, String cpf) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.cpf = cpf;
	}

	public Client(Integer id, String name, String lastName, String cpf, User user) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.cpf = cpf;
		this.user = user;
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

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", name=" + name + ", lastName=" + lastName + ", cpf=" + cpf + ", user=" + user
				+ "]";
	}

}

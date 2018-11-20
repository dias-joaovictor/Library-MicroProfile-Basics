package br.com.dias.microprofile.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="LIB_USER")
public class User implements Serializable{

	
	private static final long serialVersionUID = 6661877120995334002L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID", unique=true)
	private Integer id;
	
	@Column(name="LOGIN", unique=true, nullable=false)
	private String login;
	
	@Column(name="EMAIL", unique=true, nullable=false)
	private String email;
	
	@Column(name="PASSWORD", unique=true, nullable=false)
	private String password;
	
	@OneToOne(optional=false)
	@JoinColumn(name="CLIENTID", referencedColumnName="ID", nullable=false )
	private Client client;
	
	
	public User(Integer id, String login, String email, String password) {
		super();
		this.id = id;
		this.login = login;
		this.email = email;
		this.password = password;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", login=" + login + ", email=" + email + "]";
	}
	
	
}

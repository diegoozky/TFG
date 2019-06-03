package com.example.tfg.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

// la etiqueta crea la tabla en la bd

@Entity 
@Table(name="Usuario")
public class UsuarioModel {
	
	//atributos
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(unique=true)
	private String correo;
	
	@Column(unique=true)
	private String username;
	
	private String password;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="Rol")
	private Set<RolModel> listaRoles = new HashSet<RolModel>();
	
	
	/*getters y setters*/
	
	public Set<RolModel> getListaRoles() {
		return listaRoles;
	}

	public void setListaRoles(Set<RolModel> listaRoles) {
		this.listaRoles = listaRoles;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}

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
import javax.persistence.ManyToOne;
import javax.persistence.Table;

// la etiqueta crea la tabla en la bd

@Entity 
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
	
	@ManyToOne
	@JoinColumn(name="rolModel_id",referencedColumnName = "id", updatable = false)
	private RolModel rolModel;
	
	
	/*getters y setters*/
	

	public Integer getId() {
		return id;
	}

	

	public RolModel getRolModel() {
		return rolModel;
	}



	public void setRolModel(RolModel rolModel) {
		this.rolModel = rolModel;
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

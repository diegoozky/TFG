package com.example.tfg.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

//La etiqueta 'Entity' crea la tabla en la bd

@Entity
public class RolModel {

	//atributos 

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String rol;

	@OneToMany(mappedBy="rolModel")
	private Set<UsuarioModel> usuariosRoles = new HashSet<UsuarioModel>();
	/* getter y setters */

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}



}

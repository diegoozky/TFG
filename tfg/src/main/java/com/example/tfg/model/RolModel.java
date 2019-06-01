package com.example.tfg.model;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//La etiqueta 'Entity' crea la tabla en la bd

@Entity
@Table(name = "Rol")
public class RolModel {

	//atributos 

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String rol;

	private ArrayList<UsuarioModel> listaUsarios;

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

	public ArrayList<UsuarioModel> getListaUsarios() {
		return listaUsarios;
	}

	public void setListaUsarios(ArrayList<UsuarioModel> listaUsarios) {
		this.listaUsarios = listaUsarios;
	}

}

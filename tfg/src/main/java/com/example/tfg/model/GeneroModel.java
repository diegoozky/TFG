package com.example.tfg.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

//La etiqueta Entity hace que cree la entidad en nuestra base de datos
//y la etiqueta table le asigna el nombre de la entidad
@Entity
@Table(name="Genero")
public class GeneroModel {
	
	// Atributos

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String genero;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="Pelicula")
	private Set<PeliculaModel> peliculas = new HashSet<PeliculaModel>();

	//Getters and Setters

	public Set<PeliculaModel> getPeliculas() {
		return peliculas;
	}

	public void setPeliculas(Set<PeliculaModel> peliculas) {
		this.peliculas = peliculas;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

}

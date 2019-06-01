package com.example.tfg.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/* La etiqueta 'Entity' crea la tabla en la bd*/
@Entity
@Table(name="Pelicula")
public class PeliculaModel {
	
	//atributos
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String titulo;
	
	private String duracion;
	
	private String productora;
	
	private String premios;
	
	private String estreno;
	
	private String presupuesto;
	
	private String ruta_img;
	
	@ManyToMany
	@JoinColumn(name="Genero")
	private Set<GeneroModel> listaGeneros = new HashSet<GeneroModel>();
	
	@ManyToMany
	@JoinColumn(name="Actor")
	private Set<ActorModel> listaActores = new HashSet<ActorModel>();
	
	@ManyToOne
	@JoinColumn(name="Director")
	private DirectorModel director;

	
	//getters y setters
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDuracion() {
		return duracion;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}

	public String getProductora() {
		return productora;
	}

	public void setProductora(String productora) {
		this.productora = productora;
	}

	public String getPremios() {
		return premios;
	}

	public void setPremios(String premios) {
		this.premios = premios;
	}

	public String getEstreno() {
		return estreno;
	}

	public void setEstreno(String estreno) {
		this.estreno = estreno;
	}

	public String getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(String presupuesto) {
		this.presupuesto = presupuesto;
	}

	public String getRuta_img() {
		return ruta_img;
	}

	public void setRuta_img(String ruta_img) {
		this.ruta_img = ruta_img;
	}


	public DirectorModel getDirector() {
		return director;
	}

	public void setDirector(DirectorModel director) {
		this.director = director;
	}

	public Set<GeneroModel> getListaGeneros() {
		return listaGeneros;
	}

	public void setListaGeneros(Set<GeneroModel> listaGeneros) {
		this.listaGeneros = listaGeneros;
	}

	public Set<ActorModel> getListaActores() {
		return listaActores;
	}

	public void setListaActores(Set<ActorModel> listaActores) {
		this.listaActores = listaActores;
	}

}

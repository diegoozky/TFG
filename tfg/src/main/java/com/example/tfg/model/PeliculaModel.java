package com.example.tfg.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/* La etiqueta 'Entity' crea la tabla en la bd*/
@Entity
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
	
	private String rutaImg;
	
	private String descripcion;
	
	private String trailer;

	@ManyToMany
	@JoinTable(name="peliculas_genero")
	private Set<GeneroModel> listaGeneros = new HashSet<GeneroModel>();
	
	@ManyToMany
	@JoinTable(name="actores_pelicula")
	private Set<ActorModel> listaActores = new HashSet<ActorModel>();
	
	@ManyToOne
	private DirectorModel director;

	
	//getters y setters
	
	public String getDescripcion() {
		return descripcion;
	}

	public String getTrailer() {
		return trailer;
	}

	public void setTrailer(String trailer) {
		this.trailer = trailer;
	}

	public void setRutaImg(String rutaImg) {
		this.rutaImg = rutaImg;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
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

	public DirectorModel getDirector() {
		return director;
	}

	public void setDirector(DirectorModel director) {
		this.director = director;
	}

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

	public String getRutaImg() {
		return rutaImg;
	}

	public void setRuta_img(String rutaImg) {
		this.rutaImg = rutaImg;
	}

}

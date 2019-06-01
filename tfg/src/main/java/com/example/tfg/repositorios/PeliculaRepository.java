package com.example.tfg.repositorios;

import org.springframework.data.repository.CrudRepository;

import com.example.tfg.model.PeliculaModel;


public interface PeliculaRepository extends CrudRepository<PeliculaModel, Integer>{
	
	public PeliculaModel findByTitulo(String titulo);
}

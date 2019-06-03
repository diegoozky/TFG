package com.example.tfg.repositorios;

import org.springframework.data.repository.CrudRepository;

import com.example.tfg.model.DirectorModel;

public interface DirectorRepository extends CrudRepository<DirectorModel, Integer>{
	DirectorModel findByNombre(String nombre);
}

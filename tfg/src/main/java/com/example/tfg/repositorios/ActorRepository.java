package com.example.tfg.repositorios;

import org.springframework.data.repository.CrudRepository;

import com.example.tfg.model.ActorModel;

public interface ActorRepository extends CrudRepository<ActorModel, Integer>{
	ActorModel findByNombre(String nombre);
}

package com.example.tfg.repositorios;

import org.springframework.data.repository.CrudRepository;

import com.example.tfg.model.RolModel;

public interface RolRepository extends CrudRepository<RolModel, Integer> {
	RolModel findByRol(String rol);
}

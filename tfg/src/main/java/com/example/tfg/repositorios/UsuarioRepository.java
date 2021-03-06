package com.example.tfg.repositorios;

import org.springframework.data.repository.CrudRepository;


import com.example.tfg.model.UsuarioModel;

public interface UsuarioRepository extends CrudRepository<UsuarioModel, Integer>{
	public UsuarioModel findByUsername(String username);
	public UsuarioModel findByCorreo(String correo);
}

package com.example.tfg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tfg.repositorios.UsuarioRepository;

//Añadimos la etiqueta RestController para indicar que es un controlador de un servicio restful
//Con la etiqueta RequestMapping indicamos el path que va a tener
@RestController
@RequestMapping(path="/user")
public class UserController {
	//A continuacion abrimos el repositorio gracias a la etiqueta Autowired
		@Autowired
		UsuarioRepository usuarioRepositorio;
}

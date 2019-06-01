package com.example.tfg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.tfg.model.PeliculaModel;
import com.example.tfg.repositorios.PeliculaRepository;

//Añadimos la etiqueta RestController para indicar que es un controlador de un servicio restful
//Con la etiqueta RequestMapping indicamos el path que va a tener
@RestController
@RequestMapping(path="/pelicula")
public class ControllerPelicula {
	
	//A continuacion abrimos el repositorio gracias a la etiqueta Autowired
	@Autowired
	PeliculaRepository peliculaRepositorio;
	
	//Metodo que devuelve todas las peliculas de nuestra BD
	@GetMapping
	@CrossOrigin
	public @ResponseBody Iterable<PeliculaModel> allPelis(){
		return peliculaRepositorio.findAll();
	}
	
	@PostMapping
	@CrossOrigin
	public @ResponseBody boolean addPelis(@RequestBody PeliculaModel p){
		if(peliculaRepositorio.findByTitulo(p.getTitulo())==null) {
			peliculaRepositorio.save(p);
			return true;
		}
		return false;
	}
}

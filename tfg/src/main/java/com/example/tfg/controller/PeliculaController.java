package com.example.tfg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.tfg.model.DirectorModel;
import com.example.tfg.model.PeliculaModel;
import com.example.tfg.repositorios.DirectorRepository;
import com.example.tfg.repositorios.PeliculaRepository;

//Añadimos la etiqueta RestController para indicar que es un controlador de un servicio restful
//Con la etiqueta RequestMapping indicamos el path que va a tener
@RestController
@RequestMapping(path="/pelicula")
public class PeliculaController {
	
	//A continuacion abrimos el repositorio gracias a la etiqueta Autowired
	@Autowired
	PeliculaRepository peliculaRepositorio;
	
	@Autowired
	DirectorRepository repo;
	
	//Metodo que devuelve todas las peliculas de nuestra BD
	@GetMapping
	@CrossOrigin
	public @ResponseBody Iterable<PeliculaModel> allPelis(){
		return peliculaRepositorio.findAll();
	}
	
	//Insertar un dato en la bd y devuelve true o false dependiendo si se ha podido realizar la accion
	@PostMapping
	@CrossOrigin
	public @ResponseBody boolean addPelis(@RequestBody PeliculaModel p){
		if(peliculaRepositorio.findByTitulo(p.getTitulo())==null) {
			DirectorModel d = repo.findByNombre(p.getDirector().getNombre());
			p.setDirector(d);
			peliculaRepositorio.save(p);
			return true;
		}
		return false;
	}
	
	//Actualiza la bd y devuelve true o false si es posible la accion 
	@PutMapping
	@CrossOrigin
	public @ResponseBody boolean updatePelis(@RequestBody PeliculaModel p){
		if(peliculaRepositorio.findByTitulo(p.getTitulo())!=null){
			peliculaRepositorio.save(p);
			return true;
		}
		return false;
	}
	
	//Borra un dato de la bd y devuelve un true o un false si es posible la acción
	@DeleteMapping
	@CrossOrigin
	public @ResponseBody boolean borrarPelis(@RequestBody PeliculaModel p) {
		if(peliculaRepositorio.findByTitulo(p.getTitulo())!=null){
			peliculaRepositorio.delete(p);
			return true;
		}
		return false;
	}
}

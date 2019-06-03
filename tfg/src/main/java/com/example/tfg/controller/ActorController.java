package com.example.tfg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.tfg.model.ActorModel;
import com.example.tfg.repositorios.ActorRepository;

//Añadimos la etiqueta RestController para indicar que es un controlador de un servicio restful
//Con la etiqueta RequestMapping indicamos el path que va a tener
@RestController
@RequestMapping(path="/actor")
public class ActorController {
	
	//A continuacion abrimos el repositorio gracias a la etiqueta Autowired
	@Autowired
	ActorRepository actorRepositorio;
		
	//Metodo que devuelve todas los actores de nuestra BD
	@GetMapping(path="/actores")
	@CrossOrigin
	public @ResponseBody Iterable<ActorModel> allActores(){
		return actorRepositorio.findAll();
	}
	
	//Métdo para insertar un actor y devuelve un booleano dependiendo si es posible hacer la accion
	@PostMapping
	@CrossOrigin
	public @ResponseBody boolean addActor(@RequestBody ActorModel a) {
		if(actorRepositorio.findByNombre(a.getNombre())==null){
			actorRepositorio.save(a);
			return true;
		}
		return false;
	}
	
	//Método que actualiza la bd y devuelve un booleano dependiendo de si es posible realizar la accion
	@PutMapping
	@CrossOrigin
	public @ResponseBody boolean updateActor(@RequestBody ActorModel a) {
		if(actorRepositorio.findByNombre(a.getNombre())!=null){
			actorRepositorio.save(a);
			return true;
		}
		return false;
	}
	
	//Metodo que borra un actor de la bd y devuelve un booleano si es posible la accion
	@DeleteMapping
	@CrossOrigin
	public @ResponseBody boolean borrarActores(@RequestBody ActorModel a){
		if(actorRepositorio.findByNombre(a.getNombre())!=null) {
			actorRepositorio.delete(a);
			return true;
		}
		return false;
	}
	
	//Metodo de prueba
	@GetMapping(path="/prueba")
	@CrossOrigin
	public @ResponseBody ActorModel pruebaPeli(@RequestParam String nombre){
		
		return actorRepositorio.findByNombre(nombre);
	}

}

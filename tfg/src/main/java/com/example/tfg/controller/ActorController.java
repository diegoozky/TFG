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

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//Añadimos la etiqueta RestController para indicar que es un controlador de un servicio restful
//Con la etiqueta RequestMapping indicamos el path que va a tener
@RestController
@RequestMapping(path="/actor") 
public class ActorController {
	
	//A continuacion abrimos el repositorio gracias a la etiqueta Autowired
	@Autowired
	ActorRepository actorRepositorio;
		
	static Logger logHelper = LogManager.getLogger(ActorController.class);

	//Metodo que devuelve todas los actores de nuestra BD
	@GetMapping(path="/actores")
	@CrossOrigin
	public @ResponseBody Iterable<ActorModel> allActores(){
		logHelper.warn("Devolución de todos los actores");
		return actorRepositorio.findAll();
	}
	
	//Métdo para insertar un actor y devuelve un booleano dependiendo si es posible hacer la accion
	@PostMapping
	@CrossOrigin
	public @ResponseBody boolean addActor(@RequestBody ActorModel a) {
		if(actorRepositorio.findByNombre(a.getNombre())==null){
			actorRepositorio.save(a);
			logHelper.warn("Actor creado correctamente");
			return true;
		}
		logHelper.error("El actor no se ha podido crear");
		return false;
	}
	
	//Método que actualiza la bd y devuelve un booleano dependiendo de si es posible realizar la accion
	@PutMapping
	@CrossOrigin
	public @ResponseBody boolean updateActor(@RequestBody ActorModel a) {
		if(actorRepositorio.findById(a.getId())!=null){
			actorRepositorio.save(a);
			logHelper.warn("Actor actualizado correctamente");
			return true;
		}
		logHelper.error("No se ha podido actualizar el actor");
		return false;
	}
	
	//Metodo que borra un actor de la bd y devuelve un booleano si es posible la accion
	@DeleteMapping
	@CrossOrigin
	public @ResponseBody boolean borrarActores(@RequestBody ActorModel a){
		if(actorRepositorio.findByNombre(a.getNombre())!=null) {
			actorRepositorio.delete(a);
			logHelper.warn("Actor borrado correctamente");

			return true;
		}
		logHelper.error("No se ha podido borrar el actor");
		return false;
	}
	
	//Metodo de prueba
	@GetMapping(path="/prueba")
	@CrossOrigin
	public @ResponseBody ActorModel pruebaPeli(@RequestParam String nombre){
		
		return actorRepositorio.findByNombre(nombre);
	}

}

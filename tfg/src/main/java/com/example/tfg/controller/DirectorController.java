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

import com.example.tfg.model.DirectorModel;
import com.example.tfg.repositorios.DirectorRepository;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


//Añadimos la etiqueta RestController para indicar que es un controlador de un servicio restful
//Con la etiqueta RequestMapping indicamos el path que va a tener
@RestController
@RequestMapping(path="/director")
public class DirectorController {
	
	//A continuacion abrimos el repositorio gracias a la etiqueta Autowired
	@Autowired
	DirectorRepository directorRepositorio;
	
	static Logger logHelper = LogManager.getLogger(DirectorModel.class);
	
	//Metodo que devuelve todos los directores de la bd
	@GetMapping
	@CrossOrigin
	public @ResponseBody Iterable<DirectorModel> allDirectores(){
		logHelper.warn("Se han devuelto todos los directores");
		return directorRepositorio.findAll();
	}
	
	//Método que inserta un director en la bd y devuelve un boolean si se puede realizar la accion
	@PostMapping
	@CrossOrigin
	public @ResponseBody boolean addDirector(@RequestBody DirectorModel d){
		if(directorRepositorio.findByNombre(d.getNombre())==null) {
			directorRepositorio.save(d);
			logHelper.warn("Se ha añadido el director correctamente");
			return true;
		}
		logHelper.error("No se ha podido crear el director");
		return false;
	}
	
	//Metodo que modifica un director y devuleve un boolean si es posible realizar la accion
	@PutMapping
	@CrossOrigin
	public @ResponseBody boolean updateDirector(@RequestBody DirectorModel d) {
		if(directorRepositorio.findById(d.getId())!=null) {
			directorRepositorio.save(d);
			logHelper.warn("Se ha actualizado el director correctamente");
			return true;
		}
		logHelper.error("No se ha podido acturalizar el director");
		return false;
	}
	
	//Método que borra un Director y devuelve un boolean dependiendo si se puede realiar la accion
	@DeleteMapping
	@CrossOrigin
	public @ResponseBody boolean borrarDirector(@RequestParam Integer id) {
		if(directorRepositorio.findById(id)!=null) {
			directorRepositorio.deleteById(id);
			logHelper.warn("Se ha borrar el director correctamente");
			return true;
		}
		logHelper.error("No se ha podido borrar el director");
		return false;
	}
}

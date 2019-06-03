package com.example.tfg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.tfg.model.DirectorModel;
import com.example.tfg.repositorios.DirectorRepository;


//Añadimos la etiqueta RestController para indicar que es un controlador de un servicio restful
//Con la etiqueta RequestMapping indicamos el path que va a tener
@RestController
@RequestMapping(path="/director")
public class DirectorController {
	
	//A continuacion abrimos el repositorio gracias a la etiqueta Autowired
	@Autowired
	DirectorRepository directorRepositorio;
	
	//Metodo que devuelve todos los directores de la bd
	public @ResponseBody Iterable<DirectorModel> allDirectores(){
		return directorRepositorio.findAll();
	}
	
	//Método que inserta un director en la bd y devuelve un boolean si se puede realizar la accion
	public @ResponseBody boolean addDirector(@RequestBody DirectorModel d){
		if(directorRepositorio.findByNombre(d.getNombre())==null) {
			directorRepositorio.save(d);
			return true;
		}
		return false;
	}
	
	//Metodo que modifica un director y devuleve un boolean si es posible realizar la accion
	public @ResponseBody boolean updateDirector(@RequestBody DirectorModel d) {
		if(directorRepositorio.findByNombre(d.getNombre())!=null) {
			directorRepositorio.save(d);
			return true;
		}
		return false;
	}
	
	//Método que borra un Director y devuelve un boolean dependiendo si se puede realiar la accion
	public @ResponseBody boolean borrarDirector(@RequestBody DirectorModel d) {
		if(directorRepositorio.findByNombre(d.getNombre())!=null) {
			directorRepositorio.delete(d);
			return true;
		}
		
		return false;
	}
}
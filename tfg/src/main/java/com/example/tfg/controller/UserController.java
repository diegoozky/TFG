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

import com.example.tfg.model.UsuarioModel;
import com.example.tfg.repositorios.UsuarioRepository;

//Añadimos la etiqueta RestController para indicar que es un controlador de un servicio restful
//Con la etiqueta RequestMapping indicamos el path que va a tener
@RestController
@RequestMapping(path="/user")
public class UserController {
	
	//A continuacion abrimos el repositorio gracias a la etiqueta Autowired
	@Autowired
	UsuarioRepository usuarioRepositorio;
	
	//Metodo que devuelve todos las usuarios de nuestra BD
	@GetMapping
	@CrossOrigin
	public @ResponseBody Iterable<UsuarioModel> allUsuarios(){
		return usuarioRepositorio.findAll();
	}
	
	//Metodo que te devuelve un usuario con el nombre y el rol para comprobar
	@PostMapping
	@CrossOrigin
	public @ResponseBody UsuarioModel verificacion(@RequestBody UsuarioModel u) {
		UsuarioModel uVerificado = new UsuarioModel();
		if(usuarioRepositorio.findByUsername(u.getUsername())!=null) {
			UsuarioModel uOk= usuarioRepositorio.findByUsername(u.getUsername());
			uVerificado.setUsername(uOk.getUsername());
			uVerificado.setCorreo(uOk.getCorreo());
			uVerificado.setListaRoles(uOk.getListaRoles());
			return uVerificado;
		}
		return null;
	}
	
	//Metodo que inserta un usuario en la bd y devuelve true o false dependiendo si se ha podido realizar la accion
	@PostMapping
	@CrossOrigin
	public @ResponseBody boolean addUsuario(@RequestBody UsuarioModel u) {
		if(usuarioRepositorio.findByUsername(u.getUsername())==null) {
			usuarioRepositorio.save(u);
			return true;
		}
		return false;
	}
	
	//Metodo actualiza un usuario y devuelve true o false si es posible la accion 
	@PutMapping
	@CrossOrigin
	public @ResponseBody boolean updateUsuarios(@RequestBody UsuarioModel u) {
		if(usuarioRepositorio.findByUsername(u.getUsername())!=null) {
			usuarioRepositorio.save(u);
			return true;
		}
		return false;
	}
	
	//Borra un usuario de la bd y devuelve un true o un false si es posible la acción
	@DeleteMapping
	@CrossOrigin
	public @ResponseBody boolean borrarUsuarios(@RequestBody UsuarioModel u) {
		if(usuarioRepositorio.findByUsername(u.getUsername())!=null) {
			usuarioRepositorio.delete(u);
			return true;
		}
		return false;
	}
}

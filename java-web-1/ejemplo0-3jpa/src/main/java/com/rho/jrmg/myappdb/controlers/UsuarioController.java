package com.rho.jrmg.myappdb.controlers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rho.jrmg.myappdb.models.UsuarioModel;
import com.rho.jrmg.myappdb.service.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	@Autowired
	UsuarioService usuarioServicio;
	
	@GetMapping()
	public ArrayList<UsuarioModel> obtenerUsuarios() {
		return usuarioServicio.obtenerUsuario();
	}
	
	@PostMapping()
	public UsuarioModel guardarUsuario(@RequestBody UsuarioModel usuario) {
		return this.usuarioServicio.guardarUsuario(usuario);
	}
	
	@GetMapping("/query")
	public ArrayList<UsuarioModel> obtenerUsuarioPorPrioridad(@RequestParam("prioridad")Integer prioridad){
		return this.usuarioServicio.obtenerPrioridad(prioridad);
	}
	@GetMapping(path = "/{id}")
	public Optional<UsuarioModel> obtenerUsuarioPorId(@PathVariable("id") long id) {
		return this.usuarioServicio.obtenerPorId(id);
	}

	@DeleteMapping("/{id}")
	public String eliminarPorId(@PathVariable("id") Long id) {
		boolean check=this.usuarioServicio.eliminarUsuario(id);
		if (check) {
			return "Se elimino el usuario " + id;
		} else {
			return "No se pudo eliminar el usuario " + id;
		}

	}

}

package com.rho.jrmg.myappdb.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.rho.jrmg.myappdb.models.UsuarioModel;
import com.rho.jrmg.myappdb.repositories.UsuarioRepository;

@Service
public class UsuarioService {
	@Autowired
	UsuarioRepository usuarioRepositorio;
	public ArrayList<UsuarioModel> obtenerUsuario() {
		return (ArrayList<UsuarioModel>)usuarioRepositorio.findAll();
	}
	
	public UsuarioModel guardarUsuario(UsuarioModel usuario) {
		return usuarioRepositorio.save(usuario);
	}
	
	public ArrayList<UsuarioModel> obtenerPrioridad(Integer prioridad) {
		return usuarioRepositorio.findByPrioridad(prioridad);
	}
	
	public Optional<UsuarioModel> obtenerPorId(long id) {
		return usuarioRepositorio.findById(id);
	}
	
	public boolean eliminarUsuario(Long id) {
		try {
			usuarioRepositorio.deleteById(id);
			return true;
			
		} catch (Exception e) {
			return false;
		}
	}
	
	
}

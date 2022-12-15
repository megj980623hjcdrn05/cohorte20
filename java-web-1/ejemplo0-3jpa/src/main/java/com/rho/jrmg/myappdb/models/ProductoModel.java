package com.rho.jrmg.myappdb.models;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import jakarta.persistence.Table;

@Entity
@Table(name = "producto")
public class ProductoModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Long id;
	private String nombreProducto;
	

	//relaciones
	@ManyToOne // muchos productos a un usuario
	private UsuarioModel usuario;
	//relaciones
	//---------------------------------------------------------------
	public ProductoModel() {
		super();
	}
	

public ProductoModel(Long id, String nombreProducto, UsuarioModel usuario) {
		super();
		this.id = id;
		this.nombreProducto = nombreProducto;
		this.usuario = usuario;
	}


//-----------------------------------------------------------------------------------
	
	

	

	public UsuarioModel getUsuario() {
		return usuario;
	}
	
	public void setUsuario(UsuarioModel usuario) {
		this.usuario = usuario;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	
	
	
}

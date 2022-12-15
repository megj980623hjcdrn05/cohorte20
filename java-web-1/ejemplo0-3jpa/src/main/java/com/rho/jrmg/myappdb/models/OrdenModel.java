package com.rho.jrmg.myappdb.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "orden")
public class OrdenModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Long id;
	private String nombreOrden;
	
	//relaciones------------------------------------------------------
	@ManyToOne // muchas ordenes a un usuario
	private UsuarioModel usuario;
	@OneToOne(mappedBy = "orden")
	private DetalleOrdenModel detalleOrden;

	//relaciones-------------------------------------------------------------
	
	
	public OrdenModel() {
		super();
	}
	
	public OrdenModel(Long id, String nombreOrden, UsuarioModel usuario, DetalleOrdenModel detalleOrden) {
		super();
		this.id = id;
		this.nombreOrden = nombreOrden;
		this.usuario = usuario;
		this.detalleOrden = detalleOrden;
	}
	//----------------------------------------------------------------------
	public DetalleOrdenModel getDetalleOrden() {
		return detalleOrden;
	}
	public void setDetalleOrden(DetalleOrdenModel detalleOrden) {
		this.detalleOrden = detalleOrden;
	}
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
	public String getNombreOrden() {
		return nombreOrden;
	}
	public void setNombreOrden(String nombreOrden) {
		this.nombreOrden = nombreOrden;
	}
	
	
}

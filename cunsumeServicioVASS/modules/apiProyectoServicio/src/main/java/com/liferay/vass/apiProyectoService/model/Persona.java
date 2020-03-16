package com.liferay.vass.apiProyectoService.model;

public class Persona {
	
	private Long cedula;
	private String nombre;
	private String foto;
	
	public Persona(Long cedula, String nombre, String foto) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.foto = foto;
	}
	
	public Persona() {
		
	}
	
		
	public Long getCedula() {
		return cedula;
	}
	public void setCedula(Long cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	

}

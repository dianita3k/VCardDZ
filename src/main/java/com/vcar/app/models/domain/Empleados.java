package com.vcar.app.models.domain;

public class Empleados {
	
	private String nombrecompleto;

    private String ciudad;
    private String horarios;
    private String correo;
    private String celular;
    private String cargo;
    private String foto;

    
    

	public Empleados(String nombrecompleto, String ciudad, String horarios, String correo, String celular, String cargo,
			String foto) {
	
		this.nombrecompleto = nombrecompleto;
		this.ciudad = ciudad;
		this.horarios = horarios;
		this.correo = correo;
		this.celular = celular;
		this.cargo = cargo;
		this.foto = foto;
	}
	public String getNombrecompleto() {
		return nombrecompleto;
	}
	public void setNombrecompleto(String nombrecompleto) {
		this.nombrecompleto = nombrecompleto;
	}
	
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getHorarios() {
		return horarios;
	}
	public void setHorarios(String horarios) {
		this.horarios = horarios;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
    

}

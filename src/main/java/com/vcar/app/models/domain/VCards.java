package com.vcar.app.models.domain;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class VCards {
	 @Value("${card.titulo}")
	 private String titulo;
	 
	 @Value("${card.nombempresa}")
	 private String nombempresa;
	 
	 @Value("${card.paginaweb}")
	 private String paginaweb;
	 
	 @Value("${card.direccionemp}")
	 private String direccionemp;
	 
	 @Autowired
	 public List<Empleados> empleado;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getNombempresa() {
		return nombempresa;
	}

	public void setNombempresa(String nombempresa) {
		this.nombempresa = nombempresa;
	}

	public String getPaginaweb() {
		return paginaweb;
	}

	public void setPaginaweb(String paginaweb) {
		this.paginaweb = paginaweb;
	}

	public List<Empleados> getEmpleado() {
		return empleado;
	}

	public void setEmpleado(List<Empleados> empleado) {
		this.empleado = empleado;
	}

	public String getDireccionemp() {
		return direccionemp;
	}

	public void setDireccionemp(String direccionemp) {
		this.direccionemp = direccionemp;
	}
	
	
	 
	 
	 
	 
	 

}

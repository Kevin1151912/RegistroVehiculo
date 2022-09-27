/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kevin
 */
public class Persona {
	
	private String cedula;
	private String nombre;
	private String apellido;
	private String telefono;
	
	private List<Persona> personas = new ArrayList<Persona>();
	
	

	public Persona() {
	}

	public Persona(String cedula, String nombre, String apellido, String telefono) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
	}

	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Persona [cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono
				+ "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		Persona persona = (Persona)obj;

		if(this.getCedula().equals(persona.getCedula()) && this.getNombre().equals(persona.getNombre())
				&& this.getApellido().equals(persona.getApellido()) && this.getTelefono().equals(persona.getTelefono()))
			return true;
		else
			return false;
	}


	public void guardarPersona(Persona dueño) {
		personas.add(dueño);
	}
	
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author kevin
 */
public class Fachada {

	private static Fachada instance;
	
	private Persona persona = new Persona();
	private Vehiculo vehiculo = new Vehiculo();
	
	public static Fachada getInstance() {
		if (instance == null)
			instance = new Fachada();
		return instance;
	}

	public void registrarVehiculo(String placa, String modelo, String marca, Persona dueño) {
		
		Vehiculo vehiculo1 = new Vehiculo();
		
		vehiculo1.setPlaca(placa);
		vehiculo1.setModelo(modelo);
		vehiculo1.setMarca(marca);
		vehiculo1.setDueño(dueño);
		
		vehiculo.guardarVehiculo(vehiculo1);
	}
	
	public void registrarPersonas(String cedula, String nombre, String apellido, String telefono) {
		
		Persona persona1 = new Persona();
		
		persona1.setCedula(cedula);
		persona1.setNombre(nombre);
		persona1.setApellido(apellido);
		persona1.setTelefono(telefono);
		
		persona.guardarPersona(persona1);
	}
	
	public Vehiculo consultarVehiculo(String placa) {
		return vehiculo.consultarVehiculo(placa);
		
	}
}

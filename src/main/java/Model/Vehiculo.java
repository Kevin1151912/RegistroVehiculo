/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author kevin
 */
public class Vehiculo {

    private String placa;
    private String modelo;
    private String marca;

    private Persona dueño;

    private ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();

    public Vehiculo() {
        dueño = new Persona();
    }

    public Vehiculo(String placa, String modelo, String marca, Persona dueño) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;

        dueño = new Persona();
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Persona getDueño() {
        return dueño;
    }

    public void setDueño(Persona dueño) {
        this.dueño = dueño;
    }

    @Override
    public String toString() {
        return "Vehiculo [placa=" + placa + ", modelo=" + modelo + ", marca=" + marca + ", due�o=" + dueño
                + ", vehiculos=" + vehiculos + "]";
    }

    @Override
    public boolean equals(Object obj) {
        Vehiculo vehiculo = (Vehiculo) obj;
        if (this.getPlaca().equals(vehiculo.getPlaca())) {
            return true;
        } else {
            return false;
        }
    }

    public void guardarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    //Realiza consulta de vehiculo y retorna los datos del vehiculo en existencia.
    public Vehiculo consultarVehiculo(String placa) {

        Persona person1 = new Persona("101010", "Jezael", "Ropero", "3107516");

        Vehiculo vehiculo1 = new Vehiculo("PAW155", "125", "AKT", null);
        vehiculo1.setDueño(person1);

        vehiculos.add(vehiculo1);

        for (Vehiculo vehiculoActual : vehiculos) {
            if (vehiculoActual.getPlaca().equals(placa)) {
                System.out.println("Vehiculo encontrado");
                return vehiculoActual;
            } else {
                System.out.println("Vehiculo no existente");
            }
        }
        return null;
    }

}
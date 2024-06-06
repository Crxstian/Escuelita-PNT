package org.example.entity;

public class Gaseosa extends Producto{
    private double litros;

    public Gaseosa(String nombre,double litros ,Integer precio) {
        super(nombre, precio);
        this.litros=litros;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " /// Litros: " + litros + " /// Precio: $" + precio;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public Integer getPrecio() {
        return precio;
    }

    public double getLitros() {
        return litros;
    }
}

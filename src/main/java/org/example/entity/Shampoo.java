package org.example.entity;

public class Shampoo extends Producto{
    private double contenido;

    public Shampoo(String nombre,double contenido, Integer precio) {
        super(nombre, precio);
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " /// Contenido: " + contenido + " /// Precio: $" + precio;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public Integer getPrecio() {
        return precio;
    }
}

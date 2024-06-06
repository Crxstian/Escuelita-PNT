package org.example.entity;

public class FrutaOVerdura extends Producto{
    public String unidadVenta;
    public FrutaOVerdura(String nombre,String unidadVenta,  Integer precio) {
        super(nombre, precio);
        this.unidadVenta = unidadVenta;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " /// Precio: $" + precio + " /// Unidad de venta: " + unidadVenta ;
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

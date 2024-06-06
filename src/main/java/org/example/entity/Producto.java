package org.example.entity;

 public abstract class Producto implements Comparable<Producto>{
     protected String nombre;
     protected Integer precio;

     @Override
     public int compareTo(Producto o) {
         return Double.compare(this.getPrecio(), o.getPrecio());
     }

     public Producto(String nombre, Integer precio){
         this.nombre = nombre;
         this.precio = precio;
     }
     public abstract String getNombre();
     public abstract Integer getPrecio();

     @Override
     public String toString() {
         return "Nombre: " + getNombre() + " /// Precio: $" + getPrecio();
     }
 }

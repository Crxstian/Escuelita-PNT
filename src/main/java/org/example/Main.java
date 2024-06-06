package org.example;

import org.example.entity.FrutaOVerdura;
import org.example.entity.Gaseosa;
import org.example.entity.Producto;
import org.example.entity.Shampoo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        List<Producto> productosCargados = cargarListaProductos();

        imprimirDatosProductos(productosCargados);

    }
    public static List<Producto> cargarListaProductos(){
        Gaseosa cocaColaZero = new Gaseosa("Coca-Cola Zero", 1.5, 20);
        Gaseosa cocaCola = new Gaseosa("Coca-Cola", 1.5, 18);
        Shampoo shampooSedal = new Shampoo("Shampoo Sedal", 500, 19);
        FrutaOVerdura frutillas = new FrutaOVerdura("Frutillas", "kilo", 64);

        List<Producto> productos = new ArrayList<>();
        productos.add(cocaColaZero);
        productos.add(cocaCola);
        productos.add(shampooSedal);
        productos.add(frutillas);

        return productos;
    }
    public static void imprimirDatosProductos(List<Producto> productos){
        imprimirProductosToString(productos);
        System.out.println("=============================");
        imprimirMasCaro(productos);
        imprimirMasBarato(productos);


    }
    public static void imprimirProductosToString(List<Producto> listaProductosAImprimir){
        for(Producto producto : listaProductosAImprimir){
            System.out.println(producto.toString());
        }
    }
    public static void imprimirMasCaro(List<Producto> productos){
        Producto masCaro = Collections.max(productos);
        System.out.println("Producto más Caro: "+masCaro.getNombre());
    }
    public static void imprimirMasBarato(List<Producto> productos){
        Producto masBarato = Collections.min(productos);
        System.out.println("Producto más barato: "+masBarato.getNombre());
    }



}

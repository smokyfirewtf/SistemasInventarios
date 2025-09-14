package com.inventario;

import java.util.ArrayList;
import java.util.List;

// Patrón Singleton: solo puede existir una instancia de Inventario
public class Inventario {
    private static Inventario instancia;
    private final List<Producto> productos;

    private Inventario() {
        productos = new ArrayList<>();
    }

    public static Inventario getInstance() {
        if (instancia == null) {
            instancia = new Inventario();
        }
        return instancia;
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void mostrarInventario() {
        System.out.println("=== Inventario Actual ===");
        for (Producto p : productos) {
            p.mostrarDetalles(); // Usamos el método polimórfico
        }
    }
}

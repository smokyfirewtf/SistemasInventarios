package com.inventario;

// Producto concreto para la categoría de Oficina
public class ProductoOficina extends Producto {
    private final String material;

    public ProductoOficina(String nombre, double precio, int cantidad, String material) {
        super(nombre, precio, cantidad);
        this.material = material;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Categoría: Oficina | Nombre: " + nombre + " | Material: " + material + " | Precio: $" + precio + " | Stock: " + cantidad);
    }
}
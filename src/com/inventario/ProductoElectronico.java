package com.inventario;

// Producto concreto para la categoría de Electrónicos
public class ProductoElectronico extends Producto {
    private final String marca;

    public ProductoElectronico(String nombre, double precio, int cantidad, String marca) {
        super(nombre, precio, cantidad);
        this.marca = marca;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Categoría: Electrónico | Nombre: " + nombre + " | Marca: " + marca + " | Precio: $" + precio + " | Stock: " + cantidad);
    }
}
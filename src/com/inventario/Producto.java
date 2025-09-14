package com.inventario;

// Clase base abstracta para todos los productos
public abstract class Producto implements Cloneable {
    protected String nombre;
    protected double precio;
    protected int cantidad;

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    // Método abstracto para mostrar los detalles específicos de cada producto
    public abstract void mostrarDetalles();

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    // Implementación del patrón Prototype
    @Override
    public Producto clone() throws CloneNotSupportedException {
        try {
            return (Producto) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Error al clonar el producto.", e);
        }
    }
}
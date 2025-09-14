package com.inventario;

// Clase que implementa el patrón Factory Method
public class ProductoFactory {

    public static Producto crearProducto(String tipo, String nombre, double precio, int cantidad, String detalleAdicional) {
        switch (tipo.toLowerCase()) {
            case "electronico" -> {
                return new ProductoElectronico(nombre, precio, cantidad, detalleAdicional);
            }
            case "oficina" -> {
                return new ProductoOficina(nombre, precio, cantidad, detalleAdicional);
            }
            default -> throw new IllegalArgumentException("Tipo de producto no válido: " + tipo);
        }
    }
}
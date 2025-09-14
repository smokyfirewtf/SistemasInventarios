package com.inventario;

public class FabricaOficina implements FabricaProductos {
    @Override
    public Producto crearProducto(String nombre, double precio, int cantidad, String material) {
        return new ProductoOficina(nombre, precio, cantidad, material);
    }
}

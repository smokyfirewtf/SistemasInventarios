package com.inventario;

public interface FabricaProductos {
    Producto crearProducto(String nombre, double precio, int cantidad, String detalleAdicional);
}

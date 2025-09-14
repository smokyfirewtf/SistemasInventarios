package com.inventario;

public class FabricaElectronica implements FabricaProductos {
    @Override
    public Producto crearProducto(String nombre, double precio, int cantidad, String marca) {
        return new ProductoElectronico(nombre, precio, cantidad, marca);
    }
}

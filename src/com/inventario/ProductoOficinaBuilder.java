package com.inventario;

public class ProductoOficinaBuilder implements ProductoBuilder {
    private String nombre;
    private double precio;
    private int cantidad;
    private String material;

    @Override
    public void setNombre(String nombre) { this.nombre = nombre; }

    @Override
    public void setPrecio(double precio) { this.precio = precio; }

    @Override
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }

    @Override
    public void setDetalle(String detalle) { this.material = detalle; }

    @Override
    public Producto build() {
        return new ProductoOficina(nombre, precio, cantidad, material);
    }
}

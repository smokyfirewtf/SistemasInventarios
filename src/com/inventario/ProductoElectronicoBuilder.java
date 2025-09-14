package com.inventario;

public class ProductoElectronicoBuilder implements ProductoBuilder {
    private String nombre;
    private double precio;
    private int cantidad;
    private String marca;

    @Override
    public void setNombre(String nombre) { this.nombre = nombre; }

    @Override
    public void setPrecio(double precio) { this.precio = precio; }

    @Override
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }

    @Override
    public void setDetalle(String detalle) { this.marca = detalle; }

    @Override
    public Producto build() {
        return new ProductoElectronico(nombre, precio, cantidad, marca);
    }
}

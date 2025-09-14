package com.inventario;

public interface ProductoBuilder {
    void setNombre(String nombre);
    void setPrecio(double precio);
    void setCantidad(int cantidad);
    void setDetalle(String detalle);
    Producto build();
}

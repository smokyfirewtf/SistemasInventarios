package com.inventario;

/**
 * Director controla el proceso de construcción usando un Builder.
 */
public class Director {
    private ProductoBuilder builder;

    public void setBuilder(ProductoBuilder builder) { this.builder = builder; }

    public Producto construirProducto(String nombre, double precio, int cantidad, String detalle) {
        builder.setNombre(nombre);
        builder.setPrecio(precio);
        builder.setCantidad(cantidad);
        builder.setDetalle(detalle);
        return builder.build();
    }
}

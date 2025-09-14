package com.inventario;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        // Singleton -> obtenemos la única instancia del inventario
        Inventario inventario = Inventario.getInstance();

        // Factory Method -> creamos productos usando la fábrica
        System.out.println("--- Creando productos con la Fábrica ---");
        Producto laptop = ProductoFactory.crearProducto("electronico", "Laptop", 1500.0, 10, "Dell");
        Producto mouse = ProductoFactory.crearProducto("oficina", "Mouse Pad", 10.0, 50, "Tela");
        Producto teclado = ProductoFactory.crearProducto("electronico", "Teclado Mecánico", 120.0, 15, "Logitech");

        inventario.agregarProducto(laptop);
        inventario.agregarProducto(mouse);
        inventario.agregarProducto(teclado);
        
        inventario.mostrarInventario();
        
        System.out.println("\n--- Usando el patrón Prototype para clonar un producto ---");
        // Prototype -> clonamos el producto 'laptop'
        Producto laptopClonada = laptop.clone();
        // Le cambiamos el stock y nombre para diferenciarlo
        laptopClonada.setCantidad(2);
        laptopClonada.nombre = "Laptop de Exhibición";

        // Agregamos el clon al inventario
        inventario.agregarProducto(laptopClonada);
        
        inventario.mostrarInventario();
    }
}
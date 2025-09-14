📦 Sistema de Inventario en Java con Patrones Creacionales
👥 Integrantes del grupo

Integrante 1 — Alejandro Ceron

Integrante 2 — usuario2



📌 Descripción del proyecto

Este proyecto consiste en un sistema de gestión de inventario implementado en Java (NetBeans) que permite registrar, gestionar y clonar productos de diferentes categorías.

El enfoque principal es demostrar el uso de patrones creacionales de diseño en un caso práctico.

🛠️ Patrones implementados

Singleton → Clase Inventario, asegura una sola instancia del inventario.

Prototype → Clase Producto y su método clone().

Factory Method → Clase ProductoFactory.

Abstract Factory → Interfaz FabricaProductos y fábricas concretas (FabricaElectronica, FabricaOficina).

Builder → ProductoBuilder, ProductoElectronicoBuilder, ProductoOficinaBuilder y Director.

📑 Diagrama UML

El diagrama completo se incluye en el informe y en los anexos del repositorio.

@startuml
class Producto {
  - nombre : String
  - precio : double
  - cantidad : int
  + mostrarDetalles()
  + clone() : Producto
}
class ProductoElectronico
class ProductoOficina
class ProductoFactory
class FabricaProductos
class FabricaElectronica
class FabricaOficina
class ProductoBuilder
class ProductoElectronicoBuilder
class ProductoOficinaBuilder
class Director
class Inventario
class Main

Producto <|-- ProductoElectronico
Producto <|-- ProductoOficina
ProductoFactory --> Producto
FabricaProductos <|.. FabricaElectronica
FabricaProductos <|.. FabricaOficina
ProductoElectronicoBuilder --> ProductoElectronico
ProductoOficinaBuilder --> ProductoOficina
Inventario o-- "*" Producto
Main --> Inventario
@enduml

📂 Estructura del proyecto
src/com/inventario/
 ├── Producto.java
 ├── ProductoElectronico.java
 ├── ProductoOficina.java
 ├── ProductoFactory.java
 ├── FabricaProductos.java
 ├── FabricaElectronica.java
 ├── FabricaOficina.java
 ├── ProductoBuilder.java
 ├── ProductoElectronicoBuilder.java
 ├── ProductoOficinaBuilder.java
 ├── Director.java
 ├── Inventario.java
 └── Main.java

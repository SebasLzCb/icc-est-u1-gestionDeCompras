# **Práctica de laboratorio 01: Diseño y desarrollo de una aplicación orientada a objetos utilizando Java**

## **Información General**

- **Título:** Sistema de Gestión de Compras ERP  
- **Número de práctica:** 1  
- **Asignatura:**
- Programación Orientada a Objetos  
- **Carrera:**
- Ingeniería en Ciencias de la Computación  
- **Estudiantes:**
- Sebastián Loza
- Ivanna Nievecela  
- **Fecha:**
- 28 de Abril del 2025  
- **Profesor:**
- Ing.Gabriel Alejandro Leon Paredes 

---

## 🎯 **Objetivo**

- Aplicar principios de **Programación Orientada a Objetos (POO)**.
- Diseñar un modelo lógico utilizando diagramas de clases.
- Desarrollar una solución realista que simule operaciones de un módulo de compras.
- Implementar y validar la lógica del sistema mediante un menú en línea de comandos.
- Colaborar en equipo y gestionar el código con **Git** y **GitHub**, mostrando evidencia del flujo de trabajo.

---

## **Descripción**

El sistema permite gestionar *proveedores*, *productos* y *solicitudes de compra*, cubriendo el ciclo completo desde el registro hasta la aprobación o rechazo de solicitudes. El sistema es modular, escalable y fácil de mantener.

Durante la ejecución se debe mostrar:

- El listado de proveedores, productos y solicitudes.
- El estado de las solicitudes (pendiente, aprobada, rechazada).
- El cálculo del total de las solicitudes de compra (precio unitario x cantidad).

---

## **Ejecución**

Para compilar y ejecutar el proyecto:

1. **Compilar el código**:
   ```bash
   javac Main.java
- Ejecutar la aplicación:
  ```bash
  java Main
  ```
Diagrama de Clases

(Espacio reservado para insertar el diagrama de clases)

Aquí debes subir el diagrama cuando subas tu repositorio en GitHub.

Estructura del Proyecto
``` plaintext
src/
 └── main/
      └── java/
           └── Erpcompras/
                ├── Models/
                │    ├── Producto.java (Clase abstracta)
                │    ├── ProductoSimple.java
                │    ├── ProductoDulce.java
                │    ├── ProductoCosmetico.java
                │    ├── ProductoPeriferico.java
                │    ├── Proveedor.java
                │    └── SolicitudCompra.java
                ├── util/
                │    ├── UnidadMedida.java (Enum)
                │    ├── EstadoSolicitud.java (Enum)
                │    └── Calculable.java (Interfaz funcional)
                └── MenuPrincipal.java (Menú interactivo)
```
## Relación entre Clases (Relaciones POO)

1. Producto (Clase abstracta)
   
Atributos genéricos: codigo, nombre, precio, unidadMedida.
``` plaintext
Herencia con:

- ProductoSimple
- ProductoDulce
- ProductoCosmetico
- ProductoPeriferico

Justificación: Se crea una clase abstracta para evitar duplicar atributos comunes entre tipos de productos.
```
2. ProductoSimple, ProductoDulce, ProductoCosmetico, ProductoPeriferico (Subclases)

Heredan todos los atributos de Producto.
Especialización: Permite agregar atributos propios de cada tipo de producto en el futuro.

3. Proveedor

Clase independiente que almacena información de proveedores.
Relación de Asociación: Cada producto puede estar asociado a un proveedor.

5. SolicitudCompra

Representa una solicitud de productos.
Relación de composición con Producto: Una solicitud depende de uno o más productos.
Usa EstadoSolicitud (enum) para definir su estado.

5. UnidadMedida (Enum)

Define las unidades disponibles: unidad, kilo, litro, caja.
Justificación: Usamos un Enum para evitar errores de escritura, normalizar las unidades y facilitar validaciones.

6. EstadoSolicitud (Enum)
   
Define los estados posibles de una solicitud: Pendiente, Aprobada, Rechazada.
Justificación: Controlar de forma segura los estados válidos de una solicitud, evitando cadenas de texto sueltas.

7. Calculable (Interfaz Funcional)
Interfaz que define un único método funcional para calcular el total de una solicitud:
``` plaintext
java
double calcularTotal();
``` 
Justificación: Permite aplicar programación funcional en Java (Lambda Expressions) para calcular totales de forma flexible.

## Menú de Opciones (Flujo General del Sistema)
Al ejecutar el programa, el usuario verá:

``` markdown
===== SISTEMA DE GESTIÓN DE COMPRAS ERP =====

1. Registrar proveedor
2. Registrar producto
3. Registrar solicitud de compra
4. Listar proveedores
5. Listar productos
6. Listar solicitudes de compra
7. Buscar proveedor por ID
8. Buscar producto por nombre
9. Buscar solicitud por número
13. Aprobar / Rechazar solicitud de compra
14. Calcular total de una solicitud
15. Salir

Seleccione una opción:
Cada opción ejecuta funciones que utilizan las clases y estructuras mencionadas.
``` 
## Tecnologías Utilizadas

- Java 24
- Git y GitHub
- IDE IntelliJ IDEA
- Principios de POO (abstracción, herencia, polimorfismo, encapsulamiento)
- Enums y Lambdas en Java

## Cómo Ejecutar el Proyecto
Clonar el repositorio:
``` bash
git clone <[URL_DEL_REPOSITORIO](https://github.com/SebasLzCb/icc-est-u1-gestionDeCompras.git)>
Abrir el proyecto en IntelliJ IDEA.
```

## Compilar el proyecto.

Ejecutar la clase Main.java.

Interactuar desde la consola.

## Consideraciones de Diseño
El sistema es escalable: Se pueden agregar más tipos de productos fácilmente.

Uso de enums: Mejora la robustez del sistema frente a errores de ingreso de datos.

Uso de interfaz funcional: Demuestra el uso de programación funcional en Java moderno.

Separación clara de modelos (Models) y utilidades (util).

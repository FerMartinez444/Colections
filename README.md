# Manejo de Colecciones en Java: Listas, Sets y Mapas

Este repositorio contiene la resolución del **Trabajo Práctico N°6** de la asignatura **Desarrollo de Software** (UTN FRM), enfocado en la selección y uso eficiente de estructuras de datos del Framework de Colecciones de Java.

## 📋 Descripción del Proyecto

El objetivo principal es comprender las diferencias conceptuales y prácticas entre las distintas interfaces de colecciones (`List`, `Set`, `Map`) y aplicar la más adecuada según los requerimientos de unicidad, ordenamiento y acceso a los datos.

### 🚀 Funcionalidades Implementadas

#### 1. Listas Ordenadas (`ArrayList`)
Se desarrolló el módulo de **Alumnos** para gestionar datos secuenciales:
- **Preservación del orden:** Se verificó que `ArrayList` mantiene el orden de inserción de los elementos.
- **Visualización:** Implementación de `toString()` para mostrar el estado de los objetos de forma legible al recorrer la lista.

#### 2. Unicidad y Hash (`HashSet`)
Se implementó la lógica de negocio para **Productos**, garantizando que no existan duplicados en el sistema:
- **Control de Duplicados:** Configuración de un `HashSet` que rechaza automáticamente objetos repetidos.
- **Identidad de Objeto:** Sobrescritura de los métodos `equals()` y `hashCode()` basada en el atributo `codigo`, definiendo el criterio de igualdad del negocio.

#### 3. Acceso Clave-Valor (`HashMap`)
Se utilizó un diccionario de datos para la gestión de **Cursos**:
- **Búsqueda Eficiente:** Recuperación de objetos `Curso` mediante un identificador único (clave) sin necesidad de iterar toda la colecció
- **Iteración Completa:** Recorrido del mapa utilizando `entrySet()` para procesar tanto las claves como los valores simultáneamente.

## 🛠️ Tecnologías

- **Lenguaje:** Java
- **Framework:** Java Collections API (`ArrayList`, `HashSet`, `HashMap`).
- **Conceptos:** POO, Sobrescritura (`Override`), Genéricos.

## 📌 Conclusiones de Aprendizaje

- La importancia de elegir `Set` sobre `List` cuando la integridad de los datos requiere evitar duplicados.
- Cómo la correcta implementación de `hashCode` es vital para el funcionamiento de las colecciones basadas en hash.
- La eficiencia de `Map` para búsquedas rápidas frente a recorridos secuenciales.

---
*Desarrollado por [Fernando Mrtinez] - Estudiante de Ingeniería en Sistemas de Información, UTN FRM.*

/*
# Práctica de Algoritmos de Ordenamiento

## 📌 Información General

- **Título:** Práctica de Algoritmos de Ordenamiento
- **Asignatura:** Estructura de Datos
- **Carrera:** Computación
- **Estudiante:** Jamileth Kumpanam
- **Fecha:** 31 de marzo de 2025
- **Profesor:** Ing. Pablo Torres

---

## 🛠️ Descripción

Este proyecto implementa y compara diferentes algoritmos de ordenamiento en Java, incluyendo:
- Método Burbuja
- Método Selección
- Método Inserción
- Método Burbuja Mejorado

Se permite elegir:
- Tipo de orden (Ascendente o Descendente).
- Visualización de pasos intermedios.
- Visualización del número de comparaciones y cambios.

---

## 🚀 Ejecución

Para ejecutar el proyecto:

1. Compila el código:
    ```bash
    javac App.java
    ```
2. Ejecuta la aplicación:
    ```bash
    java App
    ```

---

## 🧑‍💻 Ejemplo de Entrada

```plaintext
Seleccione el método de ordenamiento:
1. Burbuja
2. Selección
3. Inserción
4. Burbuja Mejorado
5. Salir

¿Desea ver los pasos? (true/false):
true

¿Desea ordenar ascendentemente (A) o descendentemente (D)?:
A
```
*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int[] arreglo2 = { 12, -7, 25, 0, -15, 33, 19, -22, 5, 48, -3, 27, -30, 14, 7, -1, 41, 20, -11, 8 };
        MetodoBurbuja metodoBurbuja = new MetodoBurbuja();
        MetodoSeleccion metodoSeleccion = new MetodoSeleccion();
        MetodoInsercion metodoInsercion = new MetodoInsercion();
        MetodoBurbujaMejorado metodoBurbujaMejorado = new MetodoBurbujaMejorado();

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Seleccione el método de ordenamiento:");
        System.out.println("1. Burbuja");
        System.out.println("2. Selección");
        System.out.println("3. Inserción");
        System.out.println("4. Burbuja Mejorado");
        System.out.println("5. Salir");
        int metodo = scanner.nextInt();

        if (metodo == 5) {
            System.out.println("Programa finalizado");
            scanner.close();
            return;
        }

        System.out.println("¿Desea ver los pasos? (true/false):");
        boolean conPasos = scanner.nextBoolean();

        System.out.println("¿Ordenar Ascendente (A) o Descendente (D)?:");
        String orden = scanner.next();
        boolean ascendente = orden.equalsIgnoreCase("A");

        // Copiar el arreglo original
        int[] arreglo = copiarArreglo(arreglo2);
        
        // Imprimir el arreglo original
        System.out.print("Arreglo original-> ");
        imprimirArreglo(arreglo2);

        switch (metodo) {
            case 1:
                System.out.println("\nMétodo Burbuja");
                metodoBurbuja.ordenar(arreglo2, ascendente, conPasos);
                break;
            case 2:
                System.out.println("\nMétodo Selección");
                metodoSeleccion.ordenar(arreglo2, ascendente);
                break;
            case 3:
                System.out.println("\nMétodo Inserción");
                metodoInsercion.ordenar(arreglo2, ascendente, conPasos);
                break;
            case 4:
                System.out.println("\nMétodo Burbuja Mejorado");
                metodoBurbujaMejorado.ordenar(arreglo2, ascendente, conPasos);
                break;
            default:
                System.out.println("Opción Incorrecta");
                break;
        }

        System.out.println("\nArreglo ordenado-> ");
        imprimirArreglo(arreglo2);
        scanner.close();
    }

    public static int[] copiarArreglo(int[] original) {
        int[] copia = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            copia[i] = original[i];
        }
        return copia;
    }

    public static void imprimirArreglo(int[] arreglo) {
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
public class MetodoInsercion {
    public void ordenar(int[] arreglo, boolean ascendente, boolean conPasos) {
        int contComparaciones = 0;
        int contCambios = 0;

        for (int i = 1; i < arreglo.length; i++) {
            int key = arreglo[i];
            int j = i - 1;

            while (j >= 0 && ((ascendente && arreglo[j] > key) || (!ascendente && arreglo[j] < key))) {
                contComparaciones++;
                System.out.println("Comparación " + (contComparaciones) + ": " + arreglo[j] + " " + (ascendente ? ">" : "<") + " " + key);
                arreglo[j + 1] = arreglo[j];
                contCambios++;
                System.out.println("Intercambio: " + arreglo[j + 1] + " <-> " + key);
                if (conPasos) {
                    System.out.print("Estado actual -> ");
                    imprimirArreglo(arreglo);
                }
                j--;
            }
           
            contComparaciones++;
            if (j >= 0) {
                System.out.println("Comparación " + (contComparaciones) + ": " + arreglo[j] + " " + (ascendente ? ">" : "<") + " " + key);
            }
            arreglo[j + 1] = key;

            if (conPasos) {
                System.out.print("Estado actual -> ");
                imprimirArreglo(arreglo);
            }
        }
        System.out.println("Comparaciones Totales -> " + contComparaciones);
        System.out.println("Cambios Totales -> " + contCambios);
    }

    public void imprimirArreglo(int[] arreglo) {
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
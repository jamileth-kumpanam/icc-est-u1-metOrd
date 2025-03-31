import javax.sound.sampled.SourceDataLine;

public class MetodoSeleccion {
    public void ordenar(int[] arreglo, boolean ascendente) {
        int n = arreglo.length;
        int contComparaciones = 0;
        int contCambios = 0;

        for (int i = 0; i < n - 1; i++) {
            int indice = i;
            for (int j = i + 1; j < n; j++) {
                contComparaciones++;
                if ((ascendente && arreglo[j] < arreglo[indice]) || (!ascendente && arreglo[j] > arreglo[indice])) {
                    indice = j;
                }
            }
            if (indice != i) {
                int temp = arreglo[i];
                arreglo[i] = arreglo[indice];
                arreglo[indice] = temp;
                contCambios++;
                System.out.println("Intercambio: " + arreglo[i] + " <-> " + arreglo[indice]);
            }
            if (contCambios > 0) {
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

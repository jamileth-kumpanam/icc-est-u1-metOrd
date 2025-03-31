import java.lang.ref.SoftReference;

public class MetodoBurbuja {
    public void ordenar(int[] arreglo, boolean ascendente, boolean conPasos) {
        int n = arreglo.length;
        int contComparaciones = 0;
        int contCambios = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                contComparaciones++;
                if ((ascendente && arreglo[j] > arreglo[j + 1]) || (!ascendente && arreglo[j] < arreglo[j + 1])) {
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                    contCambios++;
                    System.out.println("Intercambio: " + arreglo[j] + " <-> " + arreglo[j + 1]);
                }
                if (conPasos) {
                    System.out.print("Estado actual -> ");
                    imprimirArreglo(arreglo);
                }
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

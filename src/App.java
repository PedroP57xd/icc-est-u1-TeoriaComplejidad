public class App {
    
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        // Ejemplo O(1)
        System.out.println("O(1): " + constante(arr));

        // Ejemplo O(n)
        System.out.println("\nO(n):");
        lineal(arr);

        // Ejemplo O(n^2)
        System.out.println("\nO(n^2):");
        cuadratica(arr);

        // Ejemplo O(log n)
        System.out.println("\nO(log n): " + logaritmica(arr, 4));

        // Ejemplo O(n log n)
        System.out.println("\nO(n log n):");
        int[] ordenado = mergeSort(arr);
        for (int n : ordenado) {
            System.out.print(n + " ");
        }
    }

    // ---------------------------------------------
    // O(1) – Tiempo constante
    // ---------------------------------------------
    public static int constante(int[] arr) {
        return arr[0];  // Siempre tarda lo mismo
    }

    // ---------------------------------------------
    // O(n) – Tiempo lineal
    // ---------------------------------------------
    public static void lineal(int[] arr) {
        for (int num : arr) {
            System.out.println(num);
        }
    }

    // ---------------------------------------------
    // O(n²) – Tiempo cuadrático
    // ---------------------------------------------
    public static void cuadratica(int[] arr) {
        for (int i : arr) {
            for (int j : arr) {
                System.out.println(i + ", " + j);
            }
        }
    }

    // ---------------------------------------------
    // O(log n) – Tiempo logarítmico
    // ---------------------------------------------
    public static boolean logaritmica(int[] arr, int objetivo) {
        int inicio = 0;
        int fin = arr.length - 1;

        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;

            if (arr[medio] == objetivo) {
                return true;
            } else if (arr[medio] < objetivo) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }
        return false;
    }

    // ---------------------------------------------
    // O(n log n) – Merge Sort
    // ---------------------------------------------
    public static int[] mergeSort(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }

        int mid = arr.length / 2;
        int[] izquierda = java.util.Arrays.copyOfRange(arr, 0, mid);
        int[] derecha = java.util.Arrays.copyOfRange(arr, mid, arr.length);

        return merge(mergeSort(izquierda), mergeSort(derecha));
    }

    private static int[] merge(int[] a, int[] b) {
        int[] resultado = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                resultado[k++] = a[i++];
            } else {
                resultado[k++] = b[j++];
            }
        }

        while (i < a.length) resultado[k++] = a[i++];
        while (j < b.length) resultado[k++] = b[j++];

        return resultado;
    }
}

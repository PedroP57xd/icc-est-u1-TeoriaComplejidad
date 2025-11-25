public class ComplejidadLogaritmico {
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
}

public class ComplejidadCuadratico {
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
}

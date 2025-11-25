public class App {
    
    public static void main(String[] args) {
        ComplejidadConstante comConstante= new ComplejidadConstante();
        ComplejidadLineal comLineal = new ComplejidadLineal();
        ComplejidadCuadratico comCuadratico = new ComplejidadCuadratico();
        ComplejidadLogaritmico comLogaritmico = new ComplejidadLogaritmico();
        ComplejidadMergeSort comMergeSort = new ComplejidadMergeSort();

        int[] arr = {1, 2, 3, 4, 5};

        // Ejemplo O(1)
        System.out.println("O(1): " + comConstante.constante(arr));

        // Ejemplo O(n)
        System.out.println("\nO(n):");
        comLineal.lineal(arr);

        // Ejemplo O(n^2)
        System.out.println("\nO(n^2):");
        comCuadratico.cuadratica(arr);

        // Ejemplo O(log n)
        System.out.println("\nO(log n): " + comLogaritmico.logaritmica(arr, 4));

        // Ejemplo O(n log n)
        System.out.println("\nO(n log n):");
        int[] ordenado = comMergeSort.mergeSort(arr);
        for (int n : ordenado) {
            System.out.print(n + " ");
        }
    }


}

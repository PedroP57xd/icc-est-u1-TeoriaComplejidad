public class ComplejidadMergeSort {
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

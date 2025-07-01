import java.util.Arrays;
import java.util.Random;

public class MergeSortFinal {

    // Fungsi utama untuk menjalankan
    public static void main(String[] args) {
        runAndMeasure(10);     // Data kecil
        runAndMeasure(1000);   // Data besar

        // Info tambahan untuk pengisian sheet
        System.out.println("\nNama Algoritma: Merge Sort");
        System.out.println("Notasi Big O: O(n log n)");
    }

    // Fungsi untuk menjalankan sort dan mengukur waktu
    public static void runAndMeasure(int size) {
        int[] data = generateRandomArray(size);
        System.out.println("\nUkuran Data: " + size);

        System.out.print("Data Awal: ");
        printLimitedArray(data);

        long startTime = System.nanoTime();
        mergeSort(data);
        long endTime = System.nanoTime();

        System.out.print("Data Terurut: ");
        printLimitedArray(data);

        double duration = (endTime - startTime) / 1_000_000_000.0;
        System.out.printf("Durasi Eksekusi: %.4f detik%n", duration);
    }

    // Fungsi untuk membatasi cetak array maksimal 10 elemen
    public static void printLimitedArray(int[] array) {
        System.out.print("[");
        int limit = 10;
        for (int i = 0; i < Math.min(limit, array.length); i++) {
            System.out.print(array[i]);
            if (i < limit - 1 && i < array.length - 1) {
                System.out.print(", ");
            }
        }
        if (array.length > limit) {
            System.out.print(", ...");
        }
        System.out.println("]");
    }

    // Fungsi untuk generate data random
    public static int[] generateRandomArray(int size) {
        Random rand = new Random();
        int[] data = new int[size];
        for (int i = 0; i < size; i++) {
            data[i] = rand.nextInt(1000); // Angka antara 0 - 999
        }
        return data;
    }

    // Merge Sort
    public static void mergeSort(int[] array) {
        if (array.length <= 1) return;
        int mid = array.length / 2;

        int[] left = Arrays.copyOfRange(array, 0, mid);
        int[] right = Arrays.copyOfRange(array, mid, array.length);

        mergeSort(left);
        mergeSort(right);
        merge(array, left, right);
    }

    // Proses merge array
    public static void merge(int[] array, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            array[k++] = (left[i] < right[j]) ? left[i++] : right[j++];
        }
        while (i < left.length) {
            array[k++] = left[i++];
        }
        while (j < right.length) {
            array[k++] = right[j++];
        }
    }
}

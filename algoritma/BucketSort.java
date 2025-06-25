import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {

    // Fungsi utama Bucket Sort
    public static void bucketSort(float[] arr) {
        int n = arr.length;

        if (n <= 0)
            return;

        // 1. Buat bucket kosong (ArrayList)
        @SuppressWarnings("unchecked")
        ArrayList<Float>[] buckets = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            buckets[i] = new ArrayList<>();
        }

        // 2. Masukkan elemen ke bucket sesuai nilainya
        for (float value : arr) {
            int bucketIndex = (int) (value * n);  // indeks bucket
            buckets[bucketIndex].add(value);
        }

        // 3. Sortir tiap bucket (pakai Collections.sort)
        for (ArrayList<Float> bucket : buckets) {
            Collections.sort(bucket);
        }

        // 4. Gabungkan semua bucket menjadi satu array hasil
        int index = 0;
        for (ArrayList<Float> bucket : buckets) {
            for (float num : bucket) {
                arr[index++] = num;
            }
        }
    }

    // Fungsi utama (main)
    public static void main(String[] args) {
        float[] data = {0.78f, 0.17f, 0.39f, 0.26f, 0.72f, 0.94f, 0.21f, 0.12f, 0.23f, 0.68f};

        System.out.println("Array sebelum sorting:");
        printArray(data);

        bucketSort(data);

        System.out.println("\nArray setelah Bucket Sort:");
        printArray(data);
    }

    // Fungsi bantu mencetak array
    public static void printArray(float[] arr) {
        for (float num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

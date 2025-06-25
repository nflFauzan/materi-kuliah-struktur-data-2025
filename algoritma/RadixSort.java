import java.util.Arrays;

public class RadixSort {

    // Fungsi utama radix sort
    public static void radixSort(int[] arr) {
        if (arr.length == 0) return;

        // Cari nilai maksimum (untuk mengetahui jumlah digit)
        int max = getMax(arr);

        // Lakukan counting sort untuk setiap digit (1s, 10s, 100s, ...)
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSortByDigit(arr, exp);
        }
    }

    // Fungsi untuk mendapatkan nilai maksimum dalam array
    private static int getMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
        }
        return max;
    }

    // Counting sort berdasarkan digit ke-exp (satuan, puluhan, dll)
    private static void countingSortByDigit(int[] arr, int exp) {
        int n = arr.length;
        int[] output = new int[n];       // Array hasil sortir sementara
        int[] count = new int[10];       // Karena digit hanya dari 0–9

        // Hitung frekuensi digit ke-exp
        for (int num : arr) {
            int digit = (num / exp) % 10;
            count[digit]++;
        }

        // Ubah count[i] sehingga berisi posisi akhir dari digit i
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // Bangun output array secara stabil (mulai dari kanan)
        for (int i = n - 1; i >= 0; i--) {
            int digit = (arr[i] / exp) % 10;
            output[count[digit] - 1] = arr[i];
            count[digit]--;
        }

        // Salin hasil sortir ke array asli
        System.arraycopy(output, 0, arr, 0, n);
    }

    // Fungsi utama untuk menjalankan program
    public static void main(String[] args) {
        int[] data = {170, 45, 75, 90, 802, 24, 2, 66};

        System.out.println("Array sebelum sorting:");
        System.out.println(Arrays.toString(data));

        radixSort(data);

        System.out.println("\nArray setelah Radix Sort:");
        System.out.println(Arrays.toString(data));
    }
}

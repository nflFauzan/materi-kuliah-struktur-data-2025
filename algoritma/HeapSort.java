public class HeapSort {

    // Fungsi utama untuk melakukan heap sort
    public static void heapSort(int[] arr) {
        int n = arr.length;

        // Bangun max heap (urutan menurun) dari array
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Ekstrak elemen satu per satu dari heap
        for (int i = n - 1; i > 0; i--) {
            // Pindahkan root (maksimum) ke akhir array
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Heapify kembali sisa elemen
            heapify(arr, i, 0);
        }
    }

    // Fungsi untuk menjaga properti heap
    public static void heapify(int[] arr, int n, int i) {
        int largest = i;         // Anggap root sebagai yang terbesar
        int left = 2 * i + 1;    // Indeks anak kiri
        int right = 2 * i + 2;   // Indeks anak kanan

        // Jika anak kiri lebih besar dari root
        if (left < n && arr[left] > arr[largest])
            largest = left;

        // Jika anak kanan lebih besar dari yang terbesar saat ini
        if (right < n && arr[right] > arr[largest])
            largest = right;

        // Jika root bukan yang terbesar, tukar dan heapify rekursif
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Rekursif heapify sub-tree yang terdampak
            heapify(arr, n, largest);
        }
    }

    // Fungsi utama untuk menjalankan program
    public static void main(String[] args) {
        int[] data = {12, 11, 13, 5, 6, 7};

        System.out.println("Array sebelum sorting:");
        printArray(data);

        heapSort(data);

        System.out.println("\nArray setelah Heap Sort:");
        printArray(data);
    }

    // Fungsi bantu untuk mencetak array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

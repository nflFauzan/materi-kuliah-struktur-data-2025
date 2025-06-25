public class QuickSort {
    // Fungsi utama Quick Sort
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Temukan posisi pivot yang tepat
            int pi = partition(arr, low, high);

            // Rekursif untuk bagian kiri dan kanan pivot
            quickSort(arr, low, pi - 1);   // kiri pivot
            quickSort(arr, pi + 1, high);  // kanan pivot
        }
    }

    // Fungsi untuk membagi array dan mengembalikan indeks pivot
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];  // Ambil elemen terakhir sebagai pivot
        int i = low - 1;        // Indeks elemen yang lebih kecil dari pivot

        for (int j = low; j < high; j++) {
            // Jika elemen lebih kecil dari pivot, tukar
            if (arr[j] < pivot) {
                i++;
                // Tukar arr[i] dan arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Tempatkan pivot di posisi yang benar
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;  // Kembalikan indeks pivot
    }

    // Fungsi utama (main)
    public static void main(String[] args) {
        int[] data = {10, 7, 8, 9, 1, 5};

        System.out.println("Array sebelum sorting:");
        printArray(data);

        quickSort(data, 0, data.length - 1);

        System.out.println("\nArray setelah Quick Sort:");
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

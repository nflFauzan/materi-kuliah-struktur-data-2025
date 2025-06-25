public class MergeSort {
    // Fungsi utama merge sort
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            // Cari titik tengah array
            int mid = (left + right) / 2;

            // Rekursif untuk membagi bagian kiri dan kanan
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            // Gabungkan dua bagian yang telah diurutkan
            merge(arr, left, mid, right);
        }
    }

    // Fungsi untuk menggabungkan dua bagian array yang sudah terurut
    public static void merge(int[] arr, int left, int mid, int right) {
        // Hitung panjang array kiri dan kanan
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Buat array sementara untuk menyimpan data
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Salin data ke array sementara
        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        // Gabungkan kembali ke array utama
        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }

        // Salin sisa elemen jika ada
        while (i < n1) {
            arr[k++] = L[i++];
        }
        while (j < n2) {
            arr[k++] = R[j++];
        }
    }

    // Fungsi utama untuk menjalankan program
    public static void main(String[] args) {
        int[] data = {38, 27, 43, 3, 9, 82, 10};

        System.out.println("Array sebelum sorting:");
        printArray(data);

        mergeSort(data, 0, data.length - 1);

        System.out.println("\nArray setelah Merge Sort:");
        printArray(data);
    }

    // Fungsi untuk mencetak array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

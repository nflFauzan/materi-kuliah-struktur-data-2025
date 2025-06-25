public class SelectionSort {
    // Fungsi untuk melakukan selection sort
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // Pindahkan batas array yang belum diurutkan satu per satu
        for (int i = 0; i < n - 1; i++) {
            // Anggap elemen pertama dari bagian yang belum terurut adalah yang terkecil
            int minIndex = i;

            // Cari elemen terkecil di sisa array
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Tukar elemen terkecil dengan elemen pertama dari bagian yang belum terurut
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

    // Fungsi utama
    public static void main(String[] args) {
        int[] data = {64, 25, 12, 22, 11};

        System.out.println("Array sebelum sorting:");
        printArray(data);

        selectionSort(data);

        System.out.println("\nArray setelah Selection Sort:");
        printArray(data);
    }

    // Fungsi bantu untuk mencetak array
    public static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}

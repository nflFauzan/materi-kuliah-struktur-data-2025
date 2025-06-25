public class BubbleSort {
    // Fungsi untuk melakukan bubble sort pada array
    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        // Loop untuk tiap elemen dalam array
        for (int i = 0; i < n - 1; i++) {
            // Flag untuk mengecek apakah ada pertukaran
            boolean swapped = false;

            // Loop membandingkan elemen bersebelahan
            for (int j = 0; j < n - 1 - i; j++) {
                // Jika elemen kiri lebih besar, tukar posisi
                if (arr[j] > arr[j + 1]) {
                    // Pertukaran menggunakan variabel sementara
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

            // Jika tidak ada pertukaran, array sudah terurut
            if (!swapped) break;
        }
    }

    // Fungsi utama (main method)
    public static void main(String[] args) {
        int[] data = {5, 2, 9, 1, 5, 6};

        System.out.println("Array sebelum sorting:");
        printArray(data);

        bubbleSort(data);

        System.out.println("\nArray setelah Bubble Sort:");
        printArray(data);
    }

    // Fungsi untuk mencetak isi array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

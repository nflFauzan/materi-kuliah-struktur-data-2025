public class InsertionSort {
    // Fungsi untuk melakukan insertion sort pada array
    public static void insertionSort(int[] arr) {
        int n = arr.length;

        // Mulai dari elemen kedua karena elemen pertama dianggap sudah terurut
        for (int i = 1; i < n; i++) {
            int key = arr[i];     // Simpan elemen yang akan disisipkan
            int j = i - 1;

            // Geser elemen yang lebih besar dari key ke kanan
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j]; // Geser ke kanan
                j--;
            }

            // Tempatkan key di posisi yang tepat
            arr[j + 1] = key;
        }
    }

    // Fungsi utama
    public static void main(String[] args) {
        int[] data = {8, 4, 2, 9, 1};

        System.out.println("Array sebelum sorting:");
        printArray(data);

        insertionSort(data);

        System.out.println("\nArray setelah Insertion Sort:");
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
